import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("выберите задание (1 2 3): ");
        int nom = scanner.nextInt();

        switch (nom) {
            case 1:
                System.out.print("введите градусы по фаренгейту: ");
                double fa = scanner.nextDouble();
                double ce = (fa - 32) * 5.0 / 9.0;
                System.out.println("результат в цельсиях: " + ce);
                break;

            case 2:
                System.out.print("выберите валюту 1-USD, 2-EUR, 3-RUB: ");
                int val = scanner.nextInt();
                System.out.print("введите сумму: ");
                double sum = scanner.nextDouble();

                switch (val) {
                    case 1:
                        double rubFromUsd = sum * 90;
                        double eurFromUsd = sum * (90.0 / 98.0);
                        System.out.println("в рублях это: " + rubFromUsd);
                        System.out.println("в евро это: " + eurFromUsd);
                        break;
                    case 2:
                        double usdFromEur = sum * (98.0 / 90.0);
                        double rubFromEur = sum * 98;
                        System.out.println("в долярах это: " + usdFromEur);
                        System.out.println("в рублях это: " + rubFromEur);
                        break;
                    case 3:
                        double usdFromRub = sum / 90.0;
                        double eurFromRub = sum / 98.0;
                        System.out.println("в долярах это: " + usdFromRub);
                        System.out.println("в евро это: " + eurFromRub);
                        break;
                }
                break;

            case 3:
                System.out.print("введите a (от): ");
                int a = scanner.nextInt();
                System.out.print("введите b (до): ");
                int b = scanner.nextInt();

                int summ = 0;
                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0) {
                        summ += i;
                    }
                }
                System.out.println("сумма четных чисел = " + summ);
                break;

            case 4:
                System.out.print("введите страну: ");
                scanner.nextLine();
                String country = scanner.nextLine();
                switch (country) {
                    case "Беларусь":
                        System.out.print("Минск!");
                }

            default:
                System.out.println("вы ввели чот неправильное!!!");
                break;


        }

        scanner.close();
    }
}