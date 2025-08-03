package com.interviewQuestion_DSA_Java.Tries_37;

public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; //eow stands for end of word
        int freq;

        public Node() {
            for(int i =0; i<children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) { // Convert each character to an index
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) { // O[L] longest words
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println("Prefix: " + ans);
            return;
        }
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i],ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}
