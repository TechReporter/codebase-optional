package Arraypractice;

/**
 * @author 212720190
 * @date Feb 21, 2020
 */
public class IfArrayIsRotatedSorted {


	public static void main(String[] args) {

		int[] arr = {5,6,10,2,4};
		int  min = Integer.MAX_VALUE;
		int index =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				index = i;
			}
		}
		boolean flag=true;
		for(int i=0;i<index-1;i++) {
			if(arr[i]>arr[i+1])
				flag=false;
		}
		if(flag) {
			for(int i=index+1;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1])
					flag=false;
			}
		}
		if(flag && arr[0]>arr[arr.length-1]) {
			System.out.println("sorted and rotated");
		} else {
			System.out.println("false");
		}
	}

}
