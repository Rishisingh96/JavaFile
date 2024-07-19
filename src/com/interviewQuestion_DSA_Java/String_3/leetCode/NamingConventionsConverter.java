package com.interviewQuestion_DSA_Java.String_3.leetCode;

public class NamingConventionsConverter {

    public static String toCamelCase(String str) {
        String[] words = str.split("[\\s_\\-]+");
        StringBuilder camelCaseString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                camelCaseString.append(word.toLowerCase());
            } else {
                camelCaseString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
        }
        return camelCaseString.toString();
    }

    public static String toPascalCase(String str) {
        String[] words = str.split("[\\s_\\-]+");
        StringBuilder pascalCaseString = new StringBuilder();
        for (String word : words) {
            pascalCaseString.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
        }
        return pascalCaseString.toString();
    }

    public static String toSnakeCase(String str) {
        String[] words = str.split("[\\s_\\-]+");
        StringBuilder snakeCaseString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                snakeCaseString.append("_");
            }
            snakeCaseString.append(words[i].toLowerCase());
        }
        return snakeCaseString.toString();
    }

    public static String toKebabCase(String str) {
        String[] words = str.split("[\\s_\\-]+");
        StringBuilder kebabCaseString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                kebabCaseString.append("-");
            }
            kebabCaseString.append(words[i].toLowerCase());
        }
        return kebabCaseString.toString();
    }

    public static void main(String[] args) {
        String originalString = "hello world_this is Java";

        String camelCase = toCamelCase(originalString);
        String pascalCase = toPascalCase(originalString);
        String snakeCase = toSnakeCase(originalString);
        String kebabCase = toKebabCase(originalString);

        System.out.println("Original: " + originalString);
        System.out.println("CamelCase: " + camelCase);
        System.out.println("PascalCase: " + pascalCase);
        System.out.println("SnakeCase: " + snakeCase);
        System.out.println("KebabCase: " + kebabCase);
    }
}
