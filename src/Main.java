import Entity.Robot;
import Utilites.RoboFactory;

/**
 * Created by дима on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = RoboFactory.getNewRobot();
        robot.testThisRobot();
    }
}
