package datastructure;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class MaxNonOverlappingTripletDuplet {

	public static void main(String[] args) {

		int[] arr = {6,1,4,6,3,2,7,4};
		int k=3,L=2;
		System.out.println(getVla(arr,k,L));
	}

	static int getVla(int[] arr, int k,int l) {
		int temp = Integer.MIN_VALUE;
		int temp1 = Integer.MIN_VALUE;
		if(arr.length>=k+l) {
			for(int i = 0;i<arr.length-l-1;i++) {
				int sum = 0;
				int ii=0;
				while(ii<k) {
					sum+=arr[i+ii];
					ii++;
				}
				for(int j=i+3;j<arr.length-1;j++) {
					int sum1=0;
					int kk=0;
					while(kk<l) {
						sum1+=arr[j+kk];
						kk++;
					}
					if(sum1>temp1)
						temp1=sum1;
				}
				sum+=temp1;
				if(sum>temp)
					temp=sum;
			}
			return temp;
		} else {
			return -1;
		}
	}
}
