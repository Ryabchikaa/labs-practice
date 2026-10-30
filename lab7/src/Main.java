class Hotel {
    private String name;
    private int stars;
    private int rooms;

    private static int totalHotels = 0;
    private static int totalRooms = 0;

    public Hotel(String name, int stars, int rooms) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;

        totalHotels++;
        totalRooms += rooms;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getRooms() {
        return rooms;
    }

    public static double getAverageRooms() {
        if (totalHotels == 0) {
            return 0.0;
        }
        return (double) totalRooms / totalHotels;
    }

    public void displayInfo() {
        System.out.println("Отель: " + name + ", Звезд: " + stars + ", Номеров: " + rooms);
    }
}

public class Main {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("hot1", 5, 250);
        Hotel h2 = new Hotel("hot2", 3, 90);
        Hotel h3 = new Hotel("hot3", 4, 160);
        Hotel h4 = new Hotel("hot4", 2, 50);
        Hotel h5 = new Hotel("hot5", 5, 300);

        h1.displayInfo();
        h2.displayInfo();
        h3.displayInfo();
        h4.displayInfo();
        h5.displayInfo();


        double avgRooms = Hotel.getAverageRooms();
        System.out.println("Среднее число номеров во всех отелях: " + avgRooms);
    }
}