package leetcode;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class AllStrngCmbntnWithKLen {

	public static void main(String[] args) {
		String s = "abcdef";
		int len=3;
		//result[abc,acd,ade,aef,bcd,bde,bef...]
		helperShell("", 0, len,s);

	}

	static void helperShell(String curr,int index,int len,String str) {
		if(curr.length()==len)
			System.out.println(curr);
		for(int i=index;i<str.length();i++)
			helperShell(curr.concat(String.valueOf(str.charAt(i))), i+1, len,str);
	}

}
