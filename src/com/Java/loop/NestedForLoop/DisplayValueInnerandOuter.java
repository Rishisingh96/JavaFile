package com.Java.loop.NestedForLoop;

public class DisplayValueInnerandOuter {
    public static void main(String[] args) {
        //
        for(int i=1; i<=3; i++){
            //
            System.out.print(i+"\n");
            for (int j=1; j<=4; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
/*

Let’s take an example program in which we will display values of the inner for loop for each outer iteration, as well as outer for loop.
1
1 2 3 4
2
1 2 3 4
3
1 2 3 4
*/