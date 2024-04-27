package com.Java.Time;
import java.util.Calendar;
public class R_98_CalemdarClass {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca.getCalendarType());
        System.out.println(ca.getTimeZone().getID());
        System.out.println(ca.getTime());

    }
}
