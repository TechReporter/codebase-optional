/**
 * 
 */
package trie;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class TriePrefixSearch {
	TrieNode root;

	public TriePrefixSearch() {
		root = new TrieNode();
	}

	class TrieNode {
		private TrieNode[] nodes;
		int size=26;
		private boolean isEnd;

		public TrieNode() {
			nodes = new TrieNode[size];
		}
		public boolean containsKey(char ch) {
			return nodes[ch-'a']!=null;
		}

		public TrieNode get(char ch) {
			return nodes[ch-'a'];
		}

		public void put(char ch,TrieNode node) {
			nodes[ch-'a']=node;
		}
		public boolean isEnd() {
			return isEnd;
		}
		public void setEnd() {
			this.isEnd = true;
		}

	}

	public TrieNode insert(String word) {
		if(word!=null) {
			TrieNode node = root;
			for(int i=0;i<word.length();i++) {
				if(!node.containsKey(word.charAt(i))) {
					node.put(word.charAt(i), new TrieNode());
				}
				node = node.get(word.charAt(i));
			}
			node.setEnd();
		}
		return root;
	}

	public boolean searchWord(String word) {
		TrieNode node = root;
		for(int i=0;i<word.length();i++) {
			if(node.containsKey(word.charAt(i))) {
				node = node.get(word.charAt(i));
			} else {
				return false;
			}
		}
		if(node!=null && node.isEnd()) {
			return true;
		}
		return false;
	}
	
	public boolean searchPrefix(String word) {
		TrieNode node = root;
		for(int i=0;i<word.length();i++) {
			if(node.containsKey(word.charAt(i))) {
				node = node.get(word.charAt(i));
			} else {
				return false;
			}
		}
		if(node!=null) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		TriePrefixSearch obj = new TriePrefixSearch();
		obj.insert("tanmoy");
		
		System.out.println(obj.searchWord("tanmoy"));
		System.out.println(obj.searchPrefix("tan"));
	}

}
