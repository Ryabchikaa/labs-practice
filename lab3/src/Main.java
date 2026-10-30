import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("выберите задание: ");
        int nom = scanner.nextInt();

        switch (nom) {
            case 1:
                String str = "чевоващекапец";
                char ch = str.charAt(4);
                System.out.println("Символ по индексу 4: " + ch);
                break;

            case 2:

                String sentence = "круто крутотень ващекрутость блаблаблаблаблабла";
                String[] words = sentence.split(" ");
                String longestWord = words[0];
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }

                System.out.println("самое капец длинное слово:  " + longestWord);
                break;

            case 3:
                class Employee {
                    String fullname;
                    double salary;

                    public Employee(String fullname, double salary) {
                        this.fullname = fullname;
                        this.salary = salary;
                    }
                }


                class Report {
                    public static void generateReport(Employee[] employees) {
                        System.out.printf("%-15s %10s%n","ФИО", "зарплата");

                        for (Employee emp : employees) {
                            System.out.printf("%-15s %10.2f%n", emp.fullname, emp.salary);
                        }
                    }
                }

                Employee[] employees = {
                        new Employee("Рябов", 1250.50),
                        new Employee("Дражин", 980.00),
                        new Employee("Крайко", 2300.758)
                };

                Report.generateReport(employees);
                break;

            case 4:
                String text = "a1a a22a a33a a4444a a555a";
                Pattern pattern = Pattern.compile("a[13579]{2,3}a");
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;

            default:
                System.out.println("вы ввели чот неправильное!!!");
                break;


        }

        scanner.close();
    }
}