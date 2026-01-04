package com.interviewQuestion_DSA_Java.Array_3.Medium;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SubarrayWithProductLessThanK {
    static int coutsubarray_nativeapproch(int array[], int n, int k){
        int count = 0;
        int i, j, mul;

        for(i=0;i<n;i++){
            //Counter for single element
            if(array[i]<k){
                count++;
            }
            mul = array[i];
            for(j=i+1; j<n; j++){
                //Multiple subarray
                mul = mul*array[j];

                //If this multiple is less
                //than k, then increment
                if(mul<k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }

    static int countsubarrayproductlessthankoptimalapproch(ArrayList<Integer> a, long k){
        int n = a.size();
        long p=1;
        int res = 0;
        for(int start = 0, end=0; end<n; end++){
            //Move right bound by 1 step
            //Update the product
            p *= a.get(end);

            //Move left bound so guarantee that
            //p is again less than k.
            while (start<end && p>=k)
                p /=a.get(start++);

                //if p is less than k, update the counter
                if(p<k){
                    int len = end - start + 1;
                    res += len;
                }
            }

        return res;
    }

    static int numsubarrayproductlessthankoptimal(int[] nums, int k){
        if(k<=1) {
            return 0;
        }
        int n = nums.length;
        int start =0, end=0;
        long prod =1;
        int count =0;
        while(end<n){
            //expand the window
            prod *= nums[end];

            //shrink the window
            while(prod>=k){
                prod /= nums[start];
                start++;
        }
            //all subarrays ending at end
            count += (end - start + 1);
            end++;
        }
        return count;
    }

    static void main() {
        System.out.println("Subarray with product less than k:Native Approch");
        //Native approch
        int array[] = {1,2,3,4};
        int k=10;
        int size = array.length;

        int count = coutsubarray_nativeapproch(array, size,k);
        System.out.println(count);

        //Optimal approch

        System.out.println("Subarray with product less than k:Optimal Approch 1");
        //Function Calls
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(countsubarrayproductlessthankoptimalapproch(al,10));

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(9);
        al1.add(2);
        al1.add(8);
        al1.add(6);
        al1.add(4);
        al1.add(3);
        System.out.println(countsubarrayproductlessthankoptimalapproch(al1,100));

        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(100);
        al3.add(200);
        System.out.println(countsubarrayproductlessthankoptimalapproch(al3,100));

        ArrayList<Integer> al4 = new ArrayList<Integer>();
        al4.add(100);
        al4.add(200);
        System.out.println(countsubarrayproductlessthankoptimalapproch(al3,101));


        System.out.println("Subarray with product less than k:Optimal Approch 2");
        int count1 = numsubarrayproductlessthankoptimal(array, k);
        System.out.println(count1);
    }
}
