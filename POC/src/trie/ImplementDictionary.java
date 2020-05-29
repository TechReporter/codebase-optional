/**
 * 
 */
package trie;

/**
 * @author 212720190
 * @date Mar 27, 2020
 */
public class ImplementDictionary {
	TrieNode root;

	public ImplementDictionary() {
		root = new TrieNode();
	}
	class TrieNode {
		TrieNode[] nodes;
		int size = 26;
		boolean isEnd;
		String meaning;

		public TrieNode() {
			nodes = new TrieNode[size];
		}

		public boolean containsKey(char ch) {
			return nodes[ch-'a']!=null;
		}

		public TrieNode get(char ch) {
			return nodes[ch-'a'];
		}

		public TrieNode put(char ch, TrieNode node) {
			return nodes[ch-'a']=node;
		}

		public boolean isEnd() {
			return isEnd;
		}
		public void setEnd() {
			this.isEnd = true;
		}
	}

	void insertStr(String word, String meaning) {
		if(word!=null) {
			TrieNode node = root;
			for(int i=0;i<word.length();i++) {
				if(!node.containsKey(word.charAt(i))) {
					node.put(word.charAt(i), new TrieNode());
				}
				node = node.get(word.charAt(i));
			}
			node.setEnd();
			node.meaning=meaning;
		}
	}

	String searchMeaning(String word) {
		if(word!=null) {
			TrieNode node = root;
			for(int i=0;i<word.length();i++) {
				if(node.containsKey(word.charAt(i))) {
					node = node.get(word.charAt(i));
				} else {
					return "";
				}
			}
			if(node!=null && node.isEnd) {
				return node.meaning;
			}
		}
		return "";
	}

	//given a word, search it in trie, if present return its meaning , else return empty; 
	public static void main(String[] args) {
		ImplementDictionary obj = new ImplementDictionary();
		obj.insertStr("tanmoy","passionate determine but little emotional");
		System.out.println(obj.searchMeaning("mani"));

	}

}
