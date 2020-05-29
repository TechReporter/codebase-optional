package Arraypractice;

/**
 * @author 212720190
 * @date Jan 30, 2020
 */
// max sum when no two element adjacent 
public class MaxSumNoTwoElemAdj {

	// create two variable incl and excl, 
	//incl is max(old excl+a[i], old incl) excl is old incl 
	public static void main(String[] args) {
		int[] arr = {3,7,1,8,2};
		
		int incl = arr[0];
		int excl = 0;
		for(int i=1;i<arr.length;i++) {
			int temp = incl;
			incl = Math.max(excl+arr[i], incl);
			excl = temp;
		}
		System.out.println(incl);

	}

}
