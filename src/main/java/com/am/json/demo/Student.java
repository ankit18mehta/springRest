package com.am.json.demo;


public class Student {

    private int id;

    private String firstName;

    private String lastName;

    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean activeStatus) {
        this.active = activeStatus;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

}
