package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 17, 2020
 */
public class LongestStreak {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> list = Arrays.asList( 
					"Tails", 
					"Tails", 
					"Tails");
			int heads=0,tails=0;
			int tailMax = 0;
			int headMax = 0;
			List<Integer> result = new ArrayList<>();
			for(String s : list) {
				if(s.equals("Heads")) {
					heads++;
					headMax = Math.max(headMax, heads);
					tails=0;
				}
				else if(s.equals("Tails")) {
					tails++;
					tailMax = Math.max(tails, tailMax);
					heads=0;
				}
			}
			result.add(headMax);
			result.add(tailMax);
	}

}
