package org.example;

public class School extends Institution {
    public School(String name, String address, int students) {
        super(name, address, students);
    }

    @Override
    public String getType() {
        return "школа";
    }
}