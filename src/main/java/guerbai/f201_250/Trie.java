package guerbai.f201_250;

import guerbai.util.TrieNode;

// 教程：https://leetcode.com/problems/implement-trie-prefix-tree/solution/
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode pointer = root;
        for (char c: word.toCharArray()) {
            if (!pointer.containsKey(c)) {
                pointer.put(c, new TrieNode());
            }
            pointer = pointer.get(c);
        }
        pointer.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode pointer = root;
        for (char c: word.toCharArray()) {
            if (!pointer.containsKey(c)) {
                return false;
            }
            pointer = pointer.get(c);
        }
        return pointer.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode pointer = root;
        for (char c: prefix.toCharArray()) {
            if (!pointer.containsKey(c)) {
                return false;
            }
            pointer = pointer.get(c);
        }
        return true;
    }

}
