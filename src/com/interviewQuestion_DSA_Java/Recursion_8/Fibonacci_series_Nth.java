package com.interviewQuestion_DSA_Java.Recursion_8;

public class Fibonacci_series_Nth {
    public static void main(String[] args) {
        int n =4;
        System.out.println(fib(n));
        System.out.println(fib(10));
        System.out.println(fib(11));
        System.out.println(fib(12));
        System.out.println(fib(13));
    }

    private static int fib(int n) {
        if (n==0 || n==1){
            return n;

        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn =  fnm1 + fnm2;
        return  fn;
    }
  //  1, 1, 2,3,5............= 1=1
//    1+2 =3
}

//chatGPT
/*Sure, let's delve into the provided Java code that calculates the nth Fibonacci number using recursion and explain how it works using an example.

### Understanding Fibonacci Series and the Code

#### Fibonacci Series:
The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, starting from 0 and 1. The sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.

#### Recursive Method `fib(int n)`
```java
private static int fib(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    int fnm1 = fib(n - 1);
    int fnm2 = fib(n - 2);
    int fn = fnm1 + fnm2;
    return fn;
}
```
- This method takes an integer parameter `n`, representing the position in the Fibonacci series of the number to be calculated.
- If `n` is 0 or 1, it returns `n` itself (as the nth Fibonacci number is `n` itself for `n = 0` or `n = 1`).
- Otherwise, it calculates the (n-1)th and (n-2)th Fibonacci numbers recursively.
- Then, it adds these two numbers together to get the nth Fibonacci number `fn` and returns it.

#### Example: Calculating the 4th Fibonacci Number

Let's use the code to calculate the 4th Fibonacci number (`n = 4`).

1. `fib(4)` is called from the `main` method.
2. Inside `fib(4)`:
   - Since `n` is not 0 or 1, it calculates `fib(3)` and `fib(2)`.
   - To calculate `fib(3)`:
     - It calculates `fib(2)` and `fib(1)`.
     - `fib(2)` returns 1 (as the 2nd Fibonacci number is 1).
     - `fib(1)` returns 1 (as the 1st Fibonacci number is 1).
     - It adds `fib(2)` and `fib(1)` together to get `fib(3)` = 1 + 1 = 2.
   - To calculate `fib(2)`:
     - It calculates `fib(1)` and `fib(0)`.
     - `fib(1)` returns 1.
     - `fib(0)` returns 0.
     - It adds `fib(1)` and `fib(0)` together to get `fib(2)` = 1 + 0 = 1.
   - Finally, it adds `fib(3)` and `fib(2)` together to get `fib(4)` = 2 + 1 = 3.
3. `fib(4)` returns 3.

### Output
The output of the program (for `n = 4`) will be:
```
3
```

### Conclusion
This recursive approach demonstrates how you can calculate the nth Fibonacci number efficiently. Each recursive call breaks down the problem into smaller subproblems until reaching the base cases (`n = 0` or `n = 1`), and then computes the result by summing up the results of these subproblems.
*/
