/*
In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
*/
import java.util.List;
class TrieNode {
	char val;
	TrieNode[] children;
	boolean isWord;
	
	public TrieNode (char val) {
		this.val = val;
		this.children = new TrieNode[26];
		this.isWord = false;
	}
}

public class LeetCode {
	
	public String replaceWords(List<String> dict, String sentence) {
		String[] strings = sentence.split(" ");
		TrieNode trie = buildTrie(dict);
		return replaceWords(strings, trie);
	}
	
	public String replaceWords(String[] strings, TrieNode root) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String str : strings) {
			stringBuilder.append(getShortestReplacement(str, root));
			stringBuilder.append(" ");
		}
		return stringBuilder.substring(0, stringBuilder.length()-1);
	}
	
	public String getShortestReplacement(String str, final TrieNode root) {
		TrieNode tmp = root;
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : str.toCharArray()) {
			stringBuilder.append(c);
			if (tmp.children[c-'a'] != null) {
				if (tmp.children[c-'a'].isWord) {
					return stringBuilder.toString();
				}
				tmp = tmp.children[c-'a'];
			} else {
				return str;
			}
		}
		return str;
	}
	
	private TrieNode buildTrie(List<String> strings) {
		TrieNode root = new TrieNode(' ');
		for (String str : strings) {
			TrieNode tmp = root;
			for (char c : str.toCharArray()) {
				if (tmp.children[c-'a'] == null) 
					tmp.children[c-'a'] = new TrieNode(c);
				tmp = tmp.children[c-'a'];
			}
			tmp.isWord = true;
		}
		return root;
	}
	
}
