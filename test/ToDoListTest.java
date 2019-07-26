import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.*;
import org.junit.Test;



public class ToDoListTest {
	private Task task1,task2,task3;
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
		
	}
	@After
	 public void tearDown() throws Exception{
		task1 = null;
		task2 = null;
		task3 = null;
		todoList = null;
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		todoList.addTask(task1);
		assertFalse(todoList.isEmpty());
	
		
	}
	@Test
	public void testgetStatus() {
		fail("Not implemented yet");
	}
	@Test
	public void testRemoveTask() {
		ToDoList todoList = new ToDoList();
		Task assignment = new Task(s1);
		todoList.addTask(assignment);
		todoList.removeTask(s1);
		assertTrue(todoList.isEmpty());
	}
	@Test
	public void testGetCompletedTasks() {
		fail("Not implemented yet");
	}
}
