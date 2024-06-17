package com.app.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManagerUtility {
static List<TaskManagerEntity> list=new ArrayList<>();
	public static boolean addNewTask(TaskManagerEntity task)throws RuntimeException
	{
		
						return list.add(task);
		
	}
	public static void  deleteTask(int id) {
	for(TaskManagerEntity t:list)
	{
	if(t.getTaskid()==id)
		list.remove(t);
	}
						
	}
	
	public static List<TaskManagerEntity> getAllTask()
	{
		
		return list;
		
	}
}
