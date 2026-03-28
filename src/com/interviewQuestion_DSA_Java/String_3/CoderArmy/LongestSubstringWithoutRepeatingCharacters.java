package com.interviewQuestion_DSA_Java.String_3.CoderArmy;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
        public static int UsingHashSet(String s) {
            int windowStart = 0;
            int windowEnd = 0;
            int n=s.length();
            HashSet<Character> set = new HashSet<>();
            int maxLen = Integer.MIN_VALUE;
//            int len = 0;

            while(windowEnd<n){
                char ch = s.charAt(windowEnd);
                if(set.contains(ch)){
                    // Shrinking
                    while(windowStart<windowEnd && set.contains(ch)){
                        set.remove(s.charAt(windowStart));
                        windowStart++;
                    }
                }
                set.add(ch);
                maxLen = Math.max(maxLen, windowEnd-windowStart+1);
                windowEnd++;
            }
            return (maxLen == Integer.MIN_VALUE)?0:maxLen;
        }

    public static int UsingHashMap(String s) {

        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = Integer.MIN_VALUE;

        while (windowEnd < n) {

            char ch = s.charAt(windowEnd);

            if (map.containsKey(ch) && map.get(ch) >= windowStart) {
                windowStart = map.get(ch) + 1;
            }

            map.put(ch, windowEnd);

            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);

            windowEnd++;
        }

        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }

    static void main() {
        String s = "abcabcbb";
        int res = UsingHashSet(s);
        System.out.println(res);

        int res2 = UsingHashMap(s);
//        System.out.println(res2);
    }
}
