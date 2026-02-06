package com.tasks;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("No args available");
            System.exit(0);
        }

        Task task = new Task(args[0]);
        System.out.println(task);


    }
}
