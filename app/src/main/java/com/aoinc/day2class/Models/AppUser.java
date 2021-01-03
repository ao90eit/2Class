package com.aoinc.day2class.Models;

import java.io.Serializable;

public class AppUser implements Serializable {
    private String name;
    private String location;
    private String userID;
    private String description;

    public AppUser(String name, String location, String userID, String description) {
        this.name = name;
        this.location = location;
        this.userID = userID;
        this.description = description;
    }

    public AppUser(String name, String location, String userID) {
        this.name = name;
        this.location = location;
        this.userID = userID;
        this.description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
