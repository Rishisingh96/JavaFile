package com.interviewQuestion_DSA_Java.Tries_37;

public class WordBreakProblem {
    static class TrieNode {
        InsertInTrie.TrieNode[] children;
        boolean isEndOfWord;

        TrieNode() {
            children = new InsertInTrie.TrieNode[26]; // All initialized to null by default
            isEndOfWord = false;
        }
    }

    static InsertInTrie.TrieNode root = new InsertInTrie.TrieNode();

    // Inserts a word into the trie
    public static void insert(String word) {
        InsertInTrie.TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new InsertInTrie.TrieNode();
            }
            node = node.children[idx];
        }
        node.isEndOfWord = true;
    }

    // Searches for a word in the trie
    public static boolean search(String word) {
        InsertInTrie.TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return node.isEndOfWord;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=0; i<=key.length(); i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    // Checks if any word in the trie starts with the given prefix
    public static boolean startsWith(String prefix) {
        InsertInTrie.TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};
        for (String word : words) {
            insert(word);
            System.out.println("Inserted: " + word);
        }
        System.out.println("-------------------------------------");
        // Sample test
        System.out.println("Search 'the': " + search("the"));       // true
        System.out.println("Search 'these': " + search("these"));   // false
        System.out.println("Prefix 'th': " + startsWith("th"));     // true


        System.out.println("=============================");
        String key = "Threre";
        System.out.println(wordBreak(key));
    }
}
