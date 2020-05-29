package dynamicProg;

/**
 * @author 212720190
 * @date Jan 22, 2020
 */
public class RainTrapping {

	public static void main(String[] args) {

		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int water = 0;
		left[0]=0;
		right[arr.length-1] = arr[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		for(int i=arr.length-2;i>=0;i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		
		for(int i=0;i<arr.length;i++) {
			water += Math.min(left[i], right[i])-arr[i];
		}
		System.out.println(water);
		
	}

}
