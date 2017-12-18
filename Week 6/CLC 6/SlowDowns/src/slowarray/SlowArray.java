
package slowarray;

import java.util.*;

public class SlowArray {

    public static void main(String[] args) {
        //variables, array, and get start time
        int x = 40000000;
        int getNumber = 0;
        long start = System.currentTimeMillis();
        long finish;
        long total;
        int[] array = new int[x];
        
        //adds random numbers to array
        for(int i = 0; i < x; i++){
            Random rand = new Random();
            int r = rand.nextInt(300);
            array[i] = r;
        }
        
        //sum items in array
        long sum = 0;
            for(int i= 0; i < x; ++i) 
                sum += array[i];
        
        //get end time and total time
        finish = System.currentTimeMillis();
        total = (finish - start);
        
        //print results
        System.out.println("Done ");
        System.out.println("The sum is " + sum   
                + ". Run time was " + total + " milliseconds.");


    }

   
    
}
