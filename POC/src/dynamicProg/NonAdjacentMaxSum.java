/**
 * 
 */
package dynamicProg;

/**
 * @author Tanmoy Dasgupta
 */
public class NonAdjacentMaxSum {

	//calculate max possible sum with non adjacent item.
	public static void main(String[] args) {
		int[] arr = {3,1,5,7,4,9};//3+7+9=19 max possible
		int excl = 0;
		int incl = 0;
		
		for(int i=0;i<arr.length;i++) {
			int temp = incl;
			incl = Math.max(excl+arr[i], incl);
			excl = temp;
		}
		System.out.println(incl);

	}

}
