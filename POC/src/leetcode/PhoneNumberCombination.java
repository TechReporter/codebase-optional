/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class PhoneNumberCombination {

	
	public static void main(String[] args) {
		String str = "234";
		String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		List<String> res = new ArrayList<>();
		helper(res,0,str,arr,"");
	}
	
	static void helper(List<String> res,int index,String str,String[] arr,String curr) {
		if(curr.length()==str.length()) {
			res.add(curr);
			return;
		}
		String ss = arr[str.charAt(index)-'0'];
		for(int i=0;i<ss.length();i++) {
			helper(res, index+1, str, arr, curr.concat(String.valueOf(ss.charAt(i))));
		}
	}

}
