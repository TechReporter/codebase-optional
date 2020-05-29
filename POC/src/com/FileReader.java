package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 212720190
 * @date May 15, 2019
 */
public class FileReader {

	public static void main(String[] args) throws IOException {
		String filePath = "src/com/newFile.txt";
		String path = "write.txt";

		File file = 
				new File(filePath); 
		Scanner sc = new Scanner(file); 
		Map<String,Integer> map = new HashMap<>();

		while (sc.hasNextLine()) {
			String str1 = sc.nextLine().split(" ")[0];
			if(map.get(str1)!=null) {
				map.put(str1, map.get(str1)+1);
			} else {
				map.put(str1,1);
			}
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter("record_"+path));
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			writer.write(entry.getKey()+" "+entry.getValue());
			writer.newLine();
		}  
		writer.close();
		sc.close();    
	}

}
