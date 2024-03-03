public class Max_Subarray3 {
   
   // ---------  kadans Algorith ------------------time complexity = O(n)----------------------------------------------

   public static void kadansAlgorith(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

       for(int i = 0; i < numbers.length; i++){
        cs = cs + numbers[i];
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs, ms);
       }
       System.out.println("our maxs subarray sum is :" + ms);
   }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadansAlgorith(numbers);
    }
}
