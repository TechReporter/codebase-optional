package datastructure;

/**
 * @author 212720190
 * @date Dec 28, 2019
 */
public class ReverseInteger {


	public static void main(String[] args) {

		System.out.println(cacl(-120));
	}
	
	static int cacl(int a) {
		int res=0;
		while(a!=0) {
			int val = a%10;
			a=a/10;
			if((res>Integer.MAX_VALUE/10) || (res==Integer.MAX_VALUE/10 && val>7))
				return 0;
			if((res<Integer.MIN_VALUE/10) || (res==Integer.MIN_VALUE/10 && val<-8))
				return 0;
			res = res*10+val;
		}
		
		return res;
	}

}
