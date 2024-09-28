package com.interviewQuestion_DSA_Java.Backtracking;

public class  QueenRightPotion_SM  {
    public static boolean isSafe(char board[][], int row , int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right up
        for (int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char[][] board, int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1); //function call
                board[row][j] = 'x';  //backtracking step
            }

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
        int n=4;
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
/*
Let's walk through the dry run of the QueenRightPotion_SM class, which solves the N-Queens problem using backtracking. The N-Queens problem is about placing N queens on an N×N chessboard such that no two queens threaten each other.

The example provided uses n = 4, which means the board is 4x4 and we're solving the 4-Queens problem.

Code Breakdown
isSafe method: Checks if it's safe to place a queen at a given position on the board.

Vertical Up: Checks the column above the current position.
Diagonal Left Up: Checks the diagonal to the top-left.
Diagonal Right Up: Checks the diagonal to the top-right.
nQueens method: Tries to place queens row by row.

If all rows are processed (row == board.length), the board is printed as a solution.
For each column in the current row, it checks if placing a queen is safe using the isSafe method.
If safe, the queen is placed (board[row][j] = 'Q') and the method is called recursively to place a queen in the next row.
After returning from recursion, it removes the queen (board[row][j] = 'x') to backtrack and try other positions.
printBoard method: Prints the current board configuration.

main method: Initializes the board and starts the process by calling nQueens(board, 0).

Dry Run
We start with an empty 4x4 board:

Copy code
x x x x
x x x x
x x x x
x x x x
Step 1: Place the first queen in Row 0.
Column 0: Safe, place queen.
css
Copy code
Q x x x
x x x x
x x x x
x x x x
Call nQueens(board, 1) to place the next queen in Row 1.
Step 2: Place the second queen in Row 1.
Column 0: Not safe (vertical conflict with Q at (0, 0)).
Column 1: Not safe (diagonal left conflict with Q at (0, 0)).
Column 2: Safe, place queen.
css
Copy code
Q x x x
x x Q x
x x x x
x x x x
Call nQueens(board, 2) to place the next queen in Row 2.
Step 3: Place the third queen in Row 2.
Column 0: Not safe (vertical conflict with Q at (0, 0)).
Column 1: Not safe (diagonal right conflict with Q at (1, 2)).
Column 2: Not safe (vertical conflict with Q at (1, 2)).
Column 3: Safe, place queen.
css
Copy code
Q x x x
x x Q x
x x x Q
x x x x
Call nQueens(board, 3) to place the next queen in Row 3.
Step 4: Place the fourth queen in Row 3.
Column 0: Not safe (vertical conflict with Q at (0, 0)).
Column 1: Not safe (diagonal right conflict with Q at (2, 3)).
Column 2: Not safe (diagonal left conflict with Q at (1, 2)).
Column 3: Not safe (vertical conflict with Q at (2, 3)).
No position is safe in Row 3. Backtrack by removing the queen from Row 2, Column 3, and continue trying the next position in Row 1.

Backtrack to Row 1, continue placing the second queen.
Remove Queen at (1, 2):
css
Copy code
Q x x x
x x x x
x x x x
x x x x
Column 3: Safe, place queen.
css
Copy code
Q x x x
x x x Q
x x x x
x x x x
Call nQueens(board, 2) to place the third queen in Row 2.
Continue placing the third queen in Row 2.
Column 0: Not safe (vertical conflict with Q at (0, 0)).
Column 1: Safe, place queen.
css
Copy code
Q x x x
x x x Q
x Q x x
x x x x
Call nQueens(board, 3) to place the fourth queen in Row 3.
Place the fourth queen in Row 3.
Column 0: Not safe (vertical conflict with Q at (0, 0)).
Column 1: Not safe (diagonal left conflict with Q at (2, 1)).
Column 2: Not safe (vertical conflict with Q at (1, 2)).
Column 3: Safe, place queen.
css
Copy code
Q x x x
x x x Q
x Q x x
x x Q x
All queens are placed safely. This is one solution to the 4-Queens problem. The board is printed, and the function will continue to backtrack to explore other possible solutions.

The program will continue this backtracking process until all possible solutions are found.

Output
For n = 4, there are 2 possible solutions. The program will print both configurations: 1.

css
Copy code
Q x x x
x x Q x
x Q x x
x x x Q
css
Copy code
x Q x x
x x x Q
Q x x x
x x Q x
Each configuration represents a valid solution where no two queens can attack each other.
*/