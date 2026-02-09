package com.ui;

import com.main.TaskService;

import java.util.Scanner;

/*UI class will handle the UI portion

* Will talk to TaskService*/
public class UI {

    private Scanner scanner = new Scanner(System.in);
    private TaskService taskService;

    public UI(){

    }

    public void start(){
        handleInput();
    }

    public void handleInput(){
        String command = "";
        do{
            command = scanner.nextLine();
       }while (!command.equals("exit"));

    }


    private void displayAcceptableArgs(){
        System.out.println("---------------------");
        System.out.println("add \"Buy Groceries\"");
        System.out.println("delete \"take \"");
        System.out.println("---------------------");
    }

}
