/**
 * 
 */
package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author 212720190
 * @date Oct 1, 2018
 */
public class FiletoConsole {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser fileParse = new JSONParser();
		
		JSONObject dataObj = (JSONObject) fileParse.parse(new FileReader("C:\\Users\\212720190\\newData.txt"));
	
		
		
		System.out.println(findVal(dataObj,"status"));      
		
		// Long age = (Long) dataObj.get("Age");
        
        //Reading the array
       // JSONArray countries = (JSONArray)dataObj.get("Countries");
        
        //Printing all the values
  /*      System.out.println("Age: " + age);
        System.out.println("Countries:");
        Collections.sort(countries);
        for(Object country : countries)
        {
            System.out.println("\t"+country.toString());
        }
		*/
		System.out.println(dataObj.toJSONString());
	
	}
	
	public static Object checkKey(JSONObject object, String searchedKey) {
	    boolean exists = object.containsKey(searchedKey);
	    Object obj = null;
	    if(exists){
	        obj = object.get(searchedKey);
	    }
	    if(!exists) {      
	         Set<String> keys = object.keySet();
	         for(String key : keys){
	             if ( object.get(key) instanceof JSONObject ) {
	                 obj = checkKey((JSONObject)object.get(key), searchedKey);
	            }
	         }
	    }
	    return obj;
	}
	
	private static Object findVal(JSONObject obj, String k) throws ParseException {
		
		Set<String> keys = obj.keySet();
		Object objval = null;
		
			for(Object key : keys) {
				if(key.equals(k)) {
					System.out.println(obj.get(key));
					objval = obj.get(key);
				}
				if(obj.get(key) instanceof JSONObject) {
					System.out.println(obj.get(k));
					objval = findVal((JSONObject) obj.get(key), k);
				}
				
				if(obj.get(key) instanceof JSONArray ) {
						
					JSONArray jarray = (JSONArray) obj.get(key);
					 for (int i = 0; i < jarray.size(); i++) {
				            JSONObject json = (JSONObject) new JSONParser().parse(jarray.get(i).toString());
			                objval = findVal(json, (String)key);
			            }
				}
			}
			
		return objval;
	}

}
