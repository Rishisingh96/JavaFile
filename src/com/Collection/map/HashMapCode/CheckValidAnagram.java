package com.Collection.map.HashMapCode;

import java.util.HashMap;

public class CheckValidAnagram {

    /**
     * This method checks if two strings are anagrams of each other.
     * It uses a HashMap to count the occurrences of each character in the first string,
     * and then decrements the count based on the characters in the second string.
     * If all counts reach zero, the strings are anagrams.
     *
     * @param s The first string
     * @param t The second string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean isAnagram(String s , String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
//        String s = "race";          //O(n)
//        String t = "care";

        String s = "tulip";          //O(n)
        String t = "lipid";

        System.out.println(isAnagram(s, t)); // Output: true
    }
}
