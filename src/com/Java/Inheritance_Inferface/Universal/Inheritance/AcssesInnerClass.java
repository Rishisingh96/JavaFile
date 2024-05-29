
class Outer{
    int h=10;
  
    void display(){
        Inner obj = new Inner();  
         System.out.println("Your inner w = " + obj.w);
    }
   
//    System.out.println(w);  // we can not access inner class directaly , we need creat Object 
     class Inner{   
         int w=40;
         void show(){
              System.out.println(w);
//             System.out.println(h);
//               System.out.println(w);
        }
    }
}
public class AcssesInnerClass {
    public static void main(String args[]) {
        Outer ob = new Outer();
        Outer.Inner in = ob.new Inner();
        in.show();
      
    }
}
