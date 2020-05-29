package matrixPrlbs;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class SameRowCountMatrix {

	public static void main(String[] args) {
		int mat[][] = {{1, 1, 1}, 
					   {1, 2, 3}, 
					   {5, 0, 5}};
		int count=0;
		for(int i=0;i<mat.length;i++) {
			Set<Integer> set = new HashSet<>();
			for(int j=0;j<mat.length;j++) {
				set.add(mat[i][j]);
			}
			if(set.size()==1)
			count++;	
		}
		System.out.println(count);
	}

}
