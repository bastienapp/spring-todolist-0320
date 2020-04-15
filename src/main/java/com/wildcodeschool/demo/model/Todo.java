package com.wildcodeschool.demo.model;

import java.util.Date;

public class Todo {

    private String title;
    private Date date;
    private boolean done;

    public Todo() {}

    /**
     *
     * @param title titre de la tâche
     * @param date date limite de réalisation de la tâche
     */
    public Todo(String title, Date date) {
        this.title = title;
        this.date = date;
        this.done = false;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
