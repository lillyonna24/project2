package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {

            menu();
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {
                case 1:
                    addTask(tasks);
                    break;
                case 2:
                    deleteTask(tasks);
                    break;
                case 3:
                    updateTask(tasks);
                    break;
                case 4:
                    listTask(tasks);
                    break;
                case 5:
                    listTaskByPrio(tasks);
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public static void menu() {
        System.out.println("Please choose an option");
        System.out.println("(1) Add a task");
        System.out.println("(2) Remove a task");
        System.out.println("(3) Update a task");
        System.out.println("(4) List all tasks");
        System.out.println("(5) List all by priority");
        System.out.println("(0) Exit");
    }

    private static ArrayList<Task> addTask(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name for your task");
        String taskName = input.nextLine();
        System.out.println("Please describe your task");
        String descTask = input.nextLine();
        System.out.println("Please rank your task for priority 0-5");
        int prioInt = input.nextInt();
        input.nextLine();
        Task a = new Task(taskName, descTask, prioInt);
        tasks.add(a);
        return tasks;

    }

    private static ArrayList<Task> deleteTask(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which task would you like deleted?");
        listTask(tasks);
        int i = input.nextInt();
        tasks.remove(i);
        return tasks;
    }

    private static ArrayList<Task> updateTask(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        Scanner nextInput = new Scanner(System.in);
        System.out.println("Which would you like to update?");
        int userInput = input.nextInt();
        input.nextLine();
        System.out.println("Please enter a name for your task");
        String taskName = input.nextLine();
        System.out.println("Please describe your task");
        String descTask = input.nextLine();
        System.out.println("Please rank your task for priority 0-5");
        int prioInt = input.nextInt();
        input.nextLine();
        listTask(tasks);
        int i = input.nextInt();
        Task a = new Task(taskName, descTask, prioInt);
        return tasks;
    }

    private static void listTaskByPrio(ArrayList<Task> tasks) {
        Scanner input = new Scanner(System.in);
        System.out.println("What priority would you like to view?");
        int priority = input.nextInt();
        input.nextLine();
        for(int i = 0; i < tasks.size();i++){
            if(priority==tasks.get(i).getPrioInt()){
                System.out.println(tasks.get(i));
            }
        }
    }

    private static void listTask(ArrayList<Task> tasks){
        System.out.println(tasks);
    }
}
