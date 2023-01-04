package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(30, 22, true, 18);
        Room room2 = new Room(25, 24, false);
        Room room3 = new Room(27, 18.5, true, 18);

        room1.lowerTemperature();
        room1.lowerTemperature();
        room2.lowerTemperature();
        room3.lowerTemperature();

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
    }
}
