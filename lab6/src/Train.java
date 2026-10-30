class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;
    public int colvo;

    public static int per;

    public static void func(){
        System.out.println(per);

    }
    public void funcc(){
        System.out.println(per);
        System.out.println(destination);
        System.out.println(trainNumber);
        System.out.println(departureTime);
        System.out.println(colvo);

    }
    /*
    Train.func();
    h2.funcc();
     */

    public int getColvo(){
       return colvo;
    }

    public void setColvo(int colvo){
       this.colvo = colvo;
    }



    public Train(String Destination, int trainNumber, String departureTime,int colvo) {
       this(Destination, trainNumber, departureTime);
       this.colvo = colvo;

    }


    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void isDelayed(int minutes) {
        System.out.println("Поезд n" + trainNumber + " задерживается на " + minutes + " минут");
        this.departureTime = this.departureTime + " (задержка на " + minutes + " мин)";
    }

    public void displayInfo() {

        System.out.println("Номер поезда: " + trainNumber);
        System.out.println("Пункт назначения: " + destination);
        System.out.println("Время отправления: " + departureTime);
    }
}
