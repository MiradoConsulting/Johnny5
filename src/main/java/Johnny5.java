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
        if (e.getDistance() > 100)
        fire(1);
        else if (e.getDistance() > 10)
            fire (2.0);
        else {
            fire(3.0);
        }

    }
}
