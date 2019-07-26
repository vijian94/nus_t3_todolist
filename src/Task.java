
public class Task {
	private String description = null;
	private boolean isComplete = false;
	private int priority;
	
	public Task(String description) {
		super();
		this.description = description;
	}
	
	public Task(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public int setPriority(int priority) {
		return this.priority = priority;
	}
	
	public Task(String description, boolean isComplete, int priority) {
		super();
		this.description = description;
		this.isComplete = isComplete;
		this.priority = priority;
	}
	

}
