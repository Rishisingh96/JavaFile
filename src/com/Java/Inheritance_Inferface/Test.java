//// File: A.java
//public abstract class A {
//    abstract void m1(A a);
//}
//
//// File: B.java
//public class B extends A {
//    @Override
//    void m1(A a) {
//        System.out.println("One");
//    }
//}
//
//// File: C.java
//public class C extends B {
//    @Override
//    void m1(A a) {
//        System.out.println("Two");
//        super.m1(new B());
//    }
//}
//
//// File: AddTextOneListSecondList.java
//public class Test {
//    public static void main(String[] args) {
//        C c = new C();
//        c.m1(new B());
//    }
//}
