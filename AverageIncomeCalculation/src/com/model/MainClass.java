package com.model;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.model.IncomeDetails.IncomeValueResult;

/**
 * @author 212720190
 * @date Mar 12, 2019
 */
public class MainClass {

	public static void main(String[] args) throws IOException {

		new MainClass();
		List<IncomeValueResult> list = MainClass.getDataFromCsv();
		writeDataIntocsv(list);
	}

	private static void writeDataIntocsv(List<IncomeValueResult> list) {
		BufferedWriter bw = null;
		String FILE_HEADER = "city/country,currency,average income";
		try {
			 bw = new BufferedWriter(new OutputStreamWriter(
	        		new FileOutputStream("src/com/model/data11.csv"), "UTF-8"));
            StringBuffer oneLine = new StringBuffer();

            oneLine.append(FILE_HEADER.toString());
            oneLine.append("\n");
			 for(IncomeValueResult e : list) {
				 oneLine.append(e.getiCountry());
				 oneLine.append(",");
				 oneLine.append(e.getiCurrency());
				 oneLine.append(","); 
				 oneLine.append(e.getiAvgIncome());
				 bw.write(oneLine.toString());
				 oneLine.append("\n");
			 }
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				if(bw !=null) {
				bw.close();	
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private static List<IncomeValueResult> getDataFromCsv() {
		List<IncomeDetails> incomeList = new ArrayList<>();
		List<IncomeValueResult> incomeListResult = new ArrayList<>();

		incomeList = Arrays.asList(new IncomeDetails("hong kong","HONG KONG",Gender.valueOf("M"),
				"HKD",Double.valueOf(Integer.toString(24000))),
				new IncomeDetails("seuol",null,Gender.valueOf("M"),
						"KRW",Double.valueOf(Integer.toString(12432))),
				new IncomeDetails("new Delhi","INDIA",Gender.valueOf("F"),
						"INR",Double.valueOf(Integer.toString(12347))),
				new IncomeDetails("new york","USA",Gender.valueOf("F"),
						"USD",Double.valueOf(Integer.toString(38464))),
				new IncomeDetails("mumbai","INDIA",Gender.valueOf("M"),
						"INR",Double.valueOf(Integer.toString(23452))),
				new IncomeDetails("bangalore","INDIA",Gender.valueOf("F"),
						"INR",Double.valueOf(Integer.toString(84433))),
				new IncomeDetails("kolkata","INDIA",Gender.valueOf("M"),
						"INR",Double.valueOf(Integer.toString(24441))),
				new IncomeDetails("chicago","USA",Gender.valueOf("M"),
						"USD",Double.valueOf(Integer.toString(84682))),
				new IncomeDetails("hong kong","HONG KONG",Gender.valueOf("F"),
						"HKD",Double.valueOf(Integer.toString(63261))),
				new IncomeDetails("new york","USA",Gender.valueOf("M"),
						"USD",Double.valueOf(Integer.toString(1123))),
				new IncomeDetails("mumbai","INDIA",Gender.valueOf("F"),
						"INR",Double.valueOf(Integer.toString(33111))),
				new IncomeDetails("bangalore","INDIA",Gender.valueOf("M"),
						"INR",Double.valueOf(Integer.toString(74821))),
				new IncomeDetails("seuol",null,Gender.valueOf("F"),
						"KRW",Double.valueOf(Integer.toString(47282))),
				new IncomeDetails("kolkata","INDIA",Gender.valueOf("F"),
						"INR",Double.valueOf(Integer.toString(38271))),
				new IncomeDetails("new Delhi","INDIA",Gender.valueOf("M"),
						"INR",Double.valueOf(Integer.toString(7321))),
				new IncomeDetails("chicago","USA",Gender.valueOf("F"),
						"USD",Double.valueOf(Integer.toString(8237))),
				new IncomeDetails("singapore","SINGAPORE",Gender.valueOf("M"),
						"SGD",Double.valueOf(Integer.toString(18172))),
				new IncomeDetails("singapore","SINGAPORE",Gender.valueOf("F"),
						"SGD",Double.valueOf(Integer.toString(39331))));

	/*	Map<String, Map<String, Map<String, Double>>> map = incomeList.stream()
				.collect(Collectors.groupingBy(IncomeDetails::getCountry, //income clubbed by country with city
						Collectors.groupingBy(IncomeDetails::getCity, 
								Collectors.groupingBy(IncomeDetails::getCurrency,
										Collectors.summingDouble(IncomeDetails::getAvgIncome)))));*/




		Map<String, Map<String, Double>> map1 = incomeList.stream()
				.filter(e -> e.getCountry() != null)
				.collect(Collectors.groupingBy(IncomeDetails::getCountry, //income clubbed by country with city
						Collectors.groupingBy(IncomeDetails::getCurrency, 
								Collectors.summingDouble(IncomeDetails::getAvgIncome))));
				
		Map<String, Map<String, Double>> map11 = incomeList.stream()
				.filter(e -> e.getCountry() == null)
				.collect(Collectors.groupingBy(IncomeDetails::getCity, //income clubbed by country with city
						Collectors.groupingBy(IncomeDetails::getCurrency, 
								Collectors.summingDouble(IncomeDetails::getAvgIncome))));
		
		
		for (Map.Entry<String, Map<String, Double>> entry : map1.entrySet())   {
			Double val = 0.00;
			 DecimalFormat f = new DecimalFormat("##.00");
				for(Map.Entry<String, Double> entry1 : entry.getValue().entrySet()) {
					switch (entry1.getKey()) {
					case "USD":
						val = entry1.getValue()*69.56;
						break;
					case "SGD":
						val = entry1.getValue()*51.30;
						break;
					case "KRW":
						val = entry1.getValue()*16.22;
						break;
					case "HKD":
						val = entry1.getValue()*8.86;
						break;
						default:
						val = entry1.getValue()*1;
						break;
					}
					IncomeValueResult result = new IncomeDetails().new IncomeValueResult();
					result.setiCurrency(entry1.getKey());
					result.setiCountry(entry.getKey());
					result.setiAvgIncome(f.format(val));
					incomeListResult.add(result);
				}
			}
		
		
		for (Map.Entry<String, Map<String, Double>> entry : map11.entrySet())   {
			Double val = 0.00;
			 DecimalFormat f = new DecimalFormat("##.00");
				for(Map.Entry<String, Double> entry1 : entry.getValue().entrySet()) {
					switch (entry1.getKey()) {
					case "USD":
						val = entry1.getValue()*69.56;
						break;
					case "SGD":
						val = entry1.getValue()*51.30;
						break;
					case "KRW":
						val = entry1.getValue()*16.22;
						break;
					case "HKD":
						val = entry1.getValue()*8.86;
						break;
						default:
						val = entry1.getValue()*1;
						break;
					}
					IncomeValueResult result = new IncomeDetails().new IncomeValueResult();
					result.setiCurrency(entry1.getKey());
					result.setiCountry(entry.getKey());
					result.setiAvgIncome(f.format(val));
					incomeListResult.add(result);
				}
			}
		

/*		for (Map.Entry<String, Map<String, Map<String, Double>>> entry : map.entrySet())   {
			Double val = 0.00;
			 DecimalFormat f = new DecimalFormat("##.00");
			for(Map.Entry<String, Map<String, Double>> entry1 : entry.getValue().entrySet()) {
				for(Map.Entry<String, Double> entry2 : entry1.getValue().entrySet()) {
					switch (entry2.getKey()) {
					case "USD":
						val = entry2.getValue()*69.56;
						break;
					case "SGD":
						val = entry2.getValue()*51.30;
						break;
					case "KRW":
						val = entry2.getValue()*16.22;
						break;
					case "HKD":
						val = entry2.getValue()*8.86;
						break;
						default:
						val = entry2.getValue()*1;
						break;
					}
					IncomeValueResult result = new IncomeDetails().new IncomeValueResult();
					result.setiCurrency(entry2.getKey());
					result.setiCountry(entry.getKey());
					result.setiAvgIncome(f.format(val));
					incomeListResult.add(result);
				}
			}
		}*/

		System.out.println("====================");

		for (Map.Entry<String, Map<String, Double>> entry : map1.entrySet())  { 
			System.out.println("Key = " + entry.getKey() + 
					", Value = " + entry.getValue()); 
		}

		System.out.println("====================");
		
		for (Map.Entry<String, Map<String, Double>> entry : map11.entrySet())  { 
			System.out.println("Key11 = " + entry.getKey() + 
					", Value11 = " + entry.getValue()); 
		}
		System.out.println("====================");
		
		Collections.sort(incomeListResult, Comparator.comparing(IncomeValueResult::getiCountry));
		return incomeListResult;

	}
}
