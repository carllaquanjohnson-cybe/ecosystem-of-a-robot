public class FlyingRobot extends BaseRobot {
    int altitude;

    public FlyingRobot(String id, int batteryLevel, int altitude) {
        super(id, batteryLevel);   // call parent constructor
        this.altitude = altitude;
    }

    @Override
    public void start() {
        super.start();             // run the parent's start
        System.out.println(id + " is taking off...");
    }

    public void fly() throws LowBatteryException {
        useBattery(10);
        System.out.println(id + " is flying at " + altitude + " meters.");
    }
}