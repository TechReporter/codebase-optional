package Arraypractice;

/**
 * @author 212720190
 * @date Jan 31, 2020
 */
public class DiffrenceInBinary {

	//check diffreence in caracter in binary number using 
	public static void main(String[] args) {

		int a = 10011011;
		int b = 10110010;
		int count =0;
		
		while(a>0) {
			count+=1;
			a=a&(a-1);
		}
		System.out.println(count);
			
		solve(4, 5);
	}
	
	static void solve(int A, int B) 
	{ 
	    int count = 0; 
	  
	    // since, the numbers are less than 2^31 
	    // run the loop from '0' to '31' only 
	    for (int i = 0; i < 32; i++) { 
	  
	        // right shift both the numbers by 'i' and 
	        // check if the bit at the 0th position is different 
	        if (((A >> i) & 1) != ((B >> i) & 1)) { 
	            count++; 
	        } 
	    } 
	  
	    System.out.println("Number of different bits : " + count); 
	} 
	  

}
