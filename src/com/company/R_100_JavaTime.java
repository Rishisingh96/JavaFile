package com.company;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;

public class R_100_JavaTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);
// Nanosecond 10 to power -9
        // picoseconds 10 to power -12
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
