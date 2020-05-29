/**
 * 
 */
package excelUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author 212720190
 * @date Mar 30, 2019
 */

public class CustomExcelWriter {

	public static void main(String[] args) {
		List<AdressDetails> dataList = Arrays.asList(new AdressDetails("bangalore", "hyderabad", 
						Arrays.asList(new PermAddress("karunashree pg", "sarjapur road", "bellandur"),
								new PermAddress("rmz ecoworld", "hoodi circle", "bellandur")), 
						Arrays.asList(new TempAddress("waverock", "microsoft office"),
								new TempAddress("q circle", "wipro ofc"))),
				
				new AdressDetails("kolkata", "hooghly", 
						Arrays.asList(new PermAddress("akankhsha", "saltlake road", "saltlake"),
								new PermAddress("mohorkunj", "nandan road", "dhakuria")), 
						Arrays.asList(new TempAddress("lakhotia", "tn mukerjee road"),
								new TempAddress("lakhotia", "dankuni"))));
		

		Employee emp = new Employee(1, "tanmoy", "fattu ladka", dataList);
		
		List<AdressDetails> dataList1 = Arrays.asList(new AdressDetails("pune", "banalore", 
				Arrays.asList(new PermAddress("pune road", "road pune", "accenture"),
						new PermAddress("flat22", "hinjelwadi", "tcs ofc")), 
				Arrays.asList(new TempAddress("scb", "bellandur"),
						new TempAddress("sarjapur", "road22"))),
		
		new AdressDetails("bihar", "samastipur", 
				Arrays.asList(new PermAddress("bhabi jindabaad", "meri pyari bhabi", "sanam re"),
						new PermAddress("bhai ki shaadi", "laga chunri me daag", "sholay")), 
				Arrays.asList(new TempAddress("baap hun mein", "accenture bhai"),
						new TempAddress("bhai baana tech lead", "paisa ka barish"))));

Employee emp1 = new Employee(2, "Durgesh sir", "architect", dataList1);

List<AdressDetails> dataList2 = Arrays.asList(new AdressDetails("singapore", "jadavpur", 
		Arrays.asList(), 
		Arrays.asList(new TempAddress("clg steet", "tyangra"),
				new TempAddress("test11", "road test22"))));


Employee emp2 = new Employee(3, "sukalpo bhai", "solution architect", dataList2);

		List<Employee> empList = Arrays.asList(emp,emp1,emp2);

		String[] permAddressHeader = {"Name", "flat", "road", "area"};
		String[] tempAddressHeader = {"Name", "flat", "road"};
		createDataSheet(empList,permAddressHeader,tempAddressHeader);
	}

	private static void createDataSheet(List<Employee> empList, String[] permColHeader, String[] tempColHeader) {
		FileOutputStream fileOut = null;
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Employee");
		
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		String[] parentColHeader = {"emp id","emp Name", "emp designation"};

		int rowNum = 0;
		for(Employee emp : empList) {
			Map<String, List<PermAddress>> permAddrData = new HashMap<>();
			Map<String, List<TempAddress>> tempAddrData = new HashMap<>();

			for(AdressDetails temp : emp.getAddress()) {
				permAddrData.put(temp.getPermName(), temp.getPermAddress());
				tempAddrData.put(temp.getTempName(), temp.getTempAddress());
			}
			Row header = sheet.createRow(rowNum++);
			for(int i = 0; i<parentColHeader.length; i++) {
				Cell cell = header.createCell(i, CellType.STRING);
				cell.setCellValue(parentColHeader[i]);
				cell.setCellStyle(headerCellStyle);
			}
			int cellNum = 0;
			header = sheet.createRow(rowNum++);
			header.createCell(cellNum++).setCellValue(emp.getEmpId());
			header.createCell(cellNum++).setCellValue(emp.getEmpName());
			header.createCell(cellNum++).setCellValue(emp.getEmpDesignation());
			
			header = sheet.createRow(rowNum++);
			header.createCell(0).setCellValue("Permanent address");
			sheet.addMergedRegion(new CellRangeAddress(rowNum-1,rowNum-1, 0,5));
			header = sheet.createRow(rowNum++);
			
			for(int i = 0; i<permColHeader.length; i++) {
				Cell cell = header.createCell(i, CellType.STRING);
				cell.setCellValue(permColHeader[i]);
				cell.setCellStyle(headerCellStyle);
			}
			
			//createAddressTable(permAddrData,rowNum,header);
			
			
			if(Optional.ofNullable(permAddrData).isPresent()) {
				for(Map.Entry<String, List<PermAddress>> entry : permAddrData.entrySet()) {
					List<PermAddress> dataObj = permAddrData.get(entry.getKey());
					 header = sheet.createRow(rowNum++);
					 header.createCell(0).setCellValue(entry.getKey());
					sheet.addMergedRegion(new CellRangeAddress(rowNum-1, dataObj.size()+rowNum-2, 0,0));
					for(PermAddress obj : dataObj) {
						int cellNum1 = 0;
						header.createCell(++cellNum1).setCellValue(obj.getFlat());
						header.createCell(++cellNum1).setCellValue(obj.getRoad());
						header.createCell(++cellNum1).setCellValue(obj.getArea());
						header = sheet.createRow(rowNum++);
					}
					rowNum--;
				}	
			}
			
			header = sheet.createRow(rowNum++);
			header.createCell(0).setCellValue("Temporary address");
			sheet.addMergedRegion(new CellRangeAddress(rowNum-1,rowNum-1, 0,5));
			header = sheet.createRow(rowNum++);
			
			for(int i = 0; i<tempColHeader.length; i++) {
				Cell cell = header.createCell(i, CellType.STRING);
				cell.setCellValue(tempColHeader[i]);
				cell.setCellStyle(headerCellStyle);
			}
			
			//createAddressTable(tempAddrData,rowNum,header);

			for(Map.Entry<String, List<TempAddress>> entry : tempAddrData.entrySet()) {
				List<TempAddress> dataObj = tempAddrData.get(entry.getKey());
				 header = sheet.createRow(rowNum++);
				 header.createCell(0).setCellValue(entry.getKey());
				sheet.addMergedRegion(new CellRangeAddress(rowNum-1, dataObj.size()+rowNum-2, 0,0));
				for(TempAddress obj : dataObj) {
					int cellNum1 = 0;
					header.createCell(++cellNum1).setCellValue(obj.getFlat());
					header.createCell(++cellNum1).setCellValue(obj.getRoad());
					header = sheet.createRow(rowNum++);
				}
				rowNum--;
			}
		}
		try {
			fileOut = new FileOutputStream(new File("data.xlsx"));
			try {	
				workbook.write(fileOut);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fileOut.close();
				workbook.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
