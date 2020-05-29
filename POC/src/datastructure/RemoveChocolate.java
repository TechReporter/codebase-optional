/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 16, 2019
 */
public class RemoveChocolate {

	public static void main(String[] args) {

		int n = 5; 
        System.out.println(CountWays(n, false));
	}
		
	static  int CountWays(int n, boolean flag) 
	{ 
	    if (n == 0) // base case 
	        return 1; 
	  
	    int sum = 0; 
	  
	    // 2 is not scored last time so we can score either 2 or 1 
	    if (flag == false && n > 1) 
	        sum = sum + CountWays(n - 1, false) + CountWays(n - 3, true); 
	  
	    // 2 is scored last time so we can only score 1 
	    else
	        sum = sum + CountWays(n - 1, false); 
	  
	    return sum; 
	} 

}
