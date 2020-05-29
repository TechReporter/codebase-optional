/**
 * 
 */
package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 8, 2020
 */
public class RotateLeft {

	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int d=6;
		int temp =0;
        if(d>=arr.length)
        temp=d%arr.length;
        else
        temp=d;
        while(temp>0) {
            int t = arr[0];
        for(int i=1;i<=arr.length-1;i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=t;
        temp--;
    }
    System.out.println(Arrays.toString(arr));
	}

}
