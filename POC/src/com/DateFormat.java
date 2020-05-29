/**
 * 
 */
package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 212720190
 * @date Apr 10, 2019
 */
public class DateFormat {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		String str = "12/03/2015 00:00:00";
		Date tempDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(str);
		System.out.println(tempDate);
		
	}

}
