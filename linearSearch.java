public class linearSearch{
    public static void  main(String [] args){

        int arr[] = {1,3,4 ,5 ,5, 7,8, 3};
        int target = 8;

        for(int i=0; i<arr.length; i++){

            if(arr[i]==target){
                System.out.println("Index : " + i);
            }
            
        }   

    }
}