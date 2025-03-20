package com.Java.DurgeshSir100DayCode;

public class InhancedSwitch_Day30 {

    //Java 14 Feature
    public static void main(String[] args) {
        int roleId = 4;
        String userRole = switch (roleId){
            case 1,4 -> "Admid";
            case 2 -> "User";
            default -> "Unknown";
        };
        System.out.println(userRole);
    }
}
