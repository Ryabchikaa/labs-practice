public class University extends EducationalInstruction{
    private int faculties;

    public University(String name, String address, int students, int faculties) {
        super(name, address, students);
        this.faculties = faculties;
    }

    @Override
    public String getType() {
        return "Университет";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество факультетов: " + faculties);
    }

    public void holdLecture() {
        System.out.println("Университет " + getName() + " проводит лекцию.");
    }

    public int getFaculties() {
        return faculties;
    }

    public void setFaculties(int faculties) {
        this.faculties = faculties;
    }
}
