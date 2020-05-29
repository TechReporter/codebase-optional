package leetcode;

/**
 * @author 212720190
 * @date Jul 29, 2019
 */
public class EqualSumSubArrays {

	public static void main(String[] args) {

	    int arr[] = {1 , 5 , 3 , 4 , 4 , 5, 1,3};
        int splitPoint = findSplitPoint(arr);
	    for(int i=0;i<arr.length;i++) {
	    	if(splitPoint == i)
	    		System.out.println(); 
            
            System.out.print(arr[i] + " "); 
	    }
	}
	
	static int findSplitPoint(int arr[]) {
	    int leftSum=0;
	    for(int i=0;i<arr.length;i++) {
	    	leftSum+=arr[i];
	    }
	    int rightSum=0;
	    for(int j=arr.length-1;j>=0;j--) {
	    	rightSum+=arr[j];
	    	leftSum-=arr[j];
	    	if(leftSum==rightSum)
	    		return j;
	    }
	    return -1;
	}
	
	//alternate method

}
