package datastructure;

/**
 * @author 212720190
 * @date May 23, 2019
 */
public class ExponentialEqution {
	//e^x = 1 + x/1! + x^2/2! + x^3/3! + ...... can be written
//e^x = 1 + (x/1) (1 + (x/2) (1 + (x/3) (........) ) ) 

	public static void main(String[] args) {
		float sum =1;
		int x = 1;
		int length = 10;
		for(int i = length-1; i>0;--i) {
			sum = 1+ x*(sum/i);
		}
		System.out.println(sum);
		
	}

}
