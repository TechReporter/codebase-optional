package matrixPrlbs;

/**
 * @author 212720190
 * @date Aug 1, 2019
 */
public class MaxCountOneRow {
	public static void main(String[] args) {

		int[][] arr = 	{ 
				{0,0,1,1}, 
				{1,0,1,1}, 
				{1,1,1,1}, 
				{0,0,0,1} 
		};
		int row =0;
		int count=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int temp =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==1)
					temp++;
			}
			if(temp>count) {
				count = temp;
				row = i+1;
			}
		}
		System.out.println(row);

	}

}
