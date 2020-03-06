import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Johnny5 extends Robot {

    public void run() {
        while (true) {
            ahead(1);
            turnRight(1);
            turnGunRight(360);
            
        }
    }



    public void onScannedRobot(ScannedRobotEvent e) {

        fire(1);

    }
}
