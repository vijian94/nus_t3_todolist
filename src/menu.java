import java.util.HashMap;
import java.util.Scanner; // import the Scanner class 

public class menu {
	public HashMap<String, Task> tasks = new HashMap<String, Task>();
	public static Scanner myObj = new Scanner(System.in);
	private static ToDoList todoList;
	private static Task newTask1;
	
	public static void main(String[] args) {
		todoList = new ToDoList();
		userSelect();
	}

	public static String usermenu() {
		
		String choice;
		System.out.println("1. Create Task");
		System.out.println("2. Remove Task");
		
		System.out.println("Select Task:");
		choice = myObj.nextLine();
		return choice;
	}
	
	public static void userSelect(){
		String select = usermenu();
		if (select.equals("1")){
			System.out.println("Enter Task Description:");
			String newTask = myObj.nextLine();
			newTask1 = new Task(newTask);
			todoList.addTask(newTask1);
			
			System.out.println("---------To do list-----------");
			todoList.viewAllTask();
			System.out.println("---------To-do list-----------");
		}
		
	}
}