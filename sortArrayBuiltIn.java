import java.util.*;

public class sortArrayBuiltIn{

    public static void print(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[]args){

        int[] arr = {-1, 2, 3, -9, 8, 7};
        System.out.println();
        System.out.print("Array is :");
        print(arr);
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Sorted array is :");
        print(arr);
        System.out.println();
    }
}