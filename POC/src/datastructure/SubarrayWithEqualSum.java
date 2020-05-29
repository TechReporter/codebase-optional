package datastructure;

/**
 * @author 212720190
 * @date May 22, 2019
 */
public class SubarrayWithEqualSum {

	
	public static void main(String[] args) {

		int[] arr = {-1,4,2,3};
		int sum =0;

		//approach1(arr, sum);
		System.out.println(approach2(arr, 22));
	}
	
	static boolean approach2(int[] nums, int sum) {
		if(nums.length==0){
            return false;
        }
        int count =0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]>nums[i+1]) {
            	if(nums.length>3)
            	nums[i+1]=nums[i]+1;
                count++;
            }
        }
        if(count>1) {
            return false;
        }
        return true;
    }
	
	static void approach1(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int right_sum = 0;
		for(int i=arr.length-1;i>0;i--) {
			right_sum+=arr[i];
			sum-=arr[i];
			if(right_sum==sum) {
				System.out.println(i-1);
			}
		}
	}

}
