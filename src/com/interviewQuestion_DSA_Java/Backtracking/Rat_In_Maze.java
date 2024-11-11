package com.interviewQuestion_DSA_Java.Backtracking;
/*You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
square matrix of order N * N where the cells with value 0 represent the maze’s blocked
locations while value 1 is the open/available path that the rat can take to reach its destination.
The rat's destination is at (N - 1, N - 1).
Your task is to find all the possible paths that the rat can take to reach from source to
destination in the maze.
The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down)
i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
Sample Output :
        1 0 0 0
        1 1 0 0
        0 1 0 0
        0 1 1 1
        */

public class Rat_In_Maze {

    public static void main(String[] args) {
        int maze[][] ={
                {1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1},
        };

    }
}

