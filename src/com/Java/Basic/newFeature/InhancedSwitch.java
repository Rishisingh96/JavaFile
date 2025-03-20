package com.Java.Basic.newFeature;

public class InhancedSwitch {

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
