package com.Collection.QuestionInterview;

import java.util.HashMap;

public class FindItineraryFromTickets {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String , String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; // This is the starting point of the itinerary
            }
        }
        return null; // No starting point found
    }
    public static void main(String[] args) {
//        "Mumbai"->"Delhi"->"Goa"->"Chennai"->"Bengaluru";

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.println(start);
        for(String key : tickets.keySet()) {
//            System.out.print(key + " -> ");
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start); // Move to the next destination
        }
    }
}
