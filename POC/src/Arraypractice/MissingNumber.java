/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 25, 2020
 */
public class MissingNumber {

// find missing numbers. if extra space allowed;
	public static void main(String[] args) {
/*		int[] arr = {4,3,2,7,8,2,3,1};
		int[] temp = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]=1;
		}
		for(int i=1;i<temp.length;i++) {
			if(temp[i]==0)
				System.out.println(i);
		}*/
		noExtraSpace();
	}
	
	static void noExtraSpace() {
		int[] arr = {4,3,2,7,8,2,3,1};
		for(int i=0;i<arr.length;i++) {
			int index=Math.abs(arr[i])-1;
			arr[index] = -1*Math.abs(arr[index]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(i+1);
			}
		}
	}

}
