package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public boolean deleteTask(int id){
//        Predicate<Task> predicate = new Predicate<Task>() {
//            @Override
//            public boolean test(Task task) {
//                return task.getTaskId() == id;
//            }
//        };
//        return this.tasks.removeIf(predicate);
        return this.tasks.removeIf(task -> task.getTaskId() == id);
    }

    public List<Task> getTasks(){
        return new ArrayList<>(this.tasks);
    }


}
