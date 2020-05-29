/**
 * 
 */
package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.sound.midi.Soundbank;

import org.apache.poi.util.StringUtil;

/**
 * @author 212720190
 * @date Dec 3, 2019
 */
public class DateTest {
int x=0;
	public static void main(String[] args) throws ParseException {
		
		Properties p = System.getProperties();
		p.setProperty("val", "dog");
		String s = p.getProperty("sds")+" ";
		s+=p.getProperty("val");
		System.out.println(Integer.parseInt(s));
		
		/*
		
		int x=6,y=4,k=9;
		change(x,y,k);
		System.out.println(k);
		
		
		
try {
	int x=0;
	for(x=1; x<4;x++) {
	System.out.println(x);
	} 
}catch(Exception x) {
	
} finally {
	System.out.println("dd");
}
		
		
		String a ="abc";
		String b = "abc";
		String aa = new String("abc");
		String bb=  new String("abc");
		System.out.println(a==b);
		System.out.println(a==aa);
		System.out.println(aa==bb);
		//test();
		change(aa);
		System.out.println(aa);

	*/}
	
	

	
	static void change(int a, int b, int c) {
		
		if(a==5) {
			c=b;
		} else {
			c=a;
		}
	}
	
	private static void test() throws ParseException {/*
		String existing = "2019-12-05 12:11:23";
		Date sysdate = new Date();
		String passDate = "2019-12-04 12:44:11";


		String toDate = getDateAsGivenFormat(sysdate, "yyyy-MM-dd hh:mm:ss");

		
		if(!dateIsEqual(getStringToDateAsGivenFormat(passDate, "yyyy-MM-dd hh:mm:ss"),
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(toDate)) 
				&& dateIsBefore(getStringToDateAsGivenFormat(toDate, "yyyy-MM-dd hh:mm:ss"),
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(passDate))
					) {
			System.out.println("ssd");
		}
		
			
		if(dateIsBefore(getStringToDateAsGivenFormat(toDate, "yyyy-MM-dd hh:mm:ss"),
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(existing))) {
			if(dateIsBefore(getStringToDateAsGivenFormat(existing, "yyyy-MM-dd hh:mm:ss"),
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(passDate))
					&& !dateIsEqual(getStringToDateAsGivenFormat(existing, "yyyy-MM-dd hh:mm:ss"),
							new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(passDate))) {
				System.out.println("error past");
			}
		}
		else if(
				&& dateIsBefore(getStringToDateAsGivenFormat(toDate, "yyyy-MM-dd hh:mm:ss"),
						new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(passDate))) {
			System.out.println("error future");
		}
	*/}


	public static boolean dateIsBefore(Date startDate, Date endDate) {
		boolean dateIsBefore = false;

		Instant instant1 = Instant.ofEpochMilli(startDate.getTime());
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()); 
		LocalDate startDateAsLocalDate = localDateTime1.toLocalDate();

		Instant instant2 = Instant.ofEpochMilli(endDate.getTime());
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault()); 
		LocalDate endDateAsLocalDate = localDateTime2.toLocalDate();

		if (endDateAsLocalDate.isBefore(startDateAsLocalDate)) {
			dateIsBefore = true;
		}

		return dateIsBefore;
	}



	public static Date getStringToDateAsGivenFormat(String date,String pattern) {
		if (null != date) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				return sdf.parse(date);
			} catch (ParseException e) {
				System.out.println(":: Date PareException :: "+e);
			}
		}
		return null;
	}

	public static boolean dateIsEqual(Date startDate, Date endDate) {
		boolean dateEqual = false;

		Instant instant1 = Instant.ofEpochMilli(startDate.getTime());
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()); 
		LocalDate startDateAsLocalDate = localDateTime1.toLocalDate();

		Instant instant2 = Instant.ofEpochMilli(endDate.getTime());
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault()); 
		LocalDate endDateAsLocalDate = localDateTime2.toLocalDate();

		if (endDateAsLocalDate.isEqual(startDateAsLocalDate)) {
			dateEqual = true;
		}

		return dateEqual;
	}

	public static String getDateAsGivenFormat(Date date,String pattern) {
		if (null != date) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.format(date);
		}
		return null;
	}

	public static boolean dateCompare(String date1, String date2) throws ParseException {
		boolean dateCheck = false;
		if (dateIsBefore(getStringToDateAsGivenFormat(date1, "yyyy-MM-dd hh:mm:ss"),
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date2))
				&& dateIsEqual(getStringToDateAsGivenFormat(date1, "yyyy-MM-dd hh:mm:ss"),
						new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date2))) {
			return true;
		}
		return dateCheck;
	}


}
