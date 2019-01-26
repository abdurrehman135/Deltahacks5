package com.example.hsport.deltahacks5.deltahacks5.classes;

import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private ArrayList eventList;
    private ArrayList createdEventsList;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList eventList) {
        this.eventList = eventList;
    }

    public ArrayList getCreatedEventsList() {
        return createdEventsList;
    }

    public void setCreatedEventsList(ArrayList createdEventsList) {
        this.createdEventsList = createdEventsList;
    }

    public
}
