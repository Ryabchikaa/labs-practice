package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static void main() {
        File f = new File("f.txt");
        Random random = new Random();

        try (FileWriter writer = new FileWriter(f)) {
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(150);
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(f);
             FileWriter writerG = new FileWriter("g.txt");
             FileWriter writerH = new FileWriter("h.txt")) {

            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (val < 100 && val % 2 != 0) {
                    writerG.write(val + "\n");
                } else {
                    writerH.write(val + "\n");
                }
            }
            System.out.println("файлы g и h успешно созданы");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
