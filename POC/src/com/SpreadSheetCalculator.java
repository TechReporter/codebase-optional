package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author 212720190
 * @date Jan 15, 2019
 */
public class SpreadSheetCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStream file = new FileInputStream("src/com/aa.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

			Sheet spreadSheet = workbook.getSheetAt(0);
			for(Row dataRow :  spreadSheet) {
				if(dataRow.getCell(1)!=null)
				dataRow.removeCell(dataRow.getCell(1));
				for(Cell cellData : dataRow) {

					if(cellData.getStringCellValue().matches("[A-Z](.*)")) {
						CellReference cellReference = new CellReference(cellData.getStringCellValue());
						Row row = spreadSheet.getRow(cellReference.getRow());
						Cell cell = row.getCell(cellReference.getCol());
						CellValue cellValue = evaluator.evaluate(cell);
						dataRow.createCell(1)
						.setCellValue(calculateExpression(cellValue.getStringValue()));
					}
					else {
						dataRow.createCell(1)
						.setCellValue(calculateExpression(cellData.getStringCellValue()));
					}
				}
				 try (OutputStream fileOut = new FileOutputStream("src/com/aa.xlsx")) {
				        workbook.write(fileOut);
				    }
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static int calculateExpression(String str) {
		Stack<Integer> sValue = new Stack<>();
		
		char[] charData = str.toCharArray();
		
		for(int i = 0; i<charData.length; i++) {
			if(Character.isDigit(charData[i])) {
				sValue.push(charData[i] -'0');
			}
				else if(charData[i] == '+' || charData[i] == '-' ||
						charData[i] == '*' || charData[i] == '/') {
					
					int fValue = sValue.pop();
					int sndValue = sValue.pop();
					
					switch (charData[i]) {
						
					case '+': sValue.push(fValue + sndValue);
						break;
					case '-': sValue.push(sndValue - fValue);
						break;
					case '*': sValue.push(sndValue * fValue);
						break;
					case '/': sValue.push(sndValue / fValue);
						break;
					default:
						break;
					}
				}
			}
		System.out.println("result=="+sValue.peek());
		return sValue.pop();
			
		}

}
