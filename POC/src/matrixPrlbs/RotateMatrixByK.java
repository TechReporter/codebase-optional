/**
 * 
 */
package matrixPrlbs;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class RotateMatrixByK {

	public static void main(String[] args) {
		 int arr[][] = { { 9, 8, 7, 1 }, 
                 { 7, 3, 0, 2 }, 
                 { 9, 5, 3, 2 }, 
                 { 6, 3, 1, 2 } }; 
		 
		 int rotate_count = 1;
		 
		 for(int i=0;i<arr.length;i++) {
			 int temp_count=rotate_count;
			 while(temp_count>0) {
				 int temp = arr[i][0];
				 for(int j=0;j<arr.length-1;j++) {
					 arr[i][j] = arr[i][j+1];
				 }
				 arr[i][arr.length-1]=temp;
				 temp_count--;
				 
			 }
		 }
		 
		   for (int i = 0; i < arr.length; i++) { 
	            for (int j = 0; j < arr[i].length; j++) 
	                System.out.print(arr[i][j] + " "); 
	            System.out.println(); 
	        }	}

}
