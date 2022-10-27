package racingCar;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "No information";
        } else {
            this.brand = brand;
        }
        if (model == null && model.isEmpty()) {
            this.model = "No information";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 000;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "No information";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null && model.isEmpty()) {
            this.model = "No information";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 000;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void finishTheMovement();

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