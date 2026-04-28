public class smax {

    public static void check(int[]  maxcheck) {

         int max = Integer.MIN_VALUE;  
         int smax = Integer.MIN_VALUE;

        for(int i=0; i<maxcheck.length; i++) {
            if(maxcheck[i]>max)
                max=maxcheck[i];
        }
        
         for(int i=0; i<maxcheck.length; i++) {
            if(maxcheck[i]>smax && maxcheck[i]!=max)
                smax=maxcheck[i];
           
        }
        System.out.println(max);
        System.out.println(smax);
        // return max;
    
    }
    public static void main(String[]args) {
        int[] maxcheck = {4, 10, 10, 8, 3, 8};

        check(maxcheck);  //function call
        
        
    }
}
