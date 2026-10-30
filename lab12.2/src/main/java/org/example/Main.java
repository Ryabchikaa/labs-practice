package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void printMuseums(List<Museum> museums, int stars) {
        for (Museum m : museums) {
            if (m.getStars() == stars) {
                System.out.println("музей: " + m.getName() + ", звезды: " + m.getStars());
            }
        }
    }

    public static void main(String[] args) {
        List<Museum> museums = new ArrayList<>();
        museums.add(new Museum(1, "эрмитаж", "санкт-петербург", 5, Arrays.asList(5, 5, 4, 5)));
        museums.add(new Museum(1, "рмитаж", "санкт-петербург", 5, Arrays.asList(5, 5, 4, 5)));
        museums.add(new Museum(2, "лувр", "париж", 5, Arrays.asList(5, 4, 4, 5)));
        museums.add(new Museum(3, "исторический музей", "москва", 3, Arrays.asList(3, 2, 3, 3)));
        museums.add(new Museum(4, "краеведческий музей", "минск", 2, Arrays.asList(2, 2, 1, 3)));

        for (Museum m : museums) {
            if (m.getAverageRating() > 3) {
                System.out.println("музей со средним рейтингом > 3: " + m.getName() + " (" + m.getAverageRating() + ")");
            }
        }

        for (Museum m : museums) {
            if (m.getAverageRating() >= 4) {
                m.setStars(m.getStars() + 1);
            }
        }

        printMuseums(museums, 5);

        museums.sort(new Comparator<Museum>() {
            @Override
            public int compare(Museum m1, Museum m2) {
                int res = Double.compare(m2.getAverageRating(), m1.getAverageRating());
                if (res == 0) {
                    return m2.getName().compareTo(m1.getName());
                }
                return res;
            }
        });

        for (Museum m : museums) {
            System.out.println("id: " + m.getId() + ", название: " + m.getName() + ", средний рейтинг: " + m.getAverageRating());
        }
    }
}