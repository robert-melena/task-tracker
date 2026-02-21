package com.main;

import java.util.List;

public interface TaskServiceInterface {

    List<Task> getAllTasks();
    void addTask(String task);
    void deleteTask(int taskId);
}
