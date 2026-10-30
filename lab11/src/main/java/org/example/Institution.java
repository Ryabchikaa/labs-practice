package org.example;

public class Institution {
    private String name;
    private String address;
    private int students;

    public Institution(String name, String address, int students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public void teach() {
        System.out.println("учу");
    }

    public void teach(String subject) {
        System.out.println("учу предмету " + subject);
    }

    public void teach(int hours) {
        System.out.println("учу " + hours + " часов");
    }

    public String getType() {
        return "учебное заведение";
    }
}