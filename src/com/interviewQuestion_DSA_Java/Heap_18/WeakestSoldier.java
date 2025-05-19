package com.interviewQuestion_DSA_Java.Heap_18;

import java.util.PriorityQueue;
/*
Q: Weakest Soldier
We are given an mxn binary matrix of I's (soldiers) and o's (civilians). The soldiers are
positioned in front of the civilians. That is, all the I's will appear to the left of all the o's
in each row.
A row i is weaker than a row j if one of the following is true:
• The number of soldiers in row i is less than the number of soldiers in row j.
• Both rows have the same number of soldiers and i j.
Find the K weakest rows.
m:4, n:4,
1000
1111
1000
1000
ans : rowO & row2 */
public class WeakestSoldier {
    static class findWeakestSoldiers implements Comparable<findWeakestSoldiers> {
        int soldiers;
        int idx;

        public findWeakestSoldiers(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(findWeakestSoldiers r2) {
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat ={
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };

        int k = 2;
        PriorityQueue<findWeakestSoldiers> pq = new PriorityQueue<findWeakestSoldiers>();

        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j = 0; j<mat[0].length; j++){
                count += mat[i][j] == 1 ? 1 : 0;
            }
            pq.add(new findWeakestSoldiers(count,i));
        }
        for(int i=0; i<k; i++){
            System.out.println("R "+pq.poll().idx + " ");
        }
    }


}
