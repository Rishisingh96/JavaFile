import java.util.*;
public class Array_update {
    public static void update(int marks[]){
    for(int i = 0; i<marks.length; i++) {
        marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        update(marks);
        
        // print our marks
        // for(int i = 0; i<marks.length; i++) {
        //     System.out.println(marks[i]+" ");
        // }
        
        System.out.print(marks[0]);
        System.out.print(marks[1]);
        System.out.print(marks[2]);
            
        System.out.println(marks.length);
    }    
}
