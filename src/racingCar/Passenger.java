package racingCar;

public class Passenger extends Transport implements Competing{

    public Passenger(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    @Override
    public String[] getPitStop() {
        return new String[0];
    }

    @Override
    public double[] bestLapTime() {
        return new double[0];
    }

    @Override
    public int[] maxSpeed() {
        return new int[0];
    }
}
