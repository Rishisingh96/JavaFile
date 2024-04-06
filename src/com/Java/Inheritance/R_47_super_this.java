package com.Java.Inheritance;
class Ekclass {
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a) {
        // a = a; // we can use and store a value in a and print but we use this keyword for a class
        this.a = a;
     //   super(this.a);
    }
    public int returnnoe(){
       return 1;
    }
}
    class Doclass extends Ekclass{
        Doclass(int c){   //if we not use super than error
            super(c);
            System.out.println("I am a constructor");
        }
    }


class R_47_super_this{
    public static void main(String rishi[]){  // we already use rishi in mated so we not use in Object name so use rishi1.
        Ekclass rishi1 = new Ekclass(45);
//        rishi1.SetA(45);
        Doclass rishi2 = new Doclass(8);
        System.out.println(rishi1.getA());
        System.out.println(rishi2.getA());
    }
}

