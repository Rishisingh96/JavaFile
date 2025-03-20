package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stocks[] , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85,100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        for (int i=0; i<span.length; i++) {
            System.out.println(span[i] + "");
        }
    }
}
/*Let's dry run the code step by step to understand how it works:

Code Overview:
The stockSpan function calculates the span of stock prices for each day.
The stock span is the number of consecutive days before the current day (including today) where the stock price is less than or equal to the current day's price.
Input:
stocks[] = {100, 80, 60, 70, 60, 85, 100} (Stock prices on consecutive days)
span[] will store the result of the stock span for each day.
Initial Setup:
stocks[] represents the stock prices for each day.
span[] stores the span for each stock price, and it is initialized with 0s.
Step-by-step Dry Run:
Initialization:

stocks = {100, 80, 60, 70, 60, 85, 100}
span[] = {0, 0, 0, 0, 0, 0, 0}
s = new Stack<>();
First value of span is manually set: span[0] = 1
Stack s is initialized with index 0 because the span for the first element is always 1.
Now, span = {1, 0, 0, 0, 0, 0, 0} and s = {0} (Index 0, corresponding to stock price 100).

i = 1 (stocks[1] = 80):

Current price currPrice = 80.
We compare currPrice = 80 with stocks[s.peek()] = stocks[0] = 100. Since 80 < 100, we don't pop from the stack.
span[1] = i - s.peek() = 1 - 0 = 1
Push i = 1 to the stack.
Now, span = {1, 1, 0, 0, 0, 0, 0} and s = {0, 1} (Index 1, corresponding to stock price 80).

i = 2 (stocks[2] = 60):

Current price currPrice = 60.
We compare currPrice = 60 with stocks[s.peek()] = stocks[1] = 80. Since 60 < 80, we don't pop from the stack.
span[2] = i - s.peek() = 2 - 1 = 1
Push i = 2 to the stack.
Now, span = {1, 1, 1, 0, 0, 0, 0} and s = {0, 1, 2} (Index 2, corresponding to stock price 60).

i = 3 (stocks[3] = 70):

Current price currPrice = 70.
We compare currPrice = 70 with stocks[s.peek()] = stocks[2] = 60. Since 70 > 60, we pop from the stack. Now, s = {0, 1}.
We compare currPrice = 70 with stocks[s.peek()] = stocks[1] = 80. Since 70 < 80, we stop popping.
span[3] = i - s.peek() = 3 - 1 = 2
Push i = 3 to the stack.
Now, span = {1, 1, 1, 2, 0, 0, 0} and s = {0, 3} (Index 3, corresponding to stock price 70).

i = 4 (stocks[4] = 60):

Current price currPrice = 60.
We compare currPrice = 60 with stocks[s.peek()] = stocks[3] = 70. Since 60 < 70, we don't pop from the stack.
span[4] = i - s.peek() = 4 - 3 = 1
Push i = 4 to the stack.
Now, span = {1, 1, 1, 2, 1, 0, 0} and s = {0, 3, 4} (Index 4, corresponding to stock price 60).

i = 5 (stocks[5] = 85):

Current price currPrice = 85.
We compare currPrice = 85 with stocks[s.peek()] = stocks[4] = 60. Since 85 > 60, we pop from the stack. Now, s = {0, 3}.
We compare currPrice = 85 with stocks[s.peek()] = stocks[3] = 70. Since 85 > 70, we pop from the stack. Now, s = {0}.
We compare currPrice = 85 with stocks[s.peek()] = stocks[0] = 100. Since 85 < 100, we stop popping.
span[5] = i - s.peek() = 5 - 0 = 5
Push i = 5 to the stack.
Now, span = {1, 1, 1, 2, 1, 5, 0} and s = {0, 5} (Index 5, corresponding to stock price 85).

i = 6 (stocks[6] = 100):

Current price currPrice = 100.
We compare currPrice = 100 with stocks[s.peek()] = stocks[5] = 85. Since 100 > 85, we pop from the stack. Now, s = {0}.
We compare currPrice = 100 with stocks[s.peek()] = stocks[0] = 100. Since 100 == 100, we stop popping.
span[6] = i - s.peek() = 6 - 0 = 6
Push i = 6 to the stack.
Now, span = {1, 1, 1, 2, 1, 5, 6} and s = {0, 6} (Index 6, corresponding to stock price 100).

Final Output:
The span of stock prices for each day is stored in the span[] array.

The output is:

Copy
Edit
1
1
1
2
1
5
6
Explanation of the Output:
Day 1 (price 100): The span is 1 (only today).
Day 2 (price 80): The span is 1 (only today).
Day 3 (price 60): The span is 1 (only today).
Day 4 (price 70): The span is 2 (70 is higher than 60 and 80, so it includes the previous day).
Day 5 (price 60): The span is 1 (only today).
Day 6 (price 85): The span is 5 (85 is higher than 60, 70, and 80, so it includes all those days).
Day 7 (price 100): The span is 6 (100 is higher than all previous days, so it includes all previous days).*/