import tasklists.*;
import tasks.*;

public class Activity5 {
	public static void main(String[] args) {
		ThreeTasks list = new ThreeTasks();
	
		/* Makes 2 identical task list - one of each type of task list */
		TaskList list1 = new ThreeTasks();
		list1.addTask(new Task("Install Eclipse upgrade", 4));
		list1.addTask(new Task("Do Project 4", 8));
		list1.addTask(new Task("Learn about lists", 7));
		
		System.out.println("List 1:");
		list1.printTasks();

		ArrayTasks list2 = new ArrayTasks(3);
		list2.addTask(new Task("Install Eclipse upgrade", 4));
		list2.addTask(new Task("Do Project 4", 8));
		list2.addTask(new Task("Learn about lists", 7));
		
		System.out.println("\nList 2:");
		list2.printTasks();
	}

}
