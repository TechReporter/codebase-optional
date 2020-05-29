/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class ReplaceWords {

	//648. Replace Words
	public static void main(String[] args) {
		String[] arr = {"cat", "bat", "rat"};
		String str = "the cattle was rattled by the battery";
		StringBuilder sb = new StringBuilder();
		String[] sptSplit = str.split(" ");
		for(int i=0;i<sptSplit.length;i++) {
			boolean flag=false;
			String ss = sptSplit[i];
			for(String s : arr) {
				String temp = ss.length()>=s.length()?ss.substring(0,s.length()):ss;
				if(temp.indexOf(s)!=-1) {
					flag=true;
					sb.append(s).append(" ");
					break;
				}
			}
			if(!flag)
				sb.append(ss).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
