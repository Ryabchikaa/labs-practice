package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static void main() {
        try {
            File file = new File("animal.txt");
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("любимое животное: кот\nпорода: британский\nвозраст: 3 года");
            }

            System.out.println("имя файла: " + file.getName());
            System.out.println("размер файла: " + file.length() + " байт");
            System.out.println("абсолютный путь: " + file.getAbsolutePath());

            System.out.println("содержимое файла:");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
