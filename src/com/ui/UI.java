package com.ui;

import com.main.Task;
import com.main.TaskService;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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

        String[] splitCommand = command.split(" ",2);
        String getCommand = splitCommand[0].toLowerCase();

        switch(getCommand){
            case "add":
                String task = splitCommand[1];
                taskService.addTask(task);
                break;
            case "delete":
                break;
            case "update":
                break;
            case "list":
                printHistory();
                break;
            case "exit" :
                break;
            default:
                System.out.println("No command found for " + getCommand);
        }
    }

    private boolean isValidCommand(String command){
        String [] splitCommand = command.split(" ",2);
        if(splitCommand[0].equals("list") || splitCommand[0].equals("exit")){
            if(splitCommand.length == 1){
                return true;
            }else{
                return false;
            }
        }else{
            if(splitCommand.length != 2){
                return false;
            }
            return true;
        }
    }

    private void handleInput(){
        String command = "";
        do{
            System.out.print("\ntask-cli > ");
            command = scanner.nextLine();
            if(!isValidCommand(command)){
                continue;
            }
            handleCommand(command);

        }while (!command.equals("exit"));

    }

    private void printHistory(){
        List<Task> tasks = taskService.getAllTasks();
        if(tasks.isEmpty()){
            printColumns();
            System.out.print("-".repeat(90));
            return;
        }
        printColumns();
        printTasks(tasks);
        System.out.print("-".repeat(90));
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

    private void printTasks(List<Task> tasks){
        for(Task task : tasks){
            System.out.println(
                    center(Integer.toString(task.getTaskId()),10) +
                    center(task.getDescription(),30) +
                    center(task.getStatus(),15) +
                    center(task.getLocalDateTime().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)),30) + "|");
        }

    }



}
