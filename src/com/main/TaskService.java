package com.main;

import java.util.ArrayList;
import java.util.List;

/*TaskService class
* Will handle the service implementation of tasks
* will interpret commands, apply business rules, coordinates actions*/

public class TaskService implements TaskServiceInterface{
    private TaskList taskList;

    public TaskService(){
        this.taskList = new TaskList();
    }

    public TaskService(TaskList taskList){
        this.taskList = taskList;
    }

    @Override
    public List<Task> getAllTasks(){
        return this.taskList.getTasks();
    }

    @Override
    public void addTask(String description){
        this.taskList.add(new Task(description));
    }

    @Override
    public void deleteTask(int taskId){
        boolean removed = taskList.deleteTask(taskId);
        if(!removed){
            throw new IllegalArgumentException("Task not found");
        }
    }



}
