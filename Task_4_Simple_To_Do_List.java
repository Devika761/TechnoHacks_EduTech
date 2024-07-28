package Techno_Hacks;

import java.util.ArrayList;
import java.util.Scanner;

// Class to manage the list of tasks
class List_Task1 {
    // ArrayList to store tasks
    ArrayList<String> taskList = new ArrayList<>();

    // Method to add tasks to the list
    void add_Task() {
        System.out.println("Enter the number of tasks to be done:");
        Scanner sc = new Scanner(System.in);

        // Get the number of tasks to be added
        int taskCount = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Loop to get each task from the user
        for (int i = 0; i < taskCount; i++) {
            System.out.println("Enter task " + (i + 1) + ":");
            String task = sc.nextLine();
            taskList.add(task); // Add the task to the list
        }
    }

    // Method to delete a specific task from the list
    void delete_Task() {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the index of the task to be deleted
        System.out.println("Enter the index of the task to be deleted (starting from 0):");
        int del = sc.nextInt();

        // Check if the index is valid
        if (del < 0 || del >= taskList.size()) {
            System.out.println("Invalid task index!");
        } else {
            // Remove the task from the list
            String deleted_Task = taskList.remove(del);
            System.out.println("Deleted Task: " + deleted_Task);
        }
    }

    // Method to view all tasks in the list
    void View_Task() {
        System.out.println("\nTasks added:");
        // Loop through the task list and print each task
        for (String task : taskList) {
            System.out.println(task);
        }
    }
}

public class Simple_to_do_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List_Task1 l = new List_Task1(); // Create an instance of the List_Task1 class
        boolean exit = false;

        // Loop to keep showing the menu until the user decides to exit
        while (!exit) {
            // Display menu options
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Tasks");
            System.out.println("2. Delete Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Perform action based on user choice
            switch (choice) {
                case 1:
                    l.add_Task();
                    break;
                case 2:
                    l.delete_Task();
                    break;
                case 3:
                    l.View_Task();
                    break;
                case 4:
                    exit = true; // Set exit to true to break the loop
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Thank you for using the To-Do List!");
    }
}
