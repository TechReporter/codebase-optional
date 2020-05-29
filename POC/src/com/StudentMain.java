/**
 * 
 */
package com;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 212720190
 * @date Nov 12, 2018
 */
public class StudentMain {
private String str;
	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

public static boolean dateIsBefore(Date startDate, Date endDate) {
	boolean dateAfter = true;

	Instant instant1 = Instant.ofEpochMilli(startDate.getTime());
	LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()); 
	LocalDate startDateAsLocalDate = localDateTime1.toLocalDate();

	Instant instant2 = Instant.ofEpochMilli(endDate.getTime());
	LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault()); 
	LocalDate endDateAsLocalDate = localDateTime2.toLocalDate();

	if (endDateAsLocalDate.isBefore(startDateAsLocalDate)) {
		dateAfter = false;
	}

	return dateAfter;
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
	boolean dateAfter = true;

	Instant instant1 = Instant.ofEpochMilli(startDate.getTime());
	LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()); 
	LocalDate startDateAsLocalDate = localDateTime1.toLocalDate();

	Instant instant2 = Instant.ofEpochMilli(endDate.getTime());
	LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault()); 
	LocalDate endDateAsLocalDate = localDateTime2.toLocalDate();

	if (endDateAsLocalDate.isEqual(startDateAsLocalDate)) {
		dateAfter = false;
	}

	return dateAfter;
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

