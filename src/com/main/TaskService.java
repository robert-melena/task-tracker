package com.main;

import java.util.ArrayList;
import java.util.List;

/*TaskService class
* Will handle the service implementation of tasks
* will interpret commands, apply business rules, coordinates actions*/

public class TaskService {
    private TaskList taskList;

    public TaskService(){
        this.taskList = new TaskList();
    }

    public TaskService(TaskList taskList){
        this.taskList = taskList;
    }

    public List<Task> getAllTasks(){
        return this.taskList.getTasks();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }



}
