package com.example.administrator.yalimasinei.bean;

/**
 * Created by Administrator on 2019/1/2.
 */

public class Contact {
    private String name;
    private String number;
    private int id;
    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }
    public Contact(String name, String number, int id){
        this.name = name;
        this.number = number;
        this.id = id;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
