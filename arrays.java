import java.util.*;

public class arrays {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int rohan[] = new int[7] ;

        //take input
        for(int i=0; i<7 ; i++){
            rohan[i] = sc.nextInt();
        }

        //Print Output
        for(int i=0; i<7; i++) {
            System.out.print(rohan[i]*2);
        }


    }

}