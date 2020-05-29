import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

		//19 --> 1^2+9^2=82=68=100=1
	public static void main(String[] args) {
		int number = 100;
		Set<Integer> set = new HashSet<>();
		while(!set.contains(number)) {
			set.add(number);
			number = getDigit(number);
			if(number==1) {
				System.out.println("happy numebr");
				break;
			}
		}
		
	}
	
	static int getDigit(int number) {
		int sum =0;
		while(number>0) {
			int rem = number%10;
			sum+=Math.pow(rem, 2);
			number/=10;
		}
		return sum;
	}

}
