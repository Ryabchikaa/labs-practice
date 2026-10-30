import java.util.Scanner;

class Store {
    String name;
    String address;
    int employeeCount;

    public Store(String name, String address, int employeeCount) {
        this.name = name;
        this.address = address;
        this.employeeCount = employeeCount;
    }

    public boolean isLarge() {
        return this.employeeCount > 50;
    }

    public void displayInfo() {
        System.out.println("Магазин: " + name + " Адрес: " + address + " Кол-во сотрудников: " + employeeCount);
    }
}

class School {
    String name;
    int students;
    int teachers;

    public School(String name, int students, int teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public void displayInfo() {
        System.out.println("Школа: " + name + " Учеников: " + students + " Учителей: " + teachers);
    }
}

enum InsuranceType {
    HEALTH,
    LIFE,
    CAR,
    PROPERTY
}

class Insurance {
    String number;
    InsuranceType type;

    public Insurance(String number, InsuranceType type) {
        this.number = number;
        this.type = type;
    }



    public void displayInfo() {
        System.out.println("Страховка: " + number + " Тип: " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("0");
        System.out.print("Выбери номер задания: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                runTask1();
                break;
            case 2:
                runTask2();
                break;
            case 3:
                runTask3();
                break;
            case 0:
                System.out.println("Выход");
                break;
            default:
                System.out.println("Чот не то ты ввел");
                break;
        }

        scanner.close();
    }

    public static void runTask1() {
        Store store1 = new Store("Евроопт", "пр Машерова 76", 65);
        Store store2 = new Store("Соседи", "пр Независимости 135", 25);

        store1.displayInfo();
        System.out.println("Является ли крупным: " + store1.isLarge());


        store2.displayInfo();
        System.out.println("Является ли крупным: " + store2.isLarge());
    }

    public static void runTask2() {

        School[] schools = new School[5];
        schools[0] = new School("Гимназия 36", 1200, 85);
        schools[1] = new School("Школа 2", 800, 60);
        schools[2] = new School("Лицей 3", 1500, 110);
        schools[3] = new School("Школа 4", 650, 45);
        schools[4] = new School("Школа 5", 950, 70);

        School maxStudentsSchool = schools[0];
        School maxTeachersSchool = schools[0];

        for (int i = 0; i < schools.length; i++) {
            if (schools[i].students > maxStudentsSchool.students) {
                maxStudentsSchool = schools[i];
            }
            if (schools[i].teachers > maxTeachersSchool.teachers) {
                maxTeachersSchool = schools[i];
            }
        }

        System.out.println("Школа макс учеников:");
        maxStudentsSchool.displayInfo();

        System.out.println("Школа с макс учителей:");
        maxTeachersSchool.displayInfo();
    }

    public static void runTask3() {
        Insurance[] insurances = new Insurance[6];
        insurances[0] = new Insurance("st1", InsuranceType.HEALTH);
        insurances[1] = new Insurance("st2", InsuranceType.CAR);
        insurances[2] = new Insurance("st3", InsuranceType.LIFE);
        insurances[3] = new Insurance("st4", InsuranceType.HEALTH);
        insurances[4] = new Insurance("st5", InsuranceType.PROPERTY);
        insurances[5] = new Insurance("st6", InsuranceType.HEALTH);

        System.out.println("Все страховки типа health:");
        for (Insurance ins : insurances) {
            if (ins.type == InsuranceType.HEALTH) {
                ins.displayInfo();
            }
        }
    }
}