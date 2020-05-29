package systemdesign;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class CompressedStringIterator {
	String ss;
	List<Character> list;
	int p1;
	public CompressedStringIterator(String s) {
		this.ss = s;
		list = new ArrayList<Character>();
		char[] ch = ss.toCharArray();
		for(int i=1;i<ss.length();i++) {
			if(Character.isDigit(ch[i])) {
				int digit = Character.getNumericValue(ch[i]);
				while(digit>0) {
					list.add(ch[i-1]);
					digit--;
				}
			}
		}
	}

	public Character next() {
		if(p1<list.size()) {
			return list.get(p1++);
		}
		return ' ';
	}

	public boolean hasNext() {
		if(p1<list.size()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		CompressedStringIterator obj = new CompressedStringIterator("L1e2t1C1o1d1e1");
		System.out.println(obj.next()); 
		System.out.println(obj.next()); 
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
	}

}
