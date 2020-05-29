/**
 * 
 */
package builder;

import java.util.Calendar;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class StudentBuilderMain {

	public static void main(String[] args) {

		Student obj = new Student.StudentBuilder()
				.id(1)
				.address("bangalore")
				.name("tanmoy")
				.rollNo(100L)
				.build();
	
		System.out.println(obj.getAddress());
		System.out.println(obj.getName());
		System.out.println(obj);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

	}
	
}
