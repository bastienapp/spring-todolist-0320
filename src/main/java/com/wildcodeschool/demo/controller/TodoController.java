package com.wildcodeschool.demo.controller;

import com.wildcodeschool.demo.model.Todo;
import com.wildcodeschool.demo.model.TodoList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class TodoController {

    @GetMapping("/todo")
    public String showTodo(Model out) {

        // TODO : charger un élément de la base de donnée
        Todo todo = new Todo("Faire les courses", new Date());
        out.addAttribute("todo", todo);

        return "todo";
    }

    @GetMapping("/todos")
    public String showAllTodos(Model out) {

        // TODO : charger une liste de la base de donnée
        Todo todo1 = new Todo("Faire les courses", new Date());
        Todo todo2 = new Todo("Acheter un poney", new Date());
        Todo todo3 = new Todo("Garnir le tacos", new Date());
        Todo todo4 = new Todo("Manger des Pim's", new Date());
        Todo todo5 = new Todo("Peler une pomme", new Date());
        ArrayList<Todo> todos = new ArrayList<>();
        todos.add(todo1);
        todos.add(todo2);
        todos.add(todo3);
        todos.add(todo4);
        todos.add(todo5);

        TodoList todoList = new TodoList("À faire au plus vite", "C'est très important", todos);
        out.addAttribute("todoList", todoList);

        return "todo-list";
    }
}
