/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Mar 6, 2019
 */
public class CheckDecimal {


	public static void main(String[] args) {
		/*Object obj = 12.78;
		if(BigDecimal.valueOf(Double.parseDouble(obj.toString())).scale() <= 2) {
			System.out.println("dcdcdc");
			BigDecimal.valueOf(Double.parseDouble(obj.toString())).setScale(2, BigDecimal.ROUND_HALF_UP);
		}
	System.out.println(BigDecimal.valueOf(Double.parseDouble(obj.toString())).setScale(2, BigDecimal.ROUND_HALF_UP));
	System.out.println(BigDecimal.valueOf(Double.parseDouble(obj.toString())).setScale(2, BigDecimal.ROUND_HALF_DOWN));

		System.out.println("aaaaaaaa");*/
		
//Long str =  1234&L;

		    System.out.println(isNumber(String.valueOf("1234")));
		  

	}
	
	public static boolean isNumber(String string) {
	    return string.matches("^\\d+$");
	  }

}
