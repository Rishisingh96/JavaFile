package com.Collection.map.HashMapCode;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {
    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; //n size
        private int N;
        private LinkedList<Node> [] buckets; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode(); //hashcode of key
            return Math.abs(hc) % N; //modulus with number of buckets
        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0; //index

          for(int i = 0; i<ll.size(); i++){
              Node node = ll.get(i);
              if(node.key == key){
                  return di; //return index if key found
              }
                di++;
            }
            return -1; //return -1 if key not found
        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2]; //double the size of buckets
            N = N * 2; //update N to new size
            for(int i = 0 ; i<buckets.length; i++){
                buckets[i] = new LinkedList<>(); //initialize new buckets
            }

            //nodes = > add int buckets
            for(int i = 0 ; i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value); //rehash each node into new buckets
                }
            }
        }
        // Hash function to calculate the index for a key
        //put value
        public void put(K key, V value){
            int bi = hashFunction(key); // 1 to 3
            int di = SearchInLL(key ,bi); //valid ; or -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value; //update value if key already exists
            }else {
                buckets[bi].add(new Node(key, value)); //add new node if key does not exist
                n++;
            }

            double lambda = (double) n / N; //load factor
//            if(lambda > 2.0){  //Typical load factor threshold is 0.75 in Java’s HashMap, you currently use 2.0 which is very high and can degrade performance due to long chains.
            if(lambda > 0.75){  //Typical load factor threshold is 0.75 in Java’s HashMap, you currently use 2.0 which is very high and can degrade performance due to long chains.
                rehash(); //rehash if load factor exceeds 2
            }
        }



        public boolean containskey(K key){
            int bi = hashFunction(key); // 1 to 3
            int di = SearchInLL(key ,bi); //valid ; or -1

            if(di != -1){  //valid
                return true;
            }else {
               return false;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key); // 1 to 3
            int di = SearchInLL(key ,bi); //valid ; or -1

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else {
                return null;
            }
        }

        public V get(K key){
            int bi = hashFunction(key); // 1 to 3
            int di = SearchInLL(key ,bi); //valid ; or -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value; //return value if key exists
            }else {
               return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> key = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    key.add(node.key); //add each key to the list
                }
            }
            return key;
        }
        public boolean isEmpty(){
            return n == 0; //check if size is 0
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 148);
        map.put("China", 142);
        map.put("USA", 33);
        map.put("Indonesia", 76);

        ArrayList<String> keys = map.keySet();
        for(String key : keys){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println();
        // Example usage
        System.out.println("Value for key 'Rishi': " + map.get("Rishi"));
        System.out.println("Value for key 'Salone': " + map.get("Salone"));

        System.out.println();
        System.out.println("Contains key 'India': " + map.containskey("India"));
        System.out.println("Removing key 'USA': " + map.remove("USA"));
        System.out.println("Getting value for key 'USA' after removal: " + map.get("USA"));

    }
}
