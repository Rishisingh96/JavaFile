package com.interviewQuestion_DSA_Java.Tries_37;

public class StartsWithProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // eow = end of word
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
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

    public static void findPrefix(Node root, String ans) {
        if (root == null) return;

        if (root.freq == 1) {
            System.out.println("Prefix: " + ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println("Does prefix '" + prefix1 + "' exist? " + startWith(prefix1));
        System.out.println("Does prefix '" + prefix2 + "' exist? " + startWith(prefix2));

        System.out.println("\nUnique Prefixes:");
        findPrefix(root, "");
    }
}
