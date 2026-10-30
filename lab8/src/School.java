public class School extends EducationalInstruction{
    private int grades;

    public School(String name, String address, int students, int grades) {
        super(name, address, students);
        this.grades = grades;
    }

    @Override
    public String getType() {
        return "Школа";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество классов: " + grades);
    }

    public void holdLesson() {
        System.out.println("Школа " + getName() + " проводит урок.");
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
