package com.Java;
interface sampleInterface{
    void meth1();
    void meth2();
}
//class childInterface extends sampleInterface{  //Class 'childInterface' must either be declared abstract or implement abstract method 'meth1()' in 'sampleInterface,No interface expected here
//class childInterface implements sampleInterface{ //Class 'childInterface' must either be declared abstract or implement abstract method 'meth1()' in 'sampleInterface
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{ //Error if so We will be written all definition of all method.
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
/*class childInterface implements sampleInterface{ //Class 'childInterface' must either be declared abstract or implement abstract method 'meth1()' in 'sampleInterface
    public void meth1(){
        System.out.println("Meth1");
    }  // not error
    public void meth2(){};
    public void meth3(){};
    public void meth4(){};  // not error

  //  public void meth3();        // error = Missing method body, or declare abstract
//    void meth4();  //error = 'meth4()' in 'com.company.childInterface' clashes with 'meth4()' in 'com.company.sampleInterface'; attempting to assign weaker access privileges ('package-private'); was 'public
}*/
public class R_58_Inheritance_Interface {
    public static void main(String rishi[]){
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
