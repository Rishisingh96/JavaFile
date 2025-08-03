package com.interviewQuestion_DSA_Java.Tries_37;

public class WordBreakProblem {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;

        TrieNode() {
            // No need to initialize children manually to null; it's default for arrays in Java
        }
    }

    static TrieNode root = new TrieNode();

    // Insert a word into Trie
    public static void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEndOfWord = true;
    }

    // Search if a word exists in the Trie
    public static boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return node.isEndOfWord;
    }

    // Word Break Problem using Trie and Recursion
    public static boolean wordBreak(String key) {
        if (key.length() == 0) return true;

        for (int i = 1; i <= key.length(); i++) {
            String prefix = key.substring(0, i);
            String suffix = key.substring(i);
            if (search(prefix) && wordBreak(suffix)) {
                return true;
            }
        }
        return false;
    }

    // Optional: Check if any word starts with a prefix
    public static boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] dictionary = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for (String word : dictionary) {
            insert(word);
        }

        String key1 = "ilikesam";
        String key2 = "ilikeicecream";
        String key3 = "ilikesame"; // false - 'same' not in dictionary

        System.out.println("Can break 'ilikesam'? " + wordBreak(key1));         // true
        System.out.println("Can break 'ilikeicecream'? " + wordBreak(key2));   // false
        System.out.println("Can break 'ilikesame'? " + wordBreak(key3));       // false
    }
}
