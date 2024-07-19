package com.interviewQuestion_DSA_Java.String_3.leetCode;
public class NamingCases_pascal_camel_etc {
    public static String toCamelCase(String str) {
        String[] words1 = str.split(" ");
//        String[] words1 = str.split("[\\s_\\-]+");
        StringBuilder cameCS = new StringBuilder();
        for (int i = 0; i < words1.length; i++) {
            String word = words1[i];    //word  = words1[0] = h
            if (i == 0) {
                cameCS.append(word.toString() + " ");  //camelCaseString = "hello";
            } else {
                cameCS.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase() + " ");
            }
        }
        return cameCS.toString();
    }
    public static String toPascalCase(String str) {
        String[] words = str.split(" ");
        StringBuilder pascalCS = new StringBuilder();
        for (String  word : words){
            pascalCS.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()+" ");
        }
        return pascalCS.toString();
    }
    public static void main(String[] args) {
        String os = "hello my Name is rishi Singh";

        String camelCase = toCamelCase(os);
        String pascalCase = toPascalCase(os);
//        String snakeCase = toSnakeCase(os);
//        String kebabCase = toKebabCase(os);
        System.out.println(camelCase);
        System.out.println("Original: " + os);
        System.out.println("CamelCase: " + camelCase);
        System.out.println("PascalCase: " + pascalCase);
//        System.out.println("SnakeCase: " + snakeCase);
//        System.out.println("KebabCase: " + kebabCase);
    }
}
