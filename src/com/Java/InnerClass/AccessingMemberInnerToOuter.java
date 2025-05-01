package com.Java.InnerClass;

class MyOuter2 {
    // Declare an instance variable of the outer class and initialize the value 20.
    int x = 20;

    // A regular member inner class start here.
    class MyInner2 {
        // An instance variable of member inner class.
        int x = 30;
        int y = 50;

        public void showValue() {
            // A local variable of member inner class.
            int x = 40;
            System.out.println("x = " + x); // It will print the value 40 of local variable x.
            System.out.println("x = " + this.x); // It will print the value 30 of instance variable of member inner class because here this refers to the current inner class object.
            System.out.println("x = " + MyOuter2.this.x); // It will print the value 20 of instance variable of outer class because here this refers to current outer class object.
            System.out.println("y = " + y); // It will print the value 50 of instance variable of member inner class.
        }
    }
}

    public class AccessingMemberInnerToOuter {
    public static void main(String[] args) {
        MyOuter2 outer = new MyOuter2();
        MyOuter2.MyInner2 inner2  = outer.new MyInner2();
        inner2.showValue(); // It will print the value of local variable x, instance variable of member inner class and instance variable of outer class.

    }

}
