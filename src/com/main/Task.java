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

    private String center(String text, int width){
        int padding = width - text.length(); //6
        int left = padding / 2; // 6 / 2 =  3
        int right = padding - left; //6 - 3 = 3
        return   "|" + " ".repeat(left) + text +  " ".repeat(right);
    }

    @Override
    public String toString() {
        return
            center(Integer.toString(this.taskId),10) +
            center(description,30) +
            center(status,15) +
            center(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)),30) + "|\n";

    }
}
