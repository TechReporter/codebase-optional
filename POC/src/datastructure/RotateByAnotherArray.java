/**
 * 
 */
package datastructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author 212720190
 * @date Dec 11, 2019
 */
// rotate array with another array, fid position of max element everytime in main array
public class RotateByAnotherArray {

	public static void main(String[] args) {
		getMaxElementIndexes(Arrays.asList(2,4,1), Arrays.asList(1,3,2,0));	
	}
	
	public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
	       Integer[] arr = new Integer[rotate.size()];
	        Integer max = a.stream().max(Comparator.comparing(Integer::valueOf))
	                .get();
	        for(int i=0;i<rotate.size();i++) {
	              int[] temp = a.stream()
	                        .mapToInt(Integer::intValue).toArray();
	              int m=0;
	              while(m<rotate.get(i)) {
	                  leftRotateOneTimes(temp);
	                  m++;
	              }
	            arr[i] = IntStream.range(0, temp.length) 
	                    .filter(ss -> max == temp[ss]) 
	                    .findFirst()
	                    .orElse(-1); 
	        }
	    return Arrays.asList(arr);
	    }

	    public static void leftRotateOneTimes(int[] arr)
	    {
	        int first = arr[0];
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        arr[arr.length - 1] = first;
	    }
}
