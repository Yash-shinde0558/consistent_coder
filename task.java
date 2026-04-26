import java.util.*;
public class task {

    public static void oddEven(int[] arr) {
        
       for(int i=0; i<arr.length; i++) {
            if(i % 2 !=0) {
                arr[i] = arr[i] * 2;  //Odd index
            }
            if ((i % 2 ==0)) {
                arr[i] = arr[i] + 10;   //Even index
            }
            
        }
        
        
    }
    
    public static void main(String[]args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        //function call
        oddEven(arr);
        
        //print Result
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
