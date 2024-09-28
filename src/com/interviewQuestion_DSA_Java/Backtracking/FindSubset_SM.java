package com.interviewQuestion_DSA_Java.Backtracking;

public class FindSubset_SM {
    public static void FindSubset(String str, String ans, int i){
        //base case

        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }

        //recursion
        //Yes choice
        FindSubset(str, ans+str.charAt(i), i+1);
        //No choice
        FindSubset(str,ans,i+1);
    }



    public static void main(String[] args) {
        String str = "abc";
        FindSubset(str,"",0);
    }
}
