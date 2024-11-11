package com.interviewQuestion_DSA_Java.Backtracking;

public class Queen_2D__Possibility_SM {
    public static void nQueens(char[][] board, int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1); //function call
            board[row][j] = 'x';  //backtracking step
            }
        }
    public static void  printBoard(char board[][]){
        System.out.println("-------class board----------");
        for (int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
//                System.out.println(STR."\{board[i][j]}");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = 'x';
//                System.out.print("*");
            }
//            System.out.println(); // print 2D array
        }
        nQueens(board, 0);
    }
}

/*Let's dry run this Java code step by step to understand its flow and execution.

Problem Summary:
The problem is to place 'Q' (Queens) in all possible ways on an n x n chessboard. We are using a backtracking approach to explore possibilities. The board is represented as a 2D character array where:

'Q' represents a Queen.
'x' represents an empty cell.
Variables:
n = 2 (size of the board)
board[][] is a 2x2 grid, initialized with 'x'.
The function nQueens(board, row) is recursively called to place Queens on each row.
Code Breakdown:
main function:

n = 2, so the board[][] is initialized as a 2x2 array.
The board is initially set up as:
Copy code
x x
x x
Then, the nQueens(board, 0) function is called, starting with row 0.
nQueens function:

For row = 0:
We iterate over each column in row 0 (j = 0 to j = 1).
For j = 0, place a Queen ('Q') at board[0][0]:
css
Copy code
Q x
x x
Call nQueens(board, 1) to try placing a Queen in row 1.
For row = 1:

For j = 0, place a Queen ('Q') at board[1][0]:
css
Copy code
Q x
Q x
Call nQueens(board, 2).
Base Case for row = 2 (end condition):

Since row == board.length, the base condition is met, so the printBoard(board) function is called to print the board:
css
Copy code
Q x
Q x
After printing, we backtrack. Remove the Queen from board[1][0] (reset to 'x'), and continue iterating.
Backtrack to row = 1, j = 1:

Now, try placing a Queen at board[1][1]:
css
Copy code
Q x
x Q
Call nQueens(board, 2) again.
Base Case for row = 2:

The printBoard(board) function is called again:
css
Copy code
Q x
x Q
After printing, backtrack by resetting board[1][1] to 'x'.
Backtrack to row = 0, j = 1:

Now, try placing a Queen at board[0][1]:
css
Copy code
x Q
x x
Call nQueens(board, 1) again.
For row = 1, j = 0:

Place a Queen at board[1][0]:
css
Copy code
x Q
Q x
Call nQueens(board, 2).
Base Case for row = 2:

The printBoard(board) function is called:
css
Copy code
x Q
Q x
After printing, backtrack by resetting board[1][0].
Backtrack to row = 1, j = 1:

Place a Queen at board[1][1]:
css
Copy code
x Q
x Q
Call nQueens(board, 2).
Base Case for row = 2:

The printBoard(board) function is called:
css
Copy code
x Q
x Q
After printing, backtrack by resetting board[1][1].
Final Backtrack:

Once all possibilities are explored, the recursive calls end.
Final Output:
The code will print all possible ways to place the Queens for a 2x2 board. The output will be:

css
Copy code
-------class board----------
Q x
Q x
-------class board----------
Q x
x Q
-------class board----------
x Q
Q x
-------class board----------
x Q
x Q
However, these configurations do not represent valid solutions for the N-Queens problem (where no two Queens should attack each other). For n = 2, there is no valid configuration, but this code is just exploring all placements without checking validity yet.*/