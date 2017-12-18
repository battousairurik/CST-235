/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastersum;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class FasterSum {

    public static void main(String[] args) {
        //variables and get start time
        int x = 40000000;
        long start = System.currentTimeMillis();
        long finish;
        long total;
        int[] array = new int[x];
        
        //create array
        for(int i = 0; i < x; i++){
            Random rand = new Random();
            int r = rand.nextInt(300);
            array[i] = r;
        }
        
        //create new sum class and ForkJoin pool
        Sum sum = new Sum(array, 0, array.length);
        ForkJoinPool fj = new ForkJoinPool();
        
        //get result
        long result = fj.invoke(sum);
        
        //get end time and total time
        finish = System.currentTimeMillis();
        total = finish - start;
        
        //print results
        System.out.println("sum is " + result + " time was " + total + " milliseconds.");
    }
    
}
