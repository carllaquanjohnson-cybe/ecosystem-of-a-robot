public class Main {
    public static void main(String[] args) {

        // 1. Create the controller
        RobotController controller = new RobotController();

        // 2. Create robots using constructors
        FlyingRobot flyer  = new FlyingRobot("FLY-01", 100, 50);
        MovingRobot mover  = new MovingRobot("MOV-01", 80, 4);
        WalkingRobot walker = new WalkingRobot("WALK-01", 30, 2);

        // 3. Add them to the controller (as Robot type)
        controller.addRobot(flyer);
        controller.addRobot(mover);
        controller.addRobot(walker);

        // 4. Show status and start all
        controller.showStatus();
        controller.startAll();

        // 5. Call unique behaviours
        try {
            flyer.fly();
            mover.drive();
            walker.walk();

            // 6. Demonstrate method overloading
            flyer.move(10);
            flyer.move(20, "north");

            // 7. Drain battery to trigger the exception
            System.out.println("\n--- Draining walker's battery ---");
            walker.walk();
            walker.walk();
            walker.walk();   // should throw LowBatteryException

        } catch (LowBatteryException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            controller.stopAll();
        }
    }
}