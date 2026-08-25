import java.util.Scanner;

public class Palindrome {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=1; i<=n; i++){
             if(n%i == 0){
                count++;
            }        
        }

        if(count == 0){
            System.out.println("Prime number...");
        }else{
            System.out.println("Not Prime...");
        }
        

        if(n%2 == 0){
            System.out.println("Number is Even...");
        }else{
            System.out.println("Number is Odd...");
        }
    }
}
