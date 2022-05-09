package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TodoList {
    ArrayList<Todo> todos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    int idIndex = 1;

    void addTodo() {
        System.out.println("Add Todo");
        System.out.println("Description: ");
        String description = scanner.nextLine();

        Todo todo = new Todo(description, idIndex++);
        this.todos.add(todo);
    }

    void viewAllTodo() {
        for(Todo todo: todos) {
            System.out.println(todo);
        }
    }

    void viewTodo() {
        System.out.println("Please provide a todo ID");
        int id = intScanner.nextInt();

        for(Todo todo: todos) {
            if (todo.id == id) {
                System.out.println(todo);
            }
        }
    }

    void markTodoAsDone() {
        System.out.println("Please provide a todo ID");
        int id = intScanner.nextInt();

        for (Todo todo: todos) {
            if(todo.id == id) {
                todo.markAsDone();
            }
        }
    }

    void removeTodo() {
        System.out.println("Please provide a todo ID");
        int id = intScanner.nextInt();

        for (int i = 0; i < todos.size(); i++) {
            if(todos.get(i).id == id) {
                todos.remove(i);
            }
        }
    }
}
