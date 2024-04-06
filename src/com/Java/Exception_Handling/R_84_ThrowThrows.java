package com.Java.Exception_Handling;
class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}
public class R_84_ThrowThrows {
        public static double area (int r) throws NegativeRadiusException{
            if(r<0){
                throw new NegativeRadiusException();
            }
            double result =Math.PI*r*r;
            return result;
        }

    public static void main(String[] args) {
            try{
               // double ar = area(-9);
                double ar = area(9);
                System.out.println(ar);
            }
            catch (Exception e){
                System.out.println("Exception");
                System.out.println(e.toString());
               System.out.println(e.getMessage());
               e.printStackTrace();

            }
    }
}

