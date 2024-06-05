package com.Java.Exception_Handling.Universal;

public class NumberformatEx {
    public static void main(String[] args) {
        String string = "60";
        int result;
        try {
            result = Integer.parseInt(string) * 2;
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println(" Your String is wrong please give write string value");
        }
    }
}
