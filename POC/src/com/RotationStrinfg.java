/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Mar 19, 2019
 */
public class RotationStrinfg {

	public static void main(String[] args) {

		String str1 = "tanmoy";
		String str2 = "oytnaaa";

		System.out.println(getShiftedString("abcd",1,2));
	}

	 public static String getShiftedString(String s, int leftShifts, int rightShifts) {
		 String str = "";
		 if(rightShifts>leftShifts) {
			  for (int i = 0; i < rightShifts-leftShifts; i++) {
		            s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
		        } 
		 }
	      
	        System.out.println(s);
	      

	        return s;
	    }
}
