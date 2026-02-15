package com.main;

import java.util.ArrayList;
import java.util.List;

/*
TaskList Class
Will Store tasks, Add, remove and update tasks*/
public class TaskList {
    private List<Task> tasks;

    public TaskList(){
       this.tasks= new ArrayList<>();

    }

    public TaskList(List<Task> tasks){
        this.tasks = tasks;

    }

    public void add(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks(){
        return this.tasks;
    }


}
