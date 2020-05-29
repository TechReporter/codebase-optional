/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * @author 212720190
 * @date Apr 4, 2019
 */
public class FetchexcelData {


	public static void main(String[] args) throws FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException {
      //  Workbook workbook = WorkbookFactory.create(new File("src/com/UP.csv"));

		List<List<String>> list = new ArrayList<>();
      try(BufferedReader bf =  new BufferedReader(new FileReader("src/com/UP.csv"))) {
    	  
    	  String line;
    	  while((line = bf.readLine()) != null) {
    		  //line = bf.readLine().trim();
    		 /* if(!line.contains("<?xml version = '1.0'?>"))
    		  line = line.concat(line);
    		  line.trim();*/
    		  System.out.println("line ::: "+line);
    		  String[] str = line.split(",");
    		  list.add(Arrays.asList(str));
    	  }
      }
      
      list.forEach(e-> {
    	  e.forEach(s-> {
    		  System.out.println(s);
    		  System.out.println("===============");
    	  });
      });
	}

}
