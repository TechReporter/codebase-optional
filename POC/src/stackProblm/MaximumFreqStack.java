package stackProblm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class MaximumFreqStack {

	Map<Integer, Integer> elemFreq;
	// Stores the freq v/s the stack of elements at that freq.
	Map<Integer, List<Integer>> freqElem;
	int maxFreq = 0;

	public MaximumFreqStack() {
		this.elemFreq = new HashMap<>();
		this.freqElem = new HashMap<>();
	}

	public void push(int x) {
		elemFreq.merge(x, 1, Integer::sum);
		int freq = elemFreq.get(x);
		maxFreq = Math.max(freq, maxFreq);
		List<Integer> stack = freqElem.getOrDefault(freq, new ArrayList<>());
		stack.add(x);
		freqElem.put(freq, stack);
	}

	public int pop() {
		List<Integer> stack = freqElem.get(maxFreq);
		int elem = stack.remove(stack.size() - 1);
		if (stack.isEmpty()) {
			freqElem.remove(maxFreq);
			maxFreq--;
		}
		elemFreq.compute(elem, (k,v) -> {
			if (v == 1) return null;
			return v-1;
		});
		return elem;
	}


	public static void main(String[] args) {
		MaximumFreqStack obj = new MaximumFreqStack();
		obj.push(5);
		obj.push(7);
		obj.push(5);
		obj.push(7);
		obj.push(4);
		obj.push(5);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}
}
