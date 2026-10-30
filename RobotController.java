import java.util.ArrayList;

public class RobotController {
    ArrayList<Robot> robots = new ArrayList<>();

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void startAll() {
        for (int i = 0; i < robots.size(); i++) {
            robots.get(i).start();
        }
    }

    public void stopAll() {
        for (int i = 0; i < robots.size(); i++) {
            robots.get(i).stop();
        }
    }

    public void showStatus() {
        for (int i = 0; i < robots.size(); i++) {
            System.out.println(robots.get(i).status());
        }
    }
}