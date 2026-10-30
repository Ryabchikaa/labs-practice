package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> clinic = new ArrayList<>();

        try {
            clinic.add(new Pet("барсик", "кот", 3, 4.5, "анна"));
            clinic.add(new Pet("бобик", "собака", 5, 12.0, "иван"));
            clinic.add(new Pet("кеша", "попугай", 1, 0.3, "ольга"));
        } catch (InvalidPetDataException e) {
            System.out.println("ошибка создания: " + e.getMessage());
        }

        for (Pet p : clinic) {
            try {
                p.visitVet();
                p.updateWeight(p.getWeight() + 0.5);
            } catch (VetException | InvalidPetDataException e) {
                System.out.println("ошибка у питомца " + p.getName() + ": " + e.getMessage());
            }
        }

        try {
            Pet wrongPet = new Pet("ошибка", "рыбка", -2, 0.1, "петр");
        } catch (InvalidPetDataException e) {
            System.out.println("пойманное исключение: " + e.getMessage());
        }
    }
}
