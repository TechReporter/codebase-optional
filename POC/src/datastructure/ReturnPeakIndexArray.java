package datastructure;

/**
 * @author 212720190
 * @date Jan 5, 2020
 */
public class ReturnPeakIndexArray {

	public static void main(String[] args) {
		int[] A = {0,1};
		System.out.println(peakIndex(A));
	}

	static int peakIndex(int[] A) {
		if(A.length<3) {
			return -1;
		}
		for(int i=1;i<A.length-1;i++) {
			if(A[i]>A[i-1] && A[i]>A[i+1]) {
				return i;
			}
		}
		return -1;
	}

}
