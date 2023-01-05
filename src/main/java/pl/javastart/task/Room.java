package pl.javastart.task;

public class Room {
    private double metre;
    private double currentTemperature;
    private boolean isAirConditioner;
    private double limitTemperature;

    public Room(double metre, double currentTemperature, boolean isAirConditioner, double limitTemperature) {
        this(metre, currentTemperature, isAirConditioner);
        this.limitTemperature = limitTemperature;
    }

    public Room(double metre, double currentTemperature, boolean isAirConditioner) {
        this.metre = metre;
        this.currentTemperature = currentTemperature;
        this.isAirConditioner = isAirConditioner;
    }

    @Override
    public String toString() {
        return "Room{" +
                "metre=" + metre +
                ", currentTemperature=" + currentTemperature +
                ", isAirConditioner=" + isAirConditioner +
                ", limitTemperature=" + limitTemperature +
                '}';
    }

    public boolean lowerTemperature() {
        if (isAirConditioner && currentTemperature > limitTemperature) {
            if (currentTemperature - limitTemperature < 1) {
                currentTemperature = limitTemperature;
                return true;
            }
            currentTemperature = currentTemperature - 1;
            return true;
        } else {
            return false;
        }
    }
}
