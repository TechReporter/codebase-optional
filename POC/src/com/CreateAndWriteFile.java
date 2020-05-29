/**
 * 
 */
package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Oct 23, 2018
 */
public class CreateAndWriteFile {

	public static void main(String[] args) {
		createWriteFile();
		deleteFile();


/*			try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\212720190\\outputDir\\file.txt"))) {

				String content = "This is the content to write into file\n";

				bw.write(content);
				
				// no need to close it.
				//bw.close();

				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			}*/

	}
	
	private static void createWriteFile() {
		
		List<String> listData = Arrays.asList("data1","data2",
				"data3");

		List<Employee> Data = Arrays.asList(new Employee("1", "tANMOY", "dankuni"),
				new Employee("11", "mahni11", "kolkata"),
				new Employee("12", "taaaaa", "wbbb"),
				new Employee("13", "sanjiy", "blore"));
		List<String> newlist = new ArrayList<>();
		newlist.add("*****************************************************************************************\r\n"
				+"    UP Expected software not in GE database - "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM dd - h:mm a"))+"\r\n"
				+"*****************************************************************************************\r\n");
		
		for(Employee data : Data) {
			newlist.add(data.getId() + " "+data.getName()+"--"+" "+data.getAddr());
		}
		
		try {
				Files.write(Paths.get("C://Users//212720190//outputDir//eservice.txt"),
						newlist, getOptionList());
				System.out.println("write in file successfully....");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//----------------------------------
		
		
		try(BufferedWriter dataWrite = new BufferedWriter(new FileWriter("C:\\Users\\212720190\\outputDir\\file.txt"))) {
			
			dataWrite.write("*****************************************************************************************\r\n");
			dataWrite.write("    UP Expected software not in GE database - "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM dd - h:mm a"))+"\r\n");
			dataWrite.write("*****************************************************************************************\r\n");
			
			for(int i = 0; i<newlist.size(); i++) {
				dataWrite.write((String) newlist.get(i));
				dataWrite.write("\r\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static OpenOption[] getOptionList() {
		OpenOption[] options = {};
		if(!Files.exists(Paths.get("C://Users//212720190//outputDir//eservice.txt"),
				LinkOption.NOFOLLOW_LINKS)) {
			options = new OpenOption[] { StandardOpenOption.CREATE};
		}
	
		return options;
	}	
	
	private static void deleteFile() {
		File files = new File("C://Users//212720190//outputDir");
		for(File eachFile : files.listFiles()) {
			if(eachFile.isFile() && eachFile.exists()) {
				long lastmodifiedFromNow = System.currentTimeMillis() - eachFile.lastModified();
				
				if(lastmodifiedFromNow > 24*60*60*1000)
					eachFile.delete();
			}
		}
	}

}
		