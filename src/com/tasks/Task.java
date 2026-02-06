package com.tasks;

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
        this.status = "to-do";
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", localDateTime=" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)) +
                '}';
    }
}
