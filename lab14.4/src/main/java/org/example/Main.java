package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        File file = new File("kpd.txt");

        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("введите 10 значений кпд:");
            for (int i = 0; i < 10; i++) {
                double val = scanner.nextDouble();
                writer.write(val + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count > 0) {
            System.out.println("средний кпд: " + (sum / count));
        }
    }
}
