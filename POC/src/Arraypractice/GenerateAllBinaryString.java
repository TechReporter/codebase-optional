package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class GenerateAllBinaryString {

	
	public static void main(String[] args) {
		printBinaryCombination(new int[3],0); 

	}
	 public static void printBinaryCombination(int[] arr, int i) {
	        if (i==arr.length) {
	            System.out.println(Arrays.toString(arr));
	            return;
	        }
	        arr[i]=0;
	        printBinaryCombination(arr,i+1);
	        arr[i]=1;
	        printBinaryCombination(arr, i+1);
	    }

}
