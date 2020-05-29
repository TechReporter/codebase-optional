/**
 * 
 */
package javaMisc;

import java.time.DayOfWeek;

/**
 * @author Tanmoy Dasgupta
 * @date Feb 4, 2020
 */
public class DayOfWeeksImpl {
	
	public static void main(String[] args) {
		
		int day = 5;
		//ahead time
		int countAhead = DayOfWeek.valueOf("MONDAY").getValue()+day;
		if(countAhead>7) {
			System.out.println(day+" after 'Monday' "+DayOfWeek.of(countAhead%7));
		} else {
			System.out.println(day+" after 'Monday' "+DayOfWeek.of(countAhead));
		}
			
		//behind time
		int countBehind = DayOfWeek.valueOf("MONDAY").getValue()-day;
		if(Math.abs(countBehind)<7) {
			System.out.println(day+" before 'Monday' "+DayOfWeek.of(7-Math.abs(countBehind)));
		}else {
			int interval = Math.abs(countBehind)/7;
			System.out.println(day+" before 'Monday' "+DayOfWeek.of(7*(interval+1)-Math.abs(countBehind))); ;
		}
	}

}
