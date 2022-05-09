package com.company;

public class Todo {
    String description;
    Boolean done;
    int id;

    Todo(String description, int id){
        this.description = description;
        this.id = id;
        this.done = false;
    }

    void markAsDone() {
        this.done = true;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
