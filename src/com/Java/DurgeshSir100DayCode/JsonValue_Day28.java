package com.Java.DurgeshSir100DayCode;

public class JsonValue_Day28 {
    public static void main(String[] args) {

        String jsonStr = """
                {
                "name":"Rishi",
                "age":30,
                }
                """;
        System.out.println(jsonStr);

        String jsonStrD = """
                {
                "name":"%s",
                "age":%d,
                }
                """.formatted("Rishi", 23);
        System.out.println(jsonStrD);
    }
}
