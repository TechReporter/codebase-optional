package javaMisc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Nov 30, 2019
 */
public class ExceptionTricks {

	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		//List<List<Integer>> list1 = new ArrayList<ArrayList<Integer>>(); // This wont work, as generic type must be same tyep,
				//not subtype not super type

		test("");
	}
	
	public static int test(String s) throws ArrayIndexOutOfBoundsException {
		return 2;
	}
	
	public static String test(int s) throws Exception {
		return "test "+ s;
	}

}
