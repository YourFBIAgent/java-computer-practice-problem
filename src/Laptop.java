import javax.sound.sampled.Port;

public class Laptop extends Computer implements PortableDevice {
    private int batteryCapacity;
    private double weight;

    public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);

        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", batteryCapacity=" + this.batteryCapacity + ", weight=" + this.weight;
    }

    public String getComputerType() {
        return "laptop";
    }

    public int calculatePortabilityScore() {
        return (int) (this.weight);
    }
}
