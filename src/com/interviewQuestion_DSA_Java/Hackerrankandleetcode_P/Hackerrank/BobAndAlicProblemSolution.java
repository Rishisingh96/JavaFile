package com.interviewQuestion_DSA_Java.Hackerrankandleetcode_P.Hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);

        return result;
    }
}

public class BobAndAlicProblemSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); // OUTPUT_PATH ki zarurat nahi

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedWriter.flush(); // output bhejne ke liye
        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*✅ Test Cases

Input:

5 6 7
3 6 10


Output:

1 1


Input:

17 28 30
99 16 8


Output:

2 1

✅ Conclusion

Tumhara structure bilkul sahi tha.

Maine bas compareTriplets function complete kiya hai.

Output ko print karne ke liye BufferedWriter ka use kiya hai.

Agar tum chaho to System.out.println() bhi use kar sakte ho, par ye template HackerRank / Hackerearth jaisi platforms ke liye perfect hai.*/