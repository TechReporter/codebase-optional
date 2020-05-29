
package datastructure;

public class Pattern {

	
	public static void main(String[] args) {
	String name=  "iloveyou";
		String value = "*";
		int k;
		int j;
		for(int i=0;i<name.length();i++)
		{
		for(j=0;j<name.length()-i-1;j++)
		{
		System.out.print(" ");
		}
		for(k=0;k<=i;k++)
		{
		System.out.print(value+" ");
		}
		System.out.println();
		}
		char[] chr = name.toCharArray();
		for(int i=0;i<chr.length;i++) {
			System.out.print(chr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<name.length();i++) {
			for(j=0;j<i;j++)
			{
			System.out.print(" ");
			}
			for(k=0;k<=name.length()-i-1;k++)
			{
			System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}