import tasklists.*;
import tasks.*;

public class Activity5 {
	public static void main(String[] args) {
		TaskList list = new ThreeTasks();
	
		/* Makes 2 identical task list - one of each type of task list */
		list = new ThreeTasks();
	
		list.addTask(new Task("Install Eclipse upgrade", 4));
		list.addTask(new Task("Do Project 4", 8));
		list.addTask(new Task("Learn about lists", 7));
		
		list.printTasks();
	}

}
