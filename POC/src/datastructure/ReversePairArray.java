/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 28, 2019
 */
public class ReversePairArray {


	public static void main(String[] args) {

		int[] arr = {4, 6, 8, 9, 1, 5, 10, 11};
		int f_end_index = 0;
		int s_start_index =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				f_end_index=i;
				break;

			}

		}
		int result = 0;
		s_start_index=f_end_index+1;
		int f_arr_start=0;
		int s_arr_start= s_start_index;
		
		while(f_arr_start<=f_end_index && s_arr_start<=arr.length) {
			if(arr[f_arr_start]>= arr[s_arr_start]) {
				s_arr_start++;
				result+=f_end_index+f_arr_start;
			} else {
				f_arr_start++;
			}
		}

System.out.println(result);




	}

}
