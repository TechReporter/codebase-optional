import java.util.Arrays;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{0,0,1,5,0,9,10,0,0}
		//move zeroes to last
		int[] arr = {0,0,1,5,0,9,10,0};
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k++]=arr[i];
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
