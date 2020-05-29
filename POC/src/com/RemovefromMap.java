/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import comparelist.Person;

/**
 * @author 212720190
 * @date Jan 18, 2019
 */
public class RemovefromMap {


	public static void main(String[] args) {

		Map<String, List<?>> mapData = new HashMap<>();
		
		List<Object> list = new ArrayList<>();
		list.add(new Person(1, "tanmoy", "dankuni", 20));
		list.add(new Person(2, "Sanjoy", "Bengaluro", 25));
		list.add("testdata");
		mapData.put("onelist", list);
		
        for(Map.Entry<String, List<?>> entry : mapData.entrySet()) {
      	  String key = entry.getKey();
      	  for (Object value : entry.getValue()) {
      		  System.out.println(value.toString());
      		  if(!(value instanceof Person))
      			  list.remove(value);
      		  mapData.put("onelist", list);
      		  
      	  }
      	}
        
        
	}

}
