
import java.util.Scanner;
public class D_5Q_Method {
    public void Fibonacci_series() {
        Scanner c = new Scanner(System.in);
        int i, a, x, n = 0, f = 1;
        System.out.println("Enter your value");
        x = c.nextInt();
        for (i = 1; i <= x; i++) {
            System.out.println(n);
            a = n + f;
            n = f;
            f = a;
        }
    }
//        Math all function:-
     /*void Maht() {
        System.out.println("\n%f", ceil(3.6));
        System.out.println("\n%f", ceil(3.3));
        System.out.println("\n%f", floor(3.6));
        System.out.println("\n%f", floor(3.2));
        System.out.println("\n%f", sqrt(16));
        System.out.println("\n%f", sqrt(7));
        System.out.println("\n%f", pow(2, 4));
        System.out.println("\n%f", pow(3, 3));
        System.out.println("\n%d", abs(-12))
    }*/


        // Type 2 :- No argument but return a value
        /*public int sum(){
            int s=0;
            for(int i=1;i<=10; i++){
                s = s+i;
            }
            return s;
    }
    }*/

        public static void main(String arg[]){
            // four type of method or function
//        Type 1 - No argument and no return value
            D_5Q_Method h = new D_5Q_Method();
            h.Fibonacci_series();
           /* int s;
             s = h.sum();
           System.out.println("sum of 10 netural no" + s);*/
        }
}
