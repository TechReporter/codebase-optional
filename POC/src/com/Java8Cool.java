/**
 * 
 */
package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author 212720190
 * @date Mar 22, 2019
 */
public class Java8Cool {/*

	*//**
	 * @param args
	 *//*
	public static void main(String[] args) throws ParseException {


		int[] arr = {2,1,4,23,6,3,7};
		int index = 2;

		int[] arr1 = IntStream.range(0, arr.length)
				.filter(i -> i!=index)
				.map(i -> arr[i])
				.toArray();

		System.out.println(Arrays.toString(arr1));
		String  str ="tanmoy"; //yomnat
		char[] chr = str.toCharArray();
		
		for(int i =0; i<chr.length/2;i++) {
			char temp = chr[i];
			chr[i] = chr[chr.length-1-i];
			chr[chr.length-1-i]=temp;
		}
		
		System.out.println(String.valueOf(chr));

		List<Student> list =  Arrays.asList(new Student(6, 
				"ronak",new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/1999"))),
				new Student(2, "ronak111",
						new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("02/12/1989"))),
				new Student(4, "ronak444444",
						new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2017"))),
				new Student(6, "ronak222",
						new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2017"))),
				new Student(6, "ronak222",
						new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1999"))),
				new Student(4, "ronak2sd22",
						new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2019"))),
				new Student(2, "ronak22ffd2",
						new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2017"))));

		Map<Integer, Optional<Student>> map = list.stream()
				.collect(Collectors.groupingBy(Student::getStdId, 
						Collectors.minBy(Comparator
								.comparing(Student::getCoScheduleDate))));




		Map<Integer,String> map1 = list.stream()
				.collect(Collectors.groupingBy(Student::getStdId, 
						Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getCoScheduleDate))
								,e -> e.get().getCoScheduleDate())));

			for(Map.Entry<Integer, Optional<Student>> entry : map.entrySet()) {
			System.out.println(entry);
		}

		for(Map.Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println(entry);
		}

		int[] arr = {2,5,10,3,8,7,4,3,2,2,9,6,5,8,9};
		Arrays.stream(arr).sorted();

		List<Integer> list1 =  Arrays.asList(1,3,4,2,41,5,7,33);
		List<Integer> list2 =  Arrays.asList(1,3,4);

		List<Integer> list3 = list1.stream().filter(e -> !list2.stream().collect(Collectors.toSet())
				.contains(e)).collect(Collectors.toList());

		list3.forEach(System.out::println);

		Student obj = new Student(); 
		obj.setName("tanmoy");
		obj.setStdId(1);

		System.out.println(obj);

		obj.setName("vdjsvjv");
		System.out.println(obj);

		Arrays.stream(arr)
				 .boxed().sorted().distinct().
				 collect(Collectors.toList())
				 .forEach(System.out::println);


		Date date = new SimpleDateFormat("dd/MM/yyyy").parse("11/15/1996");
		System.out.println(date);
		System.out.println(new java.sql.Date(date.getTime()));
		String s = null;
		System.out.println(Integer.valueOf(s== null ?"0":s));
		 
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

*/}
