package com.wildcodeschool.demo.model;

import java.util.List;

public class TodoList {

    private String title;
    private String description;
    private List<Todo> todos;

    public TodoList() {
    }

    public TodoList(String title, String description, List<Todo> todos) {
        this.title = title;
        this.description = description;
        this.todos = todos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