public static void main(String[] args) throws ParseException {
	
	String existing = "2020-12-07 12:00:00";
	Date sysdate = new Date();
	String passDate = "2019-12-01 12:00:00";
	

	String toDate = getDateAsGivenFormat(sysdate, "yyyy-MM-dd hh:mm:ss");
	if(dateCompare(existing, passDate) &&
			dateIsBefore(getStringToDateAsGivenFormat(toDate, "yyyy-MM-dd hh:mm:ss"),
			new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(passDate))
			) {
		System.out.println("error");
		}

	
	
	
	
	/*
	
	getDateAsGivenFormat();
	try {
		int x=4;
		boolean b1=true;
		boolean b2=false;
		if(x==5 && !b2) {
			System.out.println("sds");
		}
		if((b1=true) && b2) {
			System.out.println("sds");
		}
	}
	
	
	
	
	
	long start = System.currentTimeMillis()/1000;
	
	
	
	String str = "kincenvizh";
   for(int i=0;i<60000;i++) {
	System.out.println();
}
long end = System.currentTimeMillis()/1000;

System.out.println(end-start+"fvsdfv");

	
	

    Constructor[] constructors =  
            Car.class.getDeclaredConstructors();
   
    for(Constructor c : constructors) {
    	c.setAccessible(true);
    	System.out.println(c.getName());
    	Car carVal = (Car) c.newInstance();
    	System.out.println(carVal.toString());
    }
	
	
	Car c = new Car(1, new Company("audi"));
	Map<Car, String>  map = new HashMap<>();
	map.put(c, "ex 2000");
	Car cc = c;
	c.setCc(null);
	Car ccc = c;
	System.out.println(c.hashCode());
	System.out.println(cc.hashCode());
	System.out.println(ccc.hashCode());

	System.out.println(map.get(c));
	
	

		
		
		
		
		
		
		String currDate = "2019-08-14";
		String lastDate = "2018-09-10";
		int warrantyDays = 90;
		
		boolean isWithinWarranty = false;
		
		int diffMonth=-1;
		try {
			Period period = warrantyPeriodCalculation(new SimpleDateFormat("yyyy-MM-dd").parse(currDate) , 
					new SimpleDateFormat("yyyy-MM-dd").parse(lastDate));
			Integer appliedMonth = getDiffereneInDays(period);
			diffMonth = Integer.compare(appliedMonth,warrantyDays);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(diffMonth <= 0) {
			isWithinWarranty = true;	
		}
		System.out.println(isWithinWarranty);
		
		
		
		String str = "09/02/2019";
		try {
			Date dt = new SimpleDateFormat("MM/dd/yyyy").parse(str);
			System.out.println(dt);
			Instant currentDateInstant = Instant.ofEpochMilli(new Date().getTime());
			LocalDateTime currentDateTime = LocalDateTime.ofInstant(currentDateInstant, ZoneId.systemDefault());
			LocalDate localCurrentDate = currentDateTime.toLocalDate();

			Instant lastDateInstant = Instant.ofEpochMilli(dt.getTime());
			LocalDateTime lastDateTime = LocalDateTime.ofInstant(lastDateInstant, ZoneId.systemDefault());
			LocalDate localLastDate = lastDateTime.toLocalDate();
			
			
			

			LocalDate startDate = LocalDate.of(2016, 1, 14);
			LocalDate endDate = LocalDate.of(2017, 1, 15);
			 
			Period period = Period.between(startDate, endDate);
			
			getDiffereneInMonth(period);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		List<Student> list = Arrays.asList(new Student(100, "sdsdaaaa", 2000L),
				new Student(100, "eeee", 2000L),new Student(100, "sdsdbbb", 1000L),new Student(100, "sdsdccc", 1000L));
		
		List<Student> list1 = Arrays.asList(new Student(100, "eeee", 2000L));
		List<Student> list2 = Arrays.asList(new Student(100, "sdsdceee", 1000L));
		List<Student> list3 = Arrays.asList(new Student(100, "sdsdccc", 1000L));
		
		Student std  = new Student(100, "SDSDSD",1000L);
		long val = std.getSalary();
		Student st = list.stream().filter(ee-> ee.getSalary()==val).findFirst().orElse(null);
		
		Map<Integer, List<Student>> metMap = new HashMap<>();
		metMap.put(111, list);
		metMap.put(222, list1);
		metMap.put(333, list2);
		metMap.put(444, list3);
		
		
	Integer ll = metMap.entrySet().stream()
		.filter(ee-> !ee.getValue().isEmpty()).findFirst().get().getValue()
		.stream().map(Student::getStdId).limit(0).collect(Collectors.toList());

		
		
		
		
		List<Student> list = Arrays.asList(new Student(100, "sdsdccc", 2000L),
				new Student(101, "sdsffff", 1000L));
		
		List<Student> list1 = Arrays.asList(new Student(100, "eeee", 2000L),
				new Student(101, "sdsffff", 1000L),new Student(100, "sds2211", 2140L),new Student(100, "sds11", 2200L),
				new Student(101, "sds4455", 3500L),new Student(101, "sds", 2000L),new Student(101, "sds222", 3000L));
		List<Student> list2 = Arrays.asList(new Student(100, "sdsdccc", 2000L),
				new Student(101, "sdsffff", 1000L),new Student(100, "fffffffff", 2140L),new Student(100, "sds11", 2200L),
				new Student(101, "sds4455", 3500L),new Student(101, "sds", 2000L),new Student(101, "sanjoy", 3000L));
		List<Student> list3 = Arrays.asList(new Student(100, "sdsdccc", 2000L),
				new Student(101, "sdsffff", 1000L),new Student(100, "tanmoy", 2140L),new Student(100, "sds11", 2200L),
				new Student(101, "sds4455", 3500L),new Student(101, "sds", 2000L),new Student(101, "mani", 3000L));
		
		
		Map<Integer, List<Student>> metMap = new HashMap<>();
		metMap.put(111, list);
		metMap.put(222, list1);
		metMap.put(333, list2);
		metMap.put(444, new ArrayList<>());
		
		
		List<Student> ll = metMap.entrySet().stream()
		.filter(ee-> !ee.getValue().isEmpty()).findFirst().get().getValue();
		
		ll.stream().forEach(System.out::println);
		//.map(mapper);
		//.collect(Collectors.joining());

				metMap = list.stream()
				.collect(Collectors.groupingBy(Student::getStdId));
		
		for(Integer s : metMap.keySet()){
			metMap.get(s).
		   sort(Comparator.comparing(Student::getSalary).reversed());
			metMap.put(s, metMap.get(s).subList(0,2));
		   // s.stream().limit(2);
		}
		
		for(Map.Entry<Integer, List<Student>> entry : metMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		System.out.println(commonUtil.getVal());
		System.out.println(commonUtil.getVal());
		System.out.println(commonUtil.getVal());


		List<Student> list = new ArrayList<>();
		list.add(new Student(900, "Tanmoy"));
		list.add(new Student(200, "mani"));
		list.add(new Student(300, "subho"));

		list.add(new Student(200, "tcs"));

		list.add(new Student(500, "subho"));

		list.add(new Student(600, "accionLabs"));
		list.add(new Student(700, "ge-transportation"));
		
		Map<Integer,String> map = new HashMap<>();
		map.put(200, "tcs111");
		map.put(500, "subho111");
		map.put(300, "accionLabs111");
		 

Map<Integer,String> map1 = list.stream()
     .collect(Collectors.toMap(Student::getStdId, Student::getName));


List<Integer> listId = list.stream()
							.map(Student::getStdId)
							.collect(Collectors.toList());



list.stream()
.forEach(e-> {
	if(map.get(e.getStdId()) !=null) {
		map.put(e.getStdId(), e.getName());
	}
});

Long val = null;
Long val1= Optional.ofNullable(val)
.orElseGet(() ->null);
System.out.println(val1);

		System.out.println(LocalDateTime.now()+" "+System.currentTimeMillis()/1000);

		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		
		//checkNull(list);
		miscOps(list);
		grouping(list);
		//getVal(200,list);
		//jsonData();
		//getGeneratedMessageId();
	*/}
	
	
	public static Period warrantyPeriodCalculation(Date currentDate,Date lastDate) {
		Period timePeriod =null;
		if(Optional.ofNullable(currentDate).isPresent() && Optional.ofNullable(lastDate).isPresent()) {
		Instant currentDateInstant = Instant.ofEpochMilli(currentDate.getTime());
		LocalDateTime currentDateTime = LocalDateTime.ofInstant(currentDateInstant, ZoneId.systemDefault());
		LocalDate localCurrentDate = currentDateTime.toLocalDate();

		Instant lastDateInstant = Instant.ofEpochMilli(lastDate.getTime());
		LocalDateTime lastDateTime = LocalDateTime.ofInstant(lastDateInstant, ZoneId.systemDefault());
		LocalDate localLastDate = lastDateTime.toLocalDate();

			timePeriod = Period.between(localLastDate, localCurrentDate);
		}
		return timePeriod;
	}
	
	
	
	public static Integer getDiffereneInDays(Period period) {
		Integer difference;
		int days = period.getDays();
		int months = period.getMonths();
		int years = period.getYears();

		difference = (years * 365) + days;
		if (months > 0) {
			difference = difference + months*30;
		}
		return difference;
	}
	
	static void jsonData() throws JsonParseException, JsonMappingException, IOException {
		String str = "{ \"stdId\" : \"100\", \"name\" : \"Tanmoy\" }";
        ObjectMapper mapper = new ObjectMapper();
        
        Student obj = new Student(1, "ratna");
        String str11 = mapper.writeValueAsString(obj);
       // System.out.println(str11);

		Student std = mapper.readValue(str, Student.class);
		
		
		String[] strData = {"tanmoy","mani","tanmoy","sanjoy","mani"};
		String[] newStr = new String[strData.length];
		Map<String,String> map = new HashMap<>();
		for(int i=0;i<strData.length;i++) {
			if(map.get(strData[i]) != null) {
				newStr[i] = "YES";
			} else {
				map.put(strData[i], "NO");
				newStr[i] = "NO";
			}
		}
		
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println("key "+entry.getKey()+" value "+entry.getValue());
		}
		
		
		
		//System.out.println(std.toString());
		
	
