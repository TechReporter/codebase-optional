/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
public class ValidMountainArray {

	//count>=3, increasing then decreasing
	public static void main(String[] args) {
		System.out.println(checkMountain());


	}


	private static boolean checkMountain() {
		int[] arr = {0,2,3,5,2,1};
		if(arr.length<3) {
			return false;
		}
		int i=0;
		while(i<arr.length-1 && arr[i]<arr[i+1])
			i++;
		if(i==0 || i==arr.length-1)
			return false;
		for(;i<arr.length-1;++i)
			if(arr[i]<=arr[i+1])
				return false;
		return true;

	}

}
