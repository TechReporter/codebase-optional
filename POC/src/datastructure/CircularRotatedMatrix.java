package datastructure;

/**
 * @author Tanmoy Dasgupta
 * @date Jun 8, 2019
 */
public class CircularRotatedMatrix {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3,4},
					   {4,1,2,3},
					   {3,4,1,2},
					   {2,3,4,1}};
		
		String str= "";
		for(int i=0;i<arr.length;i++) {
			str+=String.valueOf(arr[0][i]);
		}
		str+=str;
		
		for(int i=1;i<arr.length;i++) {
			String temp="";
			for(int j=0;j<arr.length;j++) {
				temp+=String.valueOf(arr[i][j]);
			}
			if(str.contains(temp))
				System.out.println("contains");
			else
				System.out.println("not contains");
		}
	}

}
