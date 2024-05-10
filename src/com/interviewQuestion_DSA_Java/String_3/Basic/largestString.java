public class largestString {
    // public static String largestStirng1(String str, String str2, String str3) {
    public static String largestString1(String str, int si, int ei) {

        String substr = "";
        for (int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    //    if(str.length()>str2.length() && str.length()>str3.length()){
    //     System.out.println(str.toString() + " "+ "biggest1");
    //    }
    //    else if(str2.length()>str3.length())
    //    {
    //     System.out.println(str2.toString() + " "+ "biggest2");
    //    }else{
    //     System.out.println(str3.toString() +" "+ "biggest3");
    //    }
    // return str;




    }

    public static void main(String[] args) {  //o(n) time complex
        
        // System.out.println(largestStirng1("Rishi singh","Monika","Gyani"));
        // largestString1("Rishi singh","Monika","Gyani");

        String fruits[] = {"apple","mango","banana"};
        
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
