package multithreading;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
public class EncryptionDecryptionAES {
	static Cipher cipher;
	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		String dateOfBirth ="3105";
		
		dateOfBirth = dateOfBirth.substring(0, 2).concat("-")
				.concat(dateOfBirth.substring(2,4));
		System.out.println(dateOfBirth);


		String date = "11-12";
		int year = Calendar.getInstance().get(Calendar.YEAR);
		date = date.concat("-").concat(String.valueOf(year));
		System.out.println(date);
		SimpleDateFormat todate = new SimpleDateFormat("MM-dd-yyyy");
		String dd = todate.format(new Date());
		System.out.println(dd);

		boolean isWithinWarranty = false;
		LocalDate date1AsLocalDate;
		LocalDate date2AsLocalDate;
		Date dobDate = todate.parse(date);
		Date sysdate = todate.parse(dd);

		Instant instant1 = Instant.ofEpochMilli(dobDate.getTime());
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()); 
		date1AsLocalDate = localDateTime1.toLocalDate();

		Instant instant2 = Instant.ofEpochMilli(sysdate.getTime());
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault()); 
		date2AsLocalDate = localDateTime2.toLocalDate();
		
		if(date1AsLocalDate.isAfter(date2AsLocalDate)) {
		
			int diffDays=-1;
			try {
				Period period = warrantyPeriodCalculation(new SimpleDateFormat("MM-dd-yyyy").parse(date) , 
						new SimpleDateFormat("MM-dd-yyyy").parse(dd));
				Integer appliedDays = getDiffereneInDays(period);
				diffDays = Integer.compare(appliedDays,5);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			if(diffDays <= 0) {
				isWithinWarranty = true;	
			}
		} else {

			
			int diffDays=1;
			try {
				Period period = warrantyPeriodCalculation(new SimpleDateFormat("MM-dd-yyyy").parse(date) , 
						new SimpleDateFormat("MM-dd-yyyy").parse(dd));
				Integer appliedDays = getDiffereneInDays(period);
				diffDays = Integer.compare(appliedDays,-5);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			if(diffDays >= 0) {
				isWithinWarranty = true;	
			}
		
			
		}

		System.out.println(isWithinWarranty);


/*
		
		int x=9;
		x=10;
		System.out.println(x);
		String[] arr = {"M2M4Y2NlZmMtM2I2MC00NjkxLTk3MGQtYWZhZWMyZWI3NTAz",  "red"};
		if(arr[1].equalsIgnoreCase("Red"))
		System.out.println(arr[1]);




		String  cc = "SITECORE%3A%2Fsitecore%2Fcontent%2FChick-fil-A%2FGlobal%2FPromos%2FBanners%2FTargeted%2FCFA+One+Birthday%3Aen-US";

		cc = cc.substring(0, cc.lastIndexOf("%3A")+3).concat("en-CA");
		System.out.println("cc "+cc);


				%2Fsitecore%2Fcontent%2FChick-fil-A%2FGlobal%2FPromos%2FHero+Image%2FHero+Default%3Aen-US

		String key = "SITECORE%3A%2Fsitecore%2Fcontent%2FChick-fil-A%2FGlobal%2FPromos%2FHero+Image%2FHero+Default%3Aen-US";

		System.out.println(URLDecoder.decode(key, StandardCharsets.UTF_8.toString()));
		String cacheKey = key.substring(0, key.lastIndexOf("%3A")+1).concat("en-US");

		System.out.println(cacheKey);
		String 	keyPath = cacheKey.substring(cacheKey.indexOf("%3A%2F")+1, cacheKey.lastIndexOf("%")+1).concat("en-US");

		System.out.println(keyPath);



		String path = "<link linktype=\"external\" url=\"https://www.chick-fil-a.com/mac-and-cheese\" anchor=\"\" target=\"\" />";
		String extractedUrls = extractUrls(path);

		    System.out.println(extractedUrls);




		Set<Object> keys = new HashSet<>();
		String langLocale = "en-US";
		keys.add("aaa:en-US");
		keys.add("bbb:en-CA");
		keys.add("ccc:en-US");
		keys.add("ddd:en-US");
		keys.add("eee:en-CA");
			List<Object> listData = keys.stream().filter(e-> 
				((String) e).substring(((String) e).lastIndexOf(":")+1, ((String) e).length()).equalsIgnoreCase(langLocale))
					.collect(Collectors.toList());

		listData.forEach(System.out::println);



		String path = "/sitecore/content/Chick-fil-A/Global/Promos/Hero Image/Hero Default";
		String[] arr = path.split("/");
		System.out.println(arr[arr.length-2]);


		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map4 = new HashMap<String, String>();

		List<Map<String, String>> list = new ArrayList<Map<String,String>>();

		map.put("itemid", "1");
		map.put("itemName", "mani");
		map1.put("itemid", "2");
		map1.put("itemName", "sanjoy");
		map2.put("itemid", "3");
		map2.put("itemName", "tanmoy");
		map4.put("itemid", "4");
		map4.put("itemName", "sdsdss");
		list.add(map);
		list.add(map1);
		list.add(map2);
		Map<String, Object>  map3 = new HashMap<>();
		//map3.put("Menu", list);

		if(map3.get("Menu") !=null) {
			List<Map<String, String>> list1 = (List<Map<String, String>>) map3.get("Menu");
			list.add(map4);
			//list1.forEach(System.out::println);
		} else {
			map3.put("Menu", list);

		}

		if(map3.get("Menu") !=null) {
			List<Map<String, String>> list1 = (List<Map<String, String>>) map3.get("Menu");
			list.add(map4);
			//list1.forEach(System.out::println);
		} else {
			map3.put("Menu", list);

		}
		try {


		ObjectMapper mapper = new ObjectMapper();

		String responseData = new ObjectMapper().writeValueAsString(map3);
		System.out.println(mapper.readTree(responseData));
		} catch (Exception e) {
			// TODO: handle exception
		}



		Set<Object> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");

		if(set.contains("BBB")) {
			System.out.println("match");
		} else {
			System.out.println("not match");
		}


		String referrer = "/sitecore/content/Chick-fil-A/Global/Promos/Hero Image/Hero Default";

		referrer = referrer.substring(referrer.substring(0, referrer.lastIndexOf("/")).lastIndexOf("/") + 1);
		referrer = referrer.substring(0, referrer.lastIndexOf("/"));
		System.out.println(referrer);

		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(256);
		SecretKey secretKey = keyGenerator.generateKey();
		cipher = Cipher.getInstance("AES");
		String plainText = "Data Stored";
		System.out.println(" Before Encryption: " + plainText);
		System.out.println("secret key :: "+secretKey);
		String encryptedText = encrypt(plainText, secretKey);
		System.out.println("Encrypted: " + encryptedText);
		String decryptedText = decrypt(encryptedText, secretKey);
		System.out.println("Decrypted Text After Decryption: " + decryptedText);
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


	public static String extractUrls(String text)
	{
		String containedUrls = null;
		String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
		Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
		Matcher urlMatcher = pattern.matcher(text);

		while (urlMatcher.find())
		{
			containedUrls = text.substring(urlMatcher.start(0),
					urlMatcher.end(0));
		}

		return containedUrls;
	}

}
