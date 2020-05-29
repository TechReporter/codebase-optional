/**
 * 
 */
package matrixPrlbs;

/**
 * @author 212720190
 * @date Apr 10, 2019
 */
public class RowSort2dArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int arr[][] = { { 9, 8, 7, 1 }, 
                 { 7, 3, 0, 2 }, 
                 { 9, 5, 3, 2 }, 
                 { 6, 3, 1, 2 } }; 
		 sortMatrix(arr);
	}

	
	private static void sortMatrix(int arr[][]) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0; k<arr[i].length-j-1;k++) {
				
					if(arr[i][k]>arr[i][k+1]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i][k+1];
						arr[i][k+1] = temp;
					}
				}
			}
		}
		
	    for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        }
	}
	
}
