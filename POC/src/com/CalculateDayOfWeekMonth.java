/**
 * 
 */
package com;

import static java.time.temporal.ChronoField.DAY_OF_YEAR;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Jan 25, 2019
 */
public class CalculateDayOfWeekMonth {
	
	public static void main(String[] args) throws ParseException {
		
		List<Long> list = Arrays.asList(1L,2L,3L,6L,22L,54L,34L);
		List<Long> list1 = Arrays.asList(13L,2L,35L,6L,22L);

		
		List<Long> nonMaterialPositionList = list.stream()
				.filter(getmm(list1)).collect(Collectors.toList());
		

		nonMaterialPositionList.forEach(System.out::println);
		//getCurrentDate();
		//getFirstDayOfQuarter();
		//System.out.println(getCurrentMonth());
	}
	
	
	private static Predicate<Long> getmm(List<Long> list1) {
		
		Predicate<Long> predicate1 = str -> !list1.stream().collect(Collectors.toSet())
				.contains(str);
		return predicate1;
	}
	
	 static void getCurrentDate() {
		Calendar cal = Calendar.getInstance();

	    int day = cal.get(Calendar.DATE);
		cal.setTime(new Date());
		cal.set(Calendar.DAY_OF_WEEK, 1);
		System.out.println(day);

		if(day == (cal.get(Calendar.DATE)))
			System.out.println("equal");
		else {
			System.out.println("not equal");
		}
		System.out.println("get time :::"+cal.get(Calendar.DATE));		

		}
	 
		public static boolean getCurrentMonth() {
			Calendar cal = Calendar.getInstance();
			boolean isMonthlyFirstDay = false;
			int day = cal.get(Calendar.DATE);
			System.out.println(day);
			cal.setTime(new Date());
			cal.set(Calendar.DAY_OF_WEEK, 4);
			if(day == (cal.get(Calendar.DATE))) {
				isMonthlyFirstDay = true;
			}
			return isMonthlyFirstDay;
		}
	 
private static void getFirstDayOfQuarter() {
    Calendar cal = Calendar.getInstance();
    int day = cal.get(Calendar.DATE);
    System.out.println("fedfdf  "+day);
    cal.setTime(new Date());
    System.out.println("aaaaaaaa  "+cal.getTime());

    if(day == cal.get(Calendar.DATE)) {
    	System.out.println("equal");
    }
    System.out.println(cal.get(Calendar.DATE));
    System.out.println(cal.getTime());
}

private static void getFirstDayOfQuarter1() {

/*Calendar cal = Calendar.getInstance();
cal.set(Calendar.DAY_OF_YEAR, 1);
System.out.println(cal.getTime().toString());
cal.set(Calendar.DAY_OF_YEAR, 366); // for leap years
System.out.println(cal.getTime().toString());*/
	
	LocalDate now = LocalDate.now(); // 2015-11-23
	LocalDate firstDay = now.with(e -> e.with(DAY_OF_YEAR, 29)); // 2015-01-01
	System.out.println(firstDay.getDayOfYear());
	System.out.println(now.getDayOfYear());

	}

}


