/**
 * 
 */
package systemdesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class PeekingIterator implements Iterator<Integer> {
	List<Integer> list;
	int p1;
	
	public PeekingIterator(Iterator<Integer> iterator) {
		list = new ArrayList<>();
		iterator.forEachRemaining(this.list::add);
		this.p1=0;
	}
	
	public static void main(String[] args) {
		PeekingIterator obj = new PeekingIterator(Arrays.asList(1,2,3,4).iterator());
		System.out.println(obj.hasNext());
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		System.out.println(obj.next());
		System.out.println(obj.next());
		System.out.println(obj.peek());
		System.out.println(obj.peek());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
		System.out.println(obj.peek());
		System.out.println(obj.hasNext());
		System.out.println(obj.next());
		System.out.println(obj.hasNext());
	}


	@Override
	public boolean hasNext() {
		if(p1<list.size()) {
			return true;
		}
		return false;
	}
		public Integer peek() {
			if(p1<list.size())
        return list.get(p1);
			return null;
		}

	@Override
	public Integer next() {
		if(p1<list.size()) {
			return list.get(p1++);
		}
		return null;
	}

}