/*		Student student = new Student();
		String str111 = null;
		int id = 100;
		String date = "asda";
		
		Optional.ofNullable(id).ifPresent(student::setStdId);
		Optional.ofNullable(str111).ifPresent(student::setName);
		Optional.ofNullable(date).ifPresent(student::setCoScheduleDate);

		System.out.println(student);*/
		

/*Long val = null;
		long name = Optional.ofNullable(val).orElseGet(() -> 1L);

		System.out.println(name);
	}
	
	static void executeCbmMapping(String str) {
		System.out.println("=========="+str);
		
	*/
		
		/*List<Integer> list = Arrays.asList(1,4,33,55,22,42,33,565,121,77,44,222,34,676,12);

		int list_size = 0;
		while(list_size<list.size()) {
			
			List<Integer> list1 = list.subList(list_size, Math.min((list_size+4), list.size()));
			list1.forEach(System.out::println);
			System.out.println("================");
			list_size += list1.size();
		}
		List<Integer> list1 = list.subList(0, 2);
		//list1.forEach(System.out::println);
		*/
		
		

		/*String date = null;
		String dateSet = null;		
Student object = new Student();

Optional<String> date33  = Optional.ofNullable(date);

if(date33.isPresent()) {
	System.out.println("dsf");
}

		Optional.ofNullable(date).ifPresent(e-> object.setCoScheduleDate(e.toUpperCase()));
		
		
		System.out.println(object);
	}

	
	
	static void getVal(int val, List<Student> list) {
		String value = list.stream()
				.filter(e -> e.getStdId() == val)
				.map(Student::getName)
				.findAny().get();
		
		System.out.println(value);
	}
	
	
    static void getGeneratedMessageId() {
        System.out.println(System.currentTimeMillis());
    }
	private static void checkNull(List<Student> list1) {
		List<String> listData = new ArrayList<>();
		listData.add("dankuni");
		listData.add("hooghly");
		listData.add("accionLabs");

		
	Set<String> list = list1.stream().map(Student::getName).collect(Collectors.toSet());
	list.forEach(System.out::println);
		
	List<String> rsultdata = listData.stream().filter(e-> list.contains(e))
							  .collect(Collectors.toList());
	
	System.out.println("ddsdsdsdsd");
	rsultdata.forEach(System.out::println);
	}
	
	private static void miscOps(List<Student> list1) {
		
		Set<String> list = list1.stream().map(Student::getName)
						   .collect(Collectors.toCollection(TreeSet::new));
		
		String longName = list.stream().map(Object::toString).collect(Collectors.joining(", "));
			System.out.println(longName);
	}
	
	private static void grouping(List<Student> list1) {
		
		Map<Integer,List<Student>> groupStd = list1.stream()
									.collect(Collectors.groupingBy(Student::getStdId));
				
		 Map<Boolean, List<Student>> passingFailing =
			     list1.stream()
			             .collect(Collectors.partitioningBy(s -> s.getStdId() >= 500));
		
		 double avrg = list1.stream().collect(Collectors.averagingInt(Student::getStdId));
		System.out.println(avrg);*/
	}
	
	
}
