package fastersum;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class Sum extends RecursiveTask<Long> {
    //create threshold for parallel programming
    static final int threshold = 4000;

    //variables
    int low;
    int high;
    int[] array;

    //gets array information
    Sum(int[] arr, int lo, int hi) {
        array = arr;
        low   = lo;
        high  = hi;
    }

    //performs computation
    protected Long compute() {
        
        //if within the threshold just perform the work
        if(high - low <= threshold) {
            long sum = 0;
            for(int i=low; i < high; ++i) 
                sum += array[i];
            return sum;
         } 
        
        //split the array and add each side, then return the added results
        else {
            int mid = low + (high - low) / 2;
            Sum one  = new Sum(array, low, mid);
            Sum two = new Sum(array, mid, high);
            one.fork();
            long rightAns = two.compute();
            long leftAns  = one.join();
            return leftAns + rightAns;
         }
     }
}
