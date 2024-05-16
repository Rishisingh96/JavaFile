//for each loop
public class forEach {
    public static void main(String[] args) {
        /*
        for(data_type variable : array | collection){
                //body of for-each loop
            }
       */
      	// args.length;
        //traversing the array with for-each loop
        /*
        for (String str : args) {
            System.out.print(str+" ");
        }
        */
        int sum =0;
       for (String str : args) {
       		sum = sum + Integer.parseInt(str);
       		  // System.out.print(str+" ");

        }
       		  System.out.print(sum);
    }
}