package com.main;

import com.ui.UI;

public class Main {
    public static void main(String[] args) {

        Task task = new Task("Buy Groceries");
        System.out.println(task);

        //Next step is to figure out how to add to JSON file
        UI ui = new UI();
        ui.start();


    }
}
