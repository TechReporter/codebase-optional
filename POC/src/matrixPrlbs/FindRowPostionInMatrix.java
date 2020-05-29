/**
 * 
 */
package matrixPrlbs;

/**
 * @author 212720190
 * @date Nov 10, 2019
 */
public class FindRowPostionInMatrix {

	//find positon of a row in a matrix using binary search
	public static void main(String[] args) {
		int[][] arr = {{0, 0, 1, 0},
				{10, 9, 22, 23},
				{40, 40, 40, 40},
				{43, 44, 55, 68},
				{81, 73, 100, 132},
				{100, 75, 125, 133}};

		int[] row = {10, 9, 22, 23};

		int low = 0; int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			int pos = compare(arr[mid], row);
			if(pos==0) {
				System.out.println("row position at "+ mid);
				break;
			}	
			if(pos==-1) {
				high=mid-1;
			}
			if(pos==1) {
				low=mid+1;
			}		
		}
	}

	static int compare(int[] arr, int[] row) {
		for(int i=0;i<row.length;i++) {
			if(arr[i]>row[i])
				return -1;
			else if(arr[i]<row[i])
				return 1;
		}
		return 0;


	}
}
