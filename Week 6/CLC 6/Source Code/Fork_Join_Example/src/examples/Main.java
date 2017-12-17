package examples;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		RecursiveForkJoinExample myRecursiveTask = new RecursiveForkJoinExample((long) 256);
		ForkJoinPool example = new ForkJoinPool();
		long mergedResult = example.invoke(myRecursiveTask);
		System.out.println("Result = " + mergedResult);

	}

}
