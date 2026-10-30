package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Institution inst = new Institution("учебное заведение 1", "адрес 1", 100);
        School school = new School("школа 1", "адрес 2", 500);
        University univ = new University("университет 1", "адрес 3", 5000);

        inst.teach();
        inst.teach("математика");
        inst.teach(5);
        System.out.println(inst.getType());

        school.teach();
        school.teach("физика");
        school.teach(3);
        System.out.println(school.getType());

        univ.teach();
        univ.teach("программирование");
        univ.teach(10);
        System.out.println(univ.getType());

    }
}