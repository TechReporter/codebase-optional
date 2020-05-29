/**
 * 
 */
package dynamicProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javaMisc.Person;

/**
 * @author 212720190
 * @date Jan 27, 2020
 */
public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(new Person("tanmoy", UUID.randomUUID()),
				new Person("Mani", UUID.randomUUID()),new Person("sanjoy", UUID.randomUUID()));
		
		list.removeIf(ee-> !ee.getName().equalsIgnoreCase("tanmoy"));

		int[][] mat = {{4,2},
				{3,4}};
		System.out.println(find_largest_in_row_smallest_in_column_element_in_matrix(mat));


	}
	public static int find_largest_in_row_smallest_in_column_element_in_matrix(int[][] mat) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i< 10; i++){
			List<Integer> integers = new ArrayList<Integer>();
			for(int j=0; j<5; j++){
				Random random = new Random();
				integers.add(random.nextInt());
			}
			list.add(integers);
		}
		if(list.size()==0) {
			
		}
		System.out.println("ssf"+list.size());
		
		if(mat.length==0 || mat[0].length>1000)
			return -1;

		int maximum = mat[0][0];
		for (int i = 0; i < mat.length; i++) {

			int colIndexOfRowMinimum = 0;

			//Find maximum in row.
			for(int j=1; j< mat[0].length; j++){
				if(mat[i][j] > maximum){
					maximum = mat[i][j];
					colIndexOfRowMinimum = j; 
				}
			}

			//Find maximum in same column.
			for (int j = 0; j < mat.length; j++) {
				if(maximum < mat[j][colIndexOfRowMinimum]){
					return maximum;
				}
			}		
		}
		return -1;

	}
}

