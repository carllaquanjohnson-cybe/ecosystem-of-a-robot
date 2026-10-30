public class WalkingRobot extends BaseRobot {
    int legs;

    public WalkingRobot(String id, int batteryLevel, int legs) {
        super(id, batteryLevel);
        this.legs = legs;
    }

    public void walk() throws LowBatteryException {
        useBattery(8);
        System.out.println(id + " is walking on " + legs + " legs.");
    }
}