import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.*;
import org.junit.Test;



public class ToDoListTest {
	private Task task1,task2,task3,task4;
	private ToDoList todoList;
	// Define Test Fixtures

	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		todoList = new ToDoList();
		task1 = new Task("desc 1");
		task2 = new Task("desc 2");
		task3 = new Task("desc 3");
		task4 =new Task("desc 4");
		
		
	}
	@After
	 public void tearDown() throws Exception{
		task1 = null;
		task2 = null;
		task3 = null;
		task4=null;
		todoList = null;
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		todoList.addTask(task1);
		assertFalse(todoList.isEmpty());
	
		
	}
	/*@Test
	public void testgetStatus() {
		 {
				assertNotNull(todoList); 
				todoList.addTask(task1);
				assertEquals(false, todoList.getStatus(task1.getDescription()));
				todoList.completeTask(task1.getDescription());
				assertEquals(true, todoList.getStatus(task1.getDescription()));  
			}
	}*/
	/*@Test
	public void testRemoveTask() {
		assertNotNull(todoList); 
		todoList.addTask(task1);
		todoList.addTask(task2);;
		
		todoList.removeTask(task1.getDescription());
		assertNull(todoList.getTask(task1.getDescription()));	
	}*/
	@Test
	
	public void testGetIncompleteTasks() {
		task4.setComplete(false);
		todoList.addTask(task4);
		Collection<Task> tasks =todoList.getIncompleteTasks();
		
		
	
		
		
	};
	public void testGetCompletedTasks() {
		{
			task1.setComplete(true);
			task3.setComplete(true);
			todoList.addTask(task1);
			todoList.addTask(task2);
			todoList.addTask(task3);
			
			Collection<Task> tasks = todoList.getCompletedTasks();
			assertEquals(2, tasks.size());
		}
	}
}
