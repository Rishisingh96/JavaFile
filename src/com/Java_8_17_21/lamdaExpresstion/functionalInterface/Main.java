package com.Java_8_17_21.lamdaExpresstion.functionalInterface;

public class Main {
    public static void main(String[] args) {

        System.out.println("My System starts.......");
        // 1 -> Create separate class and implements this interface // we create another class and then call from hear
        MyInter myInter = new MyInterImpl();
        myInter.sayHello();

//        2-> anonymous class for implementing interface  // not create another class
   /*     MyInter i1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is 2nd way to create an functional interface ");
            }
        };
        i1.sayHello();

        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is 2nd way to create an functional interface .we have create a multipart interfaces");
            }
        };
        i2.sayHello();
*/
        // 3-> Lambda Expression
  /*      MyInter j  = () -> {
            System.out.println("3rd way to creating a interfaces using Lambda Expression ");
        };
        j.sayHello();

        MyInter j2 =() -> System.out.println("3rd way to creating a interfaces using Lambda Expression .when print value is signal than we write one line ");
        j.sayHello();*/

//        sumInter sumInter = Integer::sum;
       /* sumInter sumInter = (int a, int b) ->{
            return a+b;
        };
        System.out.println(sumInter.sum(10,6));
        System.out.println(sumInter.sum(2,7));
        }*/

  /*  sumInter sumInter = (a,  b) ->{
        return a+b;
    };
        System.out.println(sumInter.sum1(1,6));
        System.out.println(sumInter.sum1(2,7));
    }*/
        LengthInter lengthInter = str -> str.length();
//        LengthInter  lengthInter = (str -> str.length())

        System.out.println(lengthInter.getLength("Rishi singh"));
    }

}
