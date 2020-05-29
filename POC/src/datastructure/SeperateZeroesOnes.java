package datastructure;

import java.util.Arrays;

public class SeperateZeroesOnes {

	public static void main(String[] args) {

		int[] array = {1,0,0,1,0,1,1,1,0,1};
		int zero_counter = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i] == 0) {
				array[zero_counter++] = 0;
			}
		}
		while(zero_counter<array.length) {
			array[zero_counter++] = 1;
		}
		
		System.out.println(Arrays.toString(array));
	}

}
