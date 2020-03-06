import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Johnny5 extends Robot {

    public void run() {
        setAllColors(Color.ORANGE);
        while (true) {
            ahead(100);
            turnRight(45);
            turnGunRight(360);

        }
    }



    public void onScannedRobot(ScannedRobotEvent e) {

        fire(1);

    }
}
