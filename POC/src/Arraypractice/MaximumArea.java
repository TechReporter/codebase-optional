/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
public class MaximumArea {

	//max area between two height.
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		//here max water area between 8 & 7-> 7*7=49
		int area=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int min = Math.min(arr[i], arr[j]);
				area = Math.max(area, (j-i)*min);
			}
		}
		System.out.println(area);
	}

}
