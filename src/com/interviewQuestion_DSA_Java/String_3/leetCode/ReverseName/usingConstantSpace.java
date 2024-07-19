package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;
// Java does not have built-in swap function to swap
// characters of a string

public class usingConstantSpace {
    public static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
    public static String reverse_words(String s)
    {
        int left = 0, i = 0, n = s.length();
        while (s.charAt(i) == ' ')
            i++;
        left = i;
        while (i < n) {
            if (i + 1 == n || s.charAt(i) == ' ') {
                int j = i - 1;
                if (i + 1 == n)
                    j++;

                while (left < j)
                    s = swap(s, left++, j--);

                left = i + 1;
            }
            if (i > left && s.charAt(left) == ' ')
                left = i;
            i++;
        }
        // Use StringBuilder ".reverse()" method to reverse
        // the whole string.
        s = new StringBuilder(s).reverse().toString();
        return s;
    }
    public static void main(String[] args) {
        String str
                = "i like this program very much";
        str = reverse_words(str);
        System.out.println(str);
    }
}
