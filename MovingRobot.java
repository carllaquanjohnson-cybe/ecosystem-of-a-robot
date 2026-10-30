public class MovingRobot extends BaseRobot {
    int wheels;

    public MovingRobot(String id, int batteryLevel, int wheels) {
        super(id, batteryLevel);
        this.wheels = wheels;
    }

    public void drive() throws LowBatteryException {
        useBattery(5);
        System.out.println(id + " is driving on " + wheels + " wheels.");
    }
}