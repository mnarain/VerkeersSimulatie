package sr.unasat.models;

public class Car {
    private String carName;
    private int carPriority;

    public Car(String carName, int carPriority) {
        this.carName = carName;
        this.carPriority = carPriority;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarPriority() {
        return carPriority;
    }

    public void setCarPriority(int carPriority) {
        this.carPriority = carPriority;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPriority=" + carPriority +
                '}';
    }
}
