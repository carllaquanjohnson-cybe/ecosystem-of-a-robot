public abstract class BaseRobot implements Robot {
    String id;
    int batteryLevel;
    boolean running;

    public BaseRobot(String id, int batteryLevel) {
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.running = false;
    }

    public void start() {
        running = true;
        System.out.println(id + " has started.");
    }

    public void stop() {
        running = false;
        System.out.println(id + " has stopped.");
    }

    public String status() {
        return id + " battery=" + batteryLevel + "% running=" + running;
    }

    // lets give them same name but different parameters
    public void move(int speed) {
        System.out.println(id + " moves at speed " + speed);
    }

    public void move(int speed, String direction) {
        System.out.println(id + " moves at speed " + speed + " towards " + direction);
    }

    // lets reduce battery and throw error if too low
    public void useBattery(int amount) throws LowBatteryException {
        batteryLevel = batteryLevel - amount;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        if (batteryLevel < 20) {
            throw new LowBatteryException(id + " battery is low: " + batteryLevel + "%");
        }
    }
}