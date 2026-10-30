package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static void main() {
        File file = new File("f.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("5\n15\n50\n90\n95\n10\n45\n2\n88\n100\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (val >= 10 && val <= 90) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("количество чисел в диапазоне от 10 до 90: " + count);
    }
}
