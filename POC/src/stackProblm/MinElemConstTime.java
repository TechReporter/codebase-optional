package stackProblm;

import java.util.Stack;

/**
 * @author 212720190
 * @date Jun 2, 2019
 */
public class MinElemConstTime {

	Stack<Integer> mainS = new Stack<>();
	int[] aux = new int[1000];
	int top=0;

	void pushData(int s) {
		if(mainS.isEmpty())
			mainS.push(s);
		else if(s<=peekItem()){
			mainS.push(s);
		} else {
			while(!mainS.isEmpty() && s>peekItem()) {
				aux[top++]=popItem();
			}
			mainS.push(s);
			while(top>0) {
				mainS.push(aux[--top]);

			}
		}
		mainS.forEach(System.out::println);

		System.out.println(s+" data pushed , main stack size "+mainS.size());
	}

	int peekItem() {
		return mainS.peek();
	}
	int popItem() {
		return mainS.pop();
	}

	void getMinElement() {
		if(mainS.isEmpty()) {
			System.out.println("no element in aux stack");
		} else {
			System.out.println("current min element "+mainS.pop());
		}
	}




	//design a stack which return min elemnt at any time in constant time from stack.
	public static void main(String[] args) {

		MinElemConstTime obj = new MinElemConstTime();
		obj.pushData(10);
		obj.pushData(7);
		obj.pushData(12);
		obj.pushData(17);
		obj.getMinElement();

		obj.pushData(4);
		obj.pushData(110);
		obj.getMinElement();

		obj.pushData(6);
		obj.getMinElement();
		obj.getMinElement();
		obj.getMinElement();

	}

}
