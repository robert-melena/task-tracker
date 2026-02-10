package com.ui;

import com.main.Task;
import com.main.TaskService;

import java.util.List;
import java.util.Scanner;

/*UI class will handle the UI portion

* Will talk to TaskService*/
public class UI {

    private Scanner scanner = new Scanner(System.in);
    private TaskService taskService;

    public UI(){
        taskService = new TaskService();
    }

    public void start(){
        handleInput();
    }


    public void handleCommand(String command){
        if(command == null || command.isBlank()){
            return;
        }

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
            case "exit" :
                break;
            default:
                System.out.println("No command found for " + getCommand);
        }
    }



    public void printHistory(){
        List<Task> tasks = taskService.getAllTasks();
        if(tasks.isEmpty()){
            System.out.println("No tasks at this time!");
            return;
        }
        printColumns();
        System.out.print(tasks);
        System.out.print("-".repeat(90));
    }

    private void handleInput(){
        String command = "";
        do{
            command = scanner.nextLine();
            handleCommand(command);
        }while (!command.equals("exit"));

    }

    private void printColumns(){
        System.out.print("-".repeat(90) + "\n" + center("ID",10) +
                center("DESCRIPTION", 30) +
                center("STATUS", 15) +
                center("DATE", 30)  +"|\n");
    }

    private  String center(String text, int width){
        int padding = width - text.length(); //6
        int left = padding / 2; // 6 / 2 =  3
        int right = padding - left; //6 - 3 = 3
        return   "|" + " ".repeat(left) + text +  " ".repeat(right);
    }

    private void displayAcceptableArgs(){
        System.out.println("---------------------");
        System.out.println("add \"Buy Groceries\"");
        System.out.println("delete \"take \"");
        System.out.println("---------------------");
    }

}
