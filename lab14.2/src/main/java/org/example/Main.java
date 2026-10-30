package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        File file = new File("f.txt");

        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("числа из файла:");
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int val = fileScanner.nextInt();
                System.out.print(val + " ");
                if (val > 10 && val % 2 == 0) {
                    count++;
                }
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("количество чётных и больших 10: " + count);
    }
}
