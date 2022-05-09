package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the todo app!!");
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        String input = "";

        do {
            System.out.println("""
                    Please select an option below: 
                        1: Add a todo
                        2: View All todos
                        3: View Single todo
                        4: Mark todo as done
                        5: delete todo
                    """);

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    todoList.addTodo();
                    break;
                case "2" :
                    todoList.viewAllTodo();
                    break;
                case "3":
                    todoList.viewTodo();
                    break;
                case "4":
                    todoList.markTodoAsDone();
                    break;
                case "5":
                    todoList.removeTodo();
                    break;
                case "quit":
                    System.out.println("Exiting application!!!");
                    break;
                default:
                    System.out.println("Please provide a valid input");
                    break;
            }

        } while (!input.equalsIgnoreCase("quit"));
    }
}
