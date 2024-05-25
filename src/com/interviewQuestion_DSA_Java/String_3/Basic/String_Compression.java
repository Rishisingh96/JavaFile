package com.interviewQuestion_DSA_Java.String_3.Basic;

public class String_Compression {
    public static String compress(String str){
        String newStr = "";
        // aabc
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;       
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static String stingBuffered2(String str){
        StringBuffer ns = new StringBuffer("");
        for(int i=0; i<str.length(); i++){
                // ns.append(str.charAt(i));
                ns.append(str.toString());
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "abbbbccd";
     //   System.out.println(compress(str));

        System.out.println(stingBuffered2(str));
    }
}
