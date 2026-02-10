package com.main;

import java.util.ArrayList;
import java.util.List;

/*TaskService class
* Will handle the service implementation of tasks
* will interpret commands, apply business rules, coordinates actions*/

public class TaskService {
    private TaskList taskList;
    private String [] validActions ={"add","delete","update","list"};

    public TaskService(){
        this.taskList = new TaskList();
    }

    public void handleCommand(String command){
        String[] splitCommand = command.split(" ");
        String getCommand = splitCommand[0];

        switch(getCommand){
            case "add":
                break;
            case "delete":
                break;
            case "update":
                break;
            case "list":
                break;
            default:
                System.out.println("No command found for " + getCommand);
        }
    }

}
