package org.example;

public class University extends Institution {
    public University(String name, String address, int students) {
        super(name, address, students);
    }

    @Override
    public String getType() {
        return "университет";
    }
}