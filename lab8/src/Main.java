public class Main {
    public static void main(String[] args) {
        EducationalInstruction[] institutions = new EducationalInstruction[5];

        institutions[0] = new School("Школа 1", "ул. Ленина, 5", 500, 11);
        institutions[1] = new School("Школа 2", "ул. Гагарина, 12", 700, 9);
        institutions[2] = new School("Гимназия 3", "пр. Независимости, 44", 900, 11);

        institutions[3] = new University("БГУ", "пр. Независимости, 4", 25000, 18);
        institutions[4] = new University("БНТУ", "пр. Независимости, 65", 20000, 15);

        for (int i = 0; i < institutions.length; i++) {
            institutions[i].displayInfo();

            if (institutions[i] instanceof School) {
                ((School) institutions[i]).holdLesson();
            } else if (institutions[i] instanceof University) {
                ((University) institutions[i]).holdLecture();
            }

        }
    }
}