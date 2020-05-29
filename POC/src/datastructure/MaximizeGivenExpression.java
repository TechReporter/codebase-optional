package datastructure;

/**
 * @author 212720190
 * @date May 12, 2019		
 */
public class MaximizeGivenExpression {
//(arr[i] – i) – (arr[j] – j) --maximize the resultant in a array O(n)
	public static void main(String[] args) {

		int[] arr = {3,5,4,1,6};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-i>max)
				max = arr[i]-i;
			if(arr[i]-i<min)
				min=arr[i]-i;
		}
		System.out.println(max-min);
	
	}

}
