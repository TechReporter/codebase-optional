/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 7, 2020
 */
public class BirthDayChocolate {

	//
	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(4,5,4,5,1,2,1,4,3,2,4,4,3,5,2,2,5,4,3,2,3,5,2,1,5,2,3,1,2,3,3,1,2,5);
		 int k=6; int sum=18;
	        int count=0;
	        int currSum=0;
	        int i=0;
	        while(i<k) {
	            currSum+=s.get(i);
	                i++;
	        }
	        if(currSum==sum)
                count++;
	        while(i<s.size()) {
	            currSum+=s.get(i)-s.get(i-k);
	            if(currSum==sum)
	                count++;
	                i++;
	        }
		System.out.println(count);
	}

}
