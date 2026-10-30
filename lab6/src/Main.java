public class Main {
    public static void main(String[] args) {
        Train train = new Train("Минск - Брест", 701, "14:30");

        train.displayInfo();

        train.isDelayed(30);

        train.displayInfo();
    }
}