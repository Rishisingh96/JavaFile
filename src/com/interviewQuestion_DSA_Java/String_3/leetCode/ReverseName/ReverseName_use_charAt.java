package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

public class ReverseName_use_charAt {
    static String reverseName(String st) {
        char[] reversed = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            reversed[i] = st.charAt(st.length() - 1 - i);
        }
        return new String(reversed);
    }
    public static void main(String[] args) {
        String name = "Rishi singh";
        String reversedName = reverseName(name);
        System.out.println(STR."Reversed Name: \{reversedName}");
    }
}
/*Sure, let's dry run the code step by step:

1. **Input**: `name = "Rishi"`

2. The `reverseName` method is called with the input string `"Rishi"`.

3. Inside the `reverseName` method:
   - A character array `reversed` is created with the same length as the input string, which is 5 in this case.
   - A loop iterates from `i = 0` to `i = 4`.
   - In each iteration:
     - `reversed[i]` is assigned the character at the index `(length - 1 - i)` of the input string `"Rishi"`. So:
       - When `i = 0`, `reversed[0] = st.charAt(5 - 1 - 0) = st.charAt(4) = 'i'`
       - When `i = 1`, `reversed[1] = st.charAt(5 - 1 - 1) = st.charAt(3) = 's'`
       - When `i = 2`, `reversed[2] = st.charAt(5 - 1 - 2) = st.charAt(2) = 'h'`
       - When `i = 3`, `reversed[3] = st.charAt(5 - 1 - 3) = st.charAt(1) = 'i'`
       - When `i = 4`, `reversed[4] = st.charAt(5 - 1 - 4) = st.charAt(0) = 'R'`

4. After the loop, the `reversed` array contains the characters `{'i', 's', 'h', 'i', 'R'}`.

5. The `new String(reversed)` creates a new string from the character array, resulting in the string `"ishiR"`.

6. **Output**: `"ishiR"`

So, the reversed name of `"Rishi"` is `"ishiR"`.
*/