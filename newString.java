
import java.util.Scanner;

public class newString {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Normal elements : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


        int left = 0;
        int right = arr.length-1;
        

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

        System.out.println();

        System.out.print("Reverse Elements : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
