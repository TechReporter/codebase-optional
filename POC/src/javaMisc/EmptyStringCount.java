package javaMisc;

import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Nov 27, 2019
 */
public class EmptyStringCount {
	
	public static void main(String[] args) {
		
		String cc=  "sdsd";
		cc= cc.concat("sdsdsdsds").concat("tanmoy");
System.out.println(cc);
		List<String> empty = Arrays.asList("","tanmoy","mani","","");
		int count=0;
		count = (int) empty.stream().filter(e->
			e.length()==0).count();
		System.out.println(count);
	}

}
