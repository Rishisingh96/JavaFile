package com.interviewQuestion_DSA_Java.TCSCodeVita;

import java.util.*;

public class FaultySegment {

    private static final Map<String, Character> SEGMENTS = new HashMap<>();
    private static final Map<Character, String> CHAR_TO_SEGMENTS = new HashMap<>();

    static {
        SEGMENTS.put(" _ | ||_|", '0');
        SEGMENTS.put("     |  |", '1');
        SEGMENTS.put(" _  _||_ ", '2');
        SEGMENTS.put(" _  _| _|", '3');
        SEGMENTS.put("  |_|  |", '4');
        SEGMENTS.put(" _ |_  _|", '5');
        SEGMENTS.put(" _ |_ |_|", '6');
        SEGMENTS.put(" _   |  |", '7');
        SEGMENTS.put(" _ |_||_|", '8');
        SEGMENTS.put(" _ |_| _|", '9');
        SEGMENTS.put("      |  ", '+');
        SEGMENTS.put("   _     ", '-');
        SEGMENTS.put(" _   _  _ ", '%');
        SEGMENTS.put("    _  _ ", '=');
        SEGMENTS.put(" | |   | ", '*');

        CHAR_TO_SEGMENTS.put('0', " _ | ||_|");
        CHAR_TO_SEGMENTS.put('1', "     |  |");
        CHAR_TO_SEGMENTS.put('2', " _  _||_ ");
        CHAR_TO_SEGMENTS.put('3', " _  _| _|");
        CHAR_TO_SEGMENTS.put('4', "  |_|  |");
        CHAR_TO_SEGMENTS.put('5', " _ |_  _|");
        CHAR_TO_SEGMENTS.put('6', " _ |_ |_|");
        CHAR_TO_SEGMENTS.put('7', " _   |  |");
        CHAR_TO_SEGMENTS.put('8', " _ |_||_|");
        CHAR_TO_SEGMENTS.put('9', " _ |_| _|");
        CHAR_TO_SEGMENTS.put('+', "      |  ");
        CHAR_TO_SEGMENTS.put('-', "   _     ");
        CHAR_TO_SEGMENTS.put('%', " _   _  _ ");
        CHAR_TO_SEGMENTS.put('=', "    _  _ ");
        CHAR_TO_SEGMENTS.put('*', " | |   | ");
    }

    private static int getDifference(String s1, String s2) {
        int diff = 0;
        if (s1.length() != s2.length()) return Integer.MAX_VALUE;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        StringBuilder[] lines = new StringBuilder[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = new StringBuilder(scanner.nextLine());
        }

        List<String> segmentsList = new ArrayList<>();
        int eqIndex = -1;
        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            s.append(lines[0].substring(i * 3, i * 3 + 3).replaceAll(" ", "_"));
            s.append(lines[1].substring(i * 3, i * 3 + 3).replaceAll(" ", "_"));
            s.append(lines[2].substring(i * 3, i * 3 + 3).replaceAll(" ", "_"));

            String normalizedSegment = s.toString().replace('|', '_').replace(' ', '_');

            // This is a robust way to handle the input for a 3x3 grid
            String pattern = lines[0].substring(i * 3, i * 3 + 3) +
                    lines[1].substring(i * 3, i * 3 + 3) +
                    lines[2].substring(i * 3, i * 3 + 3);

            Character c = SEGMENTS.get(pattern);
            if (c != null && c == '=') {
                eqIndex = i;
            }
            segmentsList.add(pattern);
        }

        List<Character> chars = new ArrayList<>();
        for(String seg : segmentsList) {
            chars.add(SEGMENTS.get(seg));
        }

        long actualRHS = 0;
        try {
            List<Character> rhsChars = chars.subList(eqIndex + 1, chars.size());
            StringBuilder rhsStr = new StringBuilder();
            for (Character c : rhsChars) {
                if (c != null) {
                    rhsStr.append(c);
                }
            }
            actualRHS = Long.parseLong(rhsStr.toString());
        } catch (Exception e) {
            // Problem guarantees this won't happen
        }

        for (int i = 0; i < eqIndex; i++) {
            String originalSegment = segmentsList.get(i);

            for (Map.Entry<Character, String> entry : CHAR_TO_SEGMENTS.entrySet()) {
                char potentialChar = entry.getKey();
                String potentialSegment = entry.getValue();

                if (getDifference(originalSegment, potentialSegment) == 1) {
                    List<Character> tempChars = new ArrayList<>(chars);
                    tempChars.set(i, potentialChar);

                    long currentResult = 0;
                    char operator = '+';

                    boolean firstNum = true;
                    StringBuilder currentNumStr = new StringBuilder();
                    for (int j = 0; j < eqIndex; j++) {
                        Character c = tempChars.get(j);
                        if (c == null) {
                            // This path should not be taken with the fix, but as a fallback
                            continue;
                        }

                        if (c >= '0' && c <= '9') {
                            currentNumStr.append(c);
                        } else {
                            if (!currentNumStr.isEmpty()) {
                                long nextNum = Long.parseLong(currentNumStr.toString());
                                if (firstNum) {
                                    currentResult = nextNum;
                                    firstNum = false;
                                } else {
                                    switch (operator) {
                                        case '+': currentResult += nextNum; break;
                                        case '-': currentResult -= nextNum; break;
                                        case '*': currentResult *= nextNum; break;
                                        case '%': currentResult %= nextNum; break;
                                    }
                                }
                            }
                            operator = c;
                            currentNumStr = new StringBuilder();
                        }
                    }

                    if (!currentNumStr.isEmpty()) {
                        long nextNum = Long.parseLong(currentNumStr.toString());
                        if (firstNum) {
                            currentResult = nextNum;
                        } else {
                            switch (operator) {
                                case '+': currentResult += nextNum; break;
                                case '-': currentResult -= nextNum; break;
                                case '*': currentResult *= nextNum; break;
                                case '%': currentResult %= nextNum; break;
                            }
                        }
                    }

                    if (currentResult == actualRHS) {
                        System.out.println(i + 1);
                        return;
                    }
                }
            }
        }
        scanner.close();
    }
}