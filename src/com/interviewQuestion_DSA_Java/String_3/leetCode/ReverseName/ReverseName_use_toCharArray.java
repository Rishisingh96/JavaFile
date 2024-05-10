package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

public class ReverseName_use_toCharArray {
    static String reverseName(String st) {
        char[] chars = st.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Rishi";
        String result = reverseName(input);
        System.out.println("Reversed Name: " + result);
    }
}

/*Sure, let's dry run the code step by step:

1. **Input**: `input = "Rishi"`

2. The `reverseName` method is called with the input string `"Rishi"`.

3. Inside the `reverseName` method:
   - The input string `"Rishi"` is converted into a character array `chars = {'R', 'i', 's', 'h', 'i'}`.
   - Two pointers `start` and `end` are initialized, with `start = 0` and `end = 4`.
   - The while loop runs as long as `start < end`.
   - In the first iteration:
     - `temp` is assigned the value of `chars[start]`, which is `'R'`.
     - `chars[start]` is assigned the value of `chars[end]`, which is `'i'`.
     - `chars[end]` is assigned the value of `temp`, which is `'R'`.
     - `start` is incremented to 1, and `end` is decremented to 3.
   - In the second iteration:
     - `temp` is assigned the value of `chars[start]`, which is `'i'`.
     - `chars[start]` is assigned the value of `chars[end]`, which is `'h'`.
     - `chars[end]` is assigned the value of `temp`, which is `'i'`.
     - `start` is incremented to 2, and `end` is decremented to 2.
   - The loop continues until `start` is no longer less than `end`.

4. After the loop, the character array `chars` becomes `{'i', 's', 'h', 'i', 'R'}`.

5. The `new String(chars)` creates a new string from the character array, resulting in the string `"ishiR"`.

6. **Output**: `"ishiR"`

So, the reversed name of `"Rishi"` is `"ishiR"`.
*/
