public class Device {
    protected int battery;

    // Constructor
    public Device() {
        this.battery = 100;
    }

    
    public void displayBattery() {
        System.out.println("Battery remaining: " + battery);
    }
}
