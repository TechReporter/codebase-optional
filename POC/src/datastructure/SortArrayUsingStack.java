/**
 * 
 */
package datastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Apr 12, 2019
 */
public class SortArrayUsingStack {


	public static void main(String[] args) {
		
		Stack<Integer> arrayData = new Stack<>();
		arrayData.push(10);
		arrayData.push(12);
		arrayData.push(3);
		arrayData.push(18);
		arrayData.push(20);
		arrayData.push(15);
		arrayData.push(11);
		Stack<Integer> sortData = sortArray(arrayData);
		while(!sortData.isEmpty()) {
			System.out.println(sortData.pop());
		}
	}
	
	private static Stack<Integer> sortArray(Stack<Integer> data) {
		
		Stack<Integer> tempArray = new Stack<>();
		while(!data.isEmpty()) {
			
			int tempValue = data.pop();
			while(!tempArray.isEmpty() && tempArray.peek()<tempValue) {
				data.push(tempArray.pop());
			}
			tempArray.push(tempValue);
		}
		return tempArray;
	}

}
