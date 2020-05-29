/**
 * 
 */
package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author 212720190
 * @date Mar 28, 2019
 */
public class MinScheduleDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ParseException {

		List<MaterialTypeLocomotiveDetails> list = Arrays.asList(new MaterialTypeLocomotiveDetails(1L,
				2L,
				utilDateToGregorianCalendar(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/1999"))),
				new MaterialTypeLocomotiveDetails(1L,
						2L,
						utilDateToGregorianCalendar(new SimpleDateFormat("dd/MM/yyyy").parse("02/12/1999"))),
				new MaterialTypeLocomotiveDetails(1L,
						2L,
						utilDateToGregorianCalendar(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2017"))),
				new MaterialTypeLocomotiveDetails(1L,
						2L,
						utilDateToGregorianCalendar(new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1999"))));
	
		Collections.sort(list, (o1,o2) -> o1.getCoScheduleDate().compare(o2.getCoScheduleDate()));
		
		//System.out.println(list.get(0));
		
		//list.stream().min((o1,o2) -> o1.getCoScheduleDate().compare(o2.getCoScheduleDate()));
		
		System.out.println(Collections.min(list, (o1,o2) -> 
		o1.getCoScheduleDate().compare(o2.getCoScheduleDate())));

	}
	
	
	
	public static XMLGregorianCalendar utilDateToGregorianCalendar(Date date) {
		GregorianCalendar gc = new GregorianCalendar(); 
		XMLGregorianCalendar gregorianDate =  null;
		gc.setTime(date);
		try {
			gregorianDate =  DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (DatatypeConfigurationException e) {
			//Logger.error("Exception has occurred while convert date ::" +e);
		}
		return gregorianDate;
	}
	
	public static Date gregorianCalendarToutilDate(XMLGregorianCalendar date) {
		Date gregorianDate =  null;
		gregorianDate = date.toGregorianCalendar().getTime();
		return gregorianDate;
	}

}
