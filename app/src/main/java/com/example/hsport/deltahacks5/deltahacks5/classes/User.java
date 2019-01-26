package com.example.hsport.deltahacks5.deltahacks5.classes;

import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private ArrayList eventList;
    private ArrayList createdEvents;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
