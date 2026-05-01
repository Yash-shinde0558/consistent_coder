import java.util.*;
public class sumofArr {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        //Input array size
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //Input array elements
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++) {
           arr[i] = sc.nextInt();
        }
        

        //Printing array elements
        for(int i=0; i<n; i++) {
            if(arr[i]<0)
            System.out.print(arr[i] + " ");
        }

        //Sum of array
        int sum = 1;
        for(int i=0; i<n; i++) {
            sum = sum * arr[i];
        }
        System.out.print("Sum of array is : " + sum);
    }

}
