import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author 212720190
 * @date Feb 15, 2020
 */
public class DoubleExistCheck {

	    public static boolean checkIfExist(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	        for(int i=0;i<arr.length;i++) {
	            set.add(arr[i]*2);
	        }
	                for(int i=0;i<arr.length;i++) {
	                if(set.contains(arr[i]) && arr[i] !=0)
	                    return true;
	                }
	        return false;
	    }
	
	public static void main(String[] args) {
		int[] arr = {-2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(arr));
	}

}
