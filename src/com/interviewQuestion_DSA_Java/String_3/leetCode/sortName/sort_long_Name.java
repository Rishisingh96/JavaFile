package com.interviewQuestion_DSA_Java.String_3.leetCode.sortName;

public class sort_long_Name {
    public static void main(String[] args) {
        String str2 = "Rishi singh kumar jain tyagi";
        String[] words = str2.split(" ");
       System.out.println(words.length);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
                result.append(words[i].charAt(0)).append(" ");
            } else {
                result.append(words[i]);
            }
        }
        System.out.println(result);
    }
}
/*Sure, let's dry run your code line by line using the example input `"Rishi singh kumar jain tyagi"` and explain what happens at each step.

### Code:
```java
package com.interviewQuestion_DSA_Java.String_3.leetCode.sortName;

public class sort_long_Name {
    public static void main(String[] args) {
        String str2 = "Rishi singh kumar jain tyagi";
        String[] words = str2.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
                result.append(words[i].charAt(0)).append(" ");
            } else {
                result.append(words[i]);
            }
        }

        System.out.println(result.toString());
    }
}
```

### Dry Run:

1. **Initialization**:
   ```java
   String str2 = "Rishi singh kumar jain tyagi";
   ```
   - The variable `str2` is initialized with the string `"Rishi singh kumar jain tyagi"`.

2. **Splitting the string**:
   ```java
   String[] words = str2.split(" ");
   ```
   - The `split` method is called on `str2`, which splits the string by spaces and stores the result in the `words` array.
   - The `words` array now contains: `["Rishi", "singh", "kumar", "jain", "tyagi"]`.

3. **Creating a StringBuilder**:
   ```java
   StringBuilder result = new StringBuilder();
   ```
   - A new `StringBuilder` object named `result` is created to build the output string.

4. **Iterating over the words**:
   ```java
   for (int i = 0; i < words.length; i++) {
       if (i < words.length - 1) {
           result.append(words[i].charAt(0)).append(" ");
       } else {
           result.append(words[i]);
       }
   }
   ```
   - This loop iterates over each word in the `words` array.

   **Iteration 1 (i = 0)**:
   ```java
   if (i < words.length - 1) { // 0 < 4 (true)
       result.append(words[i].charAt(0)).append(" "); // R
   } else {
       result.append(words[i]);
   }
   ```
   - `i` is 0, which is less than `words.length - 1` (4), so it appends the first character of `"Rishi"` (which is 'R') and a space to the `result`.
   - `result` now contains: `"R "`.

   **Iteration 2 (i = 1)**:
   ```java
   if (i < words.length - 1) { // 1 < 4 (true)
       result.append(words[i].charAt(0)).append(" "); // s
   } else {
       result.append(words[i]);
   }
   ```
   - `i` is 1, which is less than `words.length - 1` (4), so it appends the first character of `"singh"` (which is 's') and a space to the `result`.
   - `result` now contains: `"R s "`.

   **Iteration 3 (i = 2)**:
   ```java
   if (i < words.length - 1) { // 2 < 4 (true)
       result.append(words[i].charAt(0)).append(" "); // k
   } else {
       result.append(words[i]);
   }
   ```
   - `i` is 2, which is less than `words.length - 1` (4), so it appends the first character of `"kumar"` (which is 'k') and a space to the `result`.
   - `result` now contains: `"R s k "`.

   **Iteration 4 (i = 3)**:
   ```java
   if (i < words.length - 1) { // 3 < 4 (true)
       result.append(words[i].charAt(0)).append(" "); // j
   } else {
       result.append(words[i]);
   }
   ```
   - `i` is 3, which is less than `words.length - 1` (4), so it appends the first character of `"jain"` (which is 'j') and a space to the `result`.
   - `result` now contains: `"R s k j "`.

   **Iteration 5 (i = 4)**:
   ```java
   if (i < words.length - 1) { // 4 < 4 (false)
       result.append(words[i].charAt(0)).append(" ");
   } else {
       result.append(words[i]); // tyagi
   }
   ```
   - `i` is 4, which is not less than `words.length - 1` (4), so it appends the whole word `"tyagi"` to the `result`.
   - `result` now contains: `"R s k j tyagi"`.

5. **Printing the result**:
   ```java
   System.out.println(result.toString());
   ```
   - This prints the final value of `result`, which is `"R s k j tyagi"`.

### Output:
```
R s k j tyagi
```

The dry run shows how the code processes each word in the input string and constructs the desired output by taking the first character of each word (except the last one) and appending it, followed by a space, and finally appending the entire last word.
*/