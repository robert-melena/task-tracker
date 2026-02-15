package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Task {
    private static int ID = 1;

    private int taskId;
    private String description;
    private String status;
    private LocalDateTime localDateTime;
    private LocalDateTime updateTime;

    public Task(String description){
        this.taskId = ID++;
        this.localDateTime = LocalDateTime.now();
        this.updateTime = null;
        this.description = description;
        this.status = "to-do".toUpperCase();
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
