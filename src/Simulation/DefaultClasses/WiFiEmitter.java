package Simulation.DefaultClasses;

public class WiFiEmitter {
    private double coordX;

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    private double coordY;

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    private double frequency = 2412;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency, String bandName) {
        double newFrequency = frequency.getBandValue(bandName);
        if (newFrequency != -1)
            this.frequency = newFrequency;
    }

    public WiFiEmitter(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
}
