package com.interviewQuestion_DSA_Java.TCSCodeVita;

import java.util.*;

public class FrankensteinPotion {

    static Map<String, List<List<String>>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] parts = input.split("=");
            String potion = parts[0];
            String[] ingredientsArray = parts[1].split("\\+");

            recipes.computeIfAbsent(potion, k -> new ArrayList<>())
                    .add(Arrays.asList(ingredientsArray));
        }

        String targetPotion = sc.nextLine();
        System.out.println(getMinOrbs(targetPotion));
        sc.close();
    }

    public static int getMinOrbs(String potion) {
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        if (!recipes.containsKey(potion)) {
            memo.put(potion, 0);
            return 0;
        }

        int minOrbs = Integer.MAX_VALUE;

        for (List<String> recipe : recipes.get(potion)) {
            int currentRecipeOrbs = recipe.size() - 1;

            for (String ingredient : recipe) {
                currentRecipeOrbs += getMinOrbs(ingredient);
            }

            minOrbs = Math.min(minOrbs, currentRecipeOrbs);
        }

        memo.put(potion, minOrbs);
        return minOrbs;
    }
}