package com.ozen.todoapp;

import java.util.Date;

public class TaskActivity {

    private String id;
    private int data;
    private Date update;
    private String description;

    TaskActivity(String id, int data, String description, Date update){
        this.id = id;
        this.data = data;
        this.description = description;
        this.update = update;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }



}
