package com.interviewQuestion_DSA_Java.String_3.All_method;

public class StringAllMethod {
    public static void main(String[] args) {
        String st1 = " RISHI ";
        String st2 = " RISHI ";
        String st3 = "RI" + "SHI";
        String st4 = "rishi";
        // System.out.println(st3);
        // System.out.println("chaking :" + st1 == st2);
        // System.out.println("chaking :" + (st1 == st2));
        // System.out.println(st1.toLowerCase());
        // System.out.println(st1);

        // Forcefully change String value
        // System.out.println(st1 = st1.toLowerCase()); // for changing the String
        // forcefully Altered
        // System.out.println(st1);

        // ignore case
        // st1.compareToIgnoreCase(st4);
        // System.out.println(st1 == st4);
        // System.out.println(st1.equals(st4)); // true

        // 1 chatAt and codePointAt
        String str = "Hellow";
        char ch = str.charAt(1);
        int codePoint = str.codePointAt(1);
        // System.out.println(ch);
        // System.out.println(codePoint);

        // 2 compare to
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        int result = str1.compareTo(str2);
        int Cresult = str3.compareTo(str3);
        // System.out.println(result); // -1 false
        // System.out.println(Cresult); // 0 true

        // 3 length find
        String st = "My name is Rishi Singh";
        System.out.println(st);
        System.out.println(st.length());
        // I want to last element print
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(st.length() - 1));

        // 4 concating string
        // String st5 = st1 + st2
        // System.out.println(st5);
        // String concat = st1.concat(st2);
        // System.out.println(concat);

        // 5 substring and indexof substring(int beginIndex): Returns a substring
        // starting from the specified index.
        String str5 = "Rishi singh";
        String sub = str5.substring(2);
        // System.out.println(sub);
        String sub1 = str5.substring(2, 6);
        // System.out.println(sub1);

        // indexOf(int ch): Returns the index within this string of the first occurrence
        // of the specified character.
        // int index = str5.indexOf('s');
        System.out.println(str5.indexOf('s'));

        String[] parts = str5.split(" ");
        for(String split:parts){
            System.out.println(split);
        }

    }
}
