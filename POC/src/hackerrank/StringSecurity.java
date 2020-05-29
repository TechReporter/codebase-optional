/**
 * 
 */
package hackerrank;

/**
 * @author 212720190
 * @date Mar 16, 2020
 */
public class StringSecurity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ocniaaisorfqxzjztvcgvzlcedwnezbwxmpobmrvxaskwvvwquudrnwhmmzheqxiwhfuxavlwftgyxxhpygspvwdnvmgnwnpkdrn";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int aa = (str.charAt(i)-'a'+25);
			if(aa>25) {
				sum+=aa%25-1;
			} else {
				sum+=aa;
			}
		}
		System.out.println(sum);
	}

}
