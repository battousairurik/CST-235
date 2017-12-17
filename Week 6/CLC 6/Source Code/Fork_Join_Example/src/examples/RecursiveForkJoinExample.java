package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecursiveForkJoinExample extends RecursiveTask<Long>{
	
	private static final long serialVersionUID = 1L;
	//Set field to store workload
	private Long work = (long) 0;
	
	public RecursiveForkJoinExample (Long work){
		this.work = work;
	}
	
	@Override
	protected Long compute() {
		//Set minimum for work to be broken down into
		if (this.work > 16){
			System.out.println("Splitting work : " + this.work);

            List<RecursiveForkJoinExample> subtasks =
                new ArrayList<RecursiveForkJoinExample>();
            subtasks.addAll(createSubtasks());

            for(RecursiveForkJoinExample subtask : subtasks){
                subtask.fork();
            }

            long result = 0;
            for(RecursiveForkJoinExample subtask : subtasks) {
                result += subtask.join();
            }
            return result;
		}
		else{
			System.out.println("Doing work myself: " + this.work);
            return work * 3;
		}
	}

	private List<RecursiveForkJoinExample> createSubtasks() {
        List<RecursiveForkJoinExample> subtasks = new ArrayList<RecursiveForkJoinExample>();

        RecursiveForkJoinExample subtask1 = new RecursiveForkJoinExample(this.work / 2);
        RecursiveForkJoinExample subtask2 = new RecursiveForkJoinExample(this.work / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }
}
