package com.Java.MultiThreding.Universal;

import java.util.concurrent.locks.StampedLock;

class stock{
    int total_stock = 100;
    /*void purchase(int qty){    // if we does not use  synchronized
        Product Sold.......
        Product Sold.......
        Product can not sold..
        Available Stock : -40
        Stock Available = -40
        Available Stock : 30*/
    synchronized void purchase(int qty){
        if(total_stock>=qty){
            System.out.println("Product Sold.......");
            total_stock = total_stock - qty;
            System.out.println(STR."Available Stock : \{total_stock}");
        }
        else {
            System.out.println("Product can not sold..");
            System.out.println(STR."Stock Available = \{total_stock}");
        }
    }
}
public class Company extends Thread {
static stock  S;
int demand;
public void run(){
    S.purchase(demand);
}
    public static void main(String[] args) {
        S=new stock();
        Company lg = new Company();
        lg.demand = 70;
        lg.start();

        Company tata = new Company();
        tata.demand = 70;
        tata.start();

        Company bata = new Company();
        bata.demand = 70;
        bata.start();
    }
}
