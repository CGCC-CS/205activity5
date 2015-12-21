import tasklists.*;
import tasks.*;

public class Activity5 {
	public static void main(String[] args) {
		final int NUMLISTS = 2;
		
		/* Makes one of each type of task list */
		TaskList[] list = new TaskList[NUMLISTS];
		list[0] = new ThreeTasks();
		list[1] = new ArrayTasks(3);
		
		for (int ii=0;ii<list.length;ii++) {
			list[ii].addTask(new Task("Install Eclipse upgrade", 4));
			list[ii].addTask(new Task("Do Project 4", 8));
			list[ii].addTask(new Task("Learn about lists", 7));
		}
		
		for (int ii=0;ii<list.length;ii++) {
			System.out.println("List " + (ii + 1) + ":");
			list[ii].printTasks();
			System.out.println();
		}
	}

}
