

public class reverse_arr {

public static void reverse(int[] arr) {

    int n = arr.length;
    int i = 2 , j = 5;

    while(i<j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
       i++;
       j--;
    }
    for(int ele : arr ) {
        System.out.print(ele + " ");
    }


}



    public static void main(String []args) {
        int arr[] = {1, 3, 4, 6, 7, 8, 9};
        reverse(arr);
    }
}
