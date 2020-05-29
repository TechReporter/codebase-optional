package javaMisc;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class Index {
	{
		count = 1;
	}
	int count = 3;
	
	public Index(int c) {
		this.count = c;
	}
	void go() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Index(2).go();

	}

}
