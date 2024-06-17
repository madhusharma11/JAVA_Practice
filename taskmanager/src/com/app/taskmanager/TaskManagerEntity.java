package com.app.taskmanager;

public class TaskManagerEntity {
	private static int taskid=100;
	private String taskName;
	private String description;
	private String taskDate;
	private Status status;
	private boolean active;
	public TaskManagerEntity(String taskName, String description, String taskDate) {
		super();
		++taskid;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		//Color clr=Color.valueOf(color.toUpperCase());
		this.status = Status.valueOf("PENDING");
		this.active = true;
	}
	public static int getTaskid() {
		return taskid;
	}
	public static void setTaskid(int taskid) {
		TaskManagerEntity.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "TaskManagerEntity [taskName=" + taskName + ", description=" + description + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active +"taskid "+taskid+"status "+status+
				"active"+"]";
	
	
	}
}
