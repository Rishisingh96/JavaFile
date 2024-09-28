package com.interviewQuestion_DSA_Java.Backtracking;

public class Permutation {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"  if we want to remove c than use substring tec
            String Newstring = str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstring, ans+current);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Your Permutation is !");
        findPermutation(str,"");
    }
}

/*Your Permutation is !
abc
acb
bac
bca
cab
cba*/
/*
Let's dry run the findPermutation function with the input string "abc".

Initial Call
Input: str = "abc", ans = ""
The function starts a loop iterating through each character in "abc".
First Iteration (i = 0)
Current Character: current = 'a'
New String: Newstring = "bc" (removing 'a')
Recursive Call: findPermutation("bc", "a")
Recursive Call with str = "bc", ans = "a"
Input: str = "bc", ans = "a"
The function starts a loop iterating through each character in "bc".
First Iteration (i = 0)
Current Character: current = 'b'
New String: Newstring = "c" (removing 'b')
Recursive Call: findPermutation("c", "ab")
Recursive Call with str = "c", ans = "ab"
Input: str = "c", ans = "ab"
The function starts a loop iterating through each character in "c".
First Iteration (i = 0)
Current Character: current = 'c'
New String: Newstring = "" (removing 'c')
Recursive Call: findPermutation("", "abc")
Base Case with str = "", ans = "abc"
Input: str = "", ans = "abc"
Since str.length() == 0, it prints "abc".
Returning from Recursive Calls
The recursion starts returning to previous calls:
From findPermutation("c", "ab"), returns after printing "abc".
From findPermutation("bc", "a"), continues to the next iteration.
Second Iteration (i = 1) in findPermutation("bc", "a")
Current Character: current = 'c'
New String: Newstring = "b" (removing 'c')
Recursive Call: findPermutation("b", "ac")
Recursive Call with str = "b", ans = "ac"
Input: str = "b", ans = "ac"
The function starts a loop iterating through each character in "b".
First Iteration (i = 0)
Current Character: current = 'b'
New String: Newstring = "" (removing 'b')
Recursive Call: findPermutation("", "acb")
Base Case with str = "", ans = "acb"
Input: str = "", ans = "acb"
Since str.length() == 0, it prints "acb".
Returning from Recursive Calls
The recursion returns to previous calls:
From findPermutation("b", "ac"), returns after printing "acb".
From findPermutation("bc", "a"), returns after both iterations.
Second Iteration (i = 1) in findPermutation("abc", "")
Current Character: current = 'b'
New String: Newstring = "ac" (removing 'b')
Recursive Call: findPermutation("ac", "b")
Recursive Call with str = "ac", ans = "b"
Input: str = "ac", ans = "b"
The function starts a loop iterating through each character in "ac".
First Iteration (i = 0)
Current Character: current = 'a'
New String: Newstring = "c" (removing 'a')
Recursive Call: findPermutation("c", "ba")
Recursive Call with str = "c", ans = "ba"
Input: str = "c", ans = "ba"
The function starts a loop iterating through each character in "c".
First Iteration (i = 0)
Current Character: current = 'c'
New String: Newstring = "" (removing 'c')
Recursive Call: findPermutation("", "bac")
Base Case with str = "", ans = "bac"
Input: str = "", ans = "bac"
Since str.length() == 0, it prints "bac".
Returning from Recursive Calls
The recursion returns to previous calls:
From findPermutation("c", "ba"), returns after printing "bac".
From findPermutation("ac", "b"), continues to the next iteration.
Second Iteration (i = 1) in findPermutation("ac", "b")
Current Character: current = 'c'
New String: Newstring = "a" (removing 'c')
Recursive Call: findPermutation("a", "bc")
Recursive Call with str = "a", ans = "bc"
Input: str = "a", ans = "bc"
The function starts a loop iterating through each character in "a".
First Iteration (i = 0)
Current Character: current = 'a'
New String: Newstring = "" (removing 'a')
Recursive Call: findPermutation("", "bca")
Base Case with str = "", ans = "bca"
Input: str = "", ans = "bca"
Since str.length() == 0, it prints "bca".
Returning from Recursive Calls
The recursion returns to previous calls:
From findPermutation("a", "bc"), returns after printing "bca".
From findPermutation("ac", "b"), returns after both iterations.
Third Iteration (i = 2) in findPermutation("abc", "")
Current Character: current = 'c'
New String: Newstring = "ab" (removing 'c')
Recursive Call: findPermutation("ab", "c")
Recursive Call with str = "ab", ans = "c"
Input: str = "ab", ans = "c"
The function starts a loop iterating through each character in "ab".
First Iteration (i = 0)
Current Character: current = 'a'
New String: Newstring = "b" (removing 'a')
Recursive Call: findPermutation("b", "ca")
Recursive Call with str = "b", ans = "ca"
Input: str = "b", ans = "ca"
The function starts a loop iterating through each character in "b".
First Iteration (i = 0)
Current Character: current = 'b'
New String: Newstring = "" (removing 'b')
Recursive Call: findPermutation("", "cab")
Base Case with str = "", ans = "cab"
Input: str = "", ans = "cab"
Since str.length() == 0, it prints "cab".
Returning from Recursive Calls
The recursion returns to previous calls:
From findPermutation("b", "ca"), returns after printing "cab".
From findPermutation("ab", "c"), continues to the next iteration.
Second Iteration (i = 1) in findPermutation("ab", "c")
Current Character: current = 'b'
New String: Newstring = "a" (removing 'b')
Recursive Call: findPermutation("a", "cb")
Recursive Call with str = "a", ans = "cb"
Input: str = "a", ans = "cb"
The function starts a loop iterating through each character in "a".
First Iteration (i = 0)
Current Character: current = 'a'
New String: Newstring = "" (removing 'a')
Recursive Call: findPermutation("", "cba")
Base Case with str = "", ans = "cba"
Input: str = "", ans = "cba"
Since str.length() == 0, it prints "cba".
Final Return
The recursion returns to previous calls:
From findPermutation("a", "cb"), returns after printing "cba".
From findPermutation("ab", "c"), returns after both iterations.
From findPermutation("abc", ""), returns after all iterations.
Final Output
The function has printed all possible permutations of the string "abc":

"abc"
"acb"
"bac"
"bca"
"cab"
"cba"





You said:
for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"  if we want to remove c than use substring tec
            String Newstring = str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstring, ans+current);
        }
    } " working of Substirng dry run
ChatGPT said:
ChatGPT
Let's dry run the working of the substring technique used in your findPermutation function.

Substring Explanation
In Java, the substring(int beginIndex, int endIndex) method returns a new string that is a substring of the original string. The substring begins at the specified beginIndex and extends to the character at endIndex - 1.

In the given code:

java
Copy code
String Newstring = str.substring(0, i) + str.substring(i + 1);
This line effectively removes the character at index i from the string str.

Let's see how this works with the string "abc" for different values of i.

Example: str = "abc"
Iteration 1 (i = 0)

Current Character (current): 'a'
Substring Calculation:
str.substring(0, 0) returns "" (an empty string).
str.substring(1) returns "bc".
New String (Newstring): "" + "bc" = "bc"
The string "abc" becomes "bc" after removing 'a'.
Iteration 2 (i = 1)

Current Character (current): 'b'
Substring Calculation:
str.substring(0, 1) returns "a".
str.substring(2) returns "c".
New String (Newstring): "a" + "c" = "ac"
The string "abc" becomes "ac" after removing 'b'.
Iteration 3 (i = 2)

Current Character (current): 'c'
Substring Calculation:
str.substring(0, 2) returns "ab".
str.substring(3) returns "" (an empty string).
New String (Newstring): "ab" + "" = "ab"
The string "abc" becomes "ab" after removing 'c'.
Dry Run Summary
When i = 0, the substring removes 'a', resulting in "bc".
When i = 1, the substring removes 'b', resulting in "ac".
When i = 2, the substring removes 'c', resulting in "ab".
This approach is used within the loop to remove each character one by one and then recursively find permutations of the remaining characters.
*/