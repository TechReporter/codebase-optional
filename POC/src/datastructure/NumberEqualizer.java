/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 1, 2019
 */
public class NumberEqualizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int count =1;
		int f = arr[0];
		int thresh = 10;
		for(int i=1;i<arr.length;i+=2) {
			if(arr[i]-f>=thresh) {
				count+=2;
				break;
			} else {
				count++;
			}
			if(i==arr.length-1) {
				count = arr.length;
			}
		}
		
		System.out.println(count);	

		/*

		int[] arr = {1234,4321};
		int[] arr1 = {2345,3214};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int n= arr[i];
			int m= arr1[i];
			 while(n>0 &&m>0) {
				 int num1,num2=0;
				 num1 = n%10;
				 num2=m%10;
				 if(num1>num2)
				 count+=num1-num2;
				 else
					 count+=num2-num1;
				 n=n/10;
				 m=m/10;
			 }
		}
		System.out.println(count);

	*/}

}
