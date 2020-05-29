package leetcode;

/**
 * @author 212720190
 * @date Jul 28, 2019
 */
public class MyAtoi {

	public static void main(String[] args) {
		String str = "+-2";

		long num =0;
		boolean flag = false;
		str=str.trim();
		for(int i =0; i<str.length();i++)
		{
			if(i==0 && (int)str.charAt(i)>=97&&(int)str.charAt(i)<=122) {
				num = 0;
				break;
			}
			if(((int)str.charAt(i)>=48)&&((int)str.charAt(i)<=59))
			{
				num = num*10+ ((int)str.charAt(i)-48);

			}
			if((int)str.charAt(i)==43)
				continue;
			if((int)str.charAt(i)==45)
				flag = true;
			else if(((int)str.charAt(i)>=32)&&((int)str.charAt(i)<=47))
				break;
		}
		if(flag)
			num*=-1;
		if(num<Integer.MIN_VALUE)

			System.out.println(Integer.MIN_VALUE);
		if(num>Integer.MAX_VALUE)
			System.out.println(Integer.MAX_VALUE);
		else
			System.out.println((int)num);

	}

}
