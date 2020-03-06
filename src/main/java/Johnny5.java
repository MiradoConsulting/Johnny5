import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Johnny5 extends Robot {

    public void run() {
        setAllColors(Color.WHITE);
        while (true) {
            if (nearWall()) {
                turnLeft(45);
            } else {
                ahead(50);
                turnRight(45);
            }
            turnGunRight(360);
        }
    }

    public boolean nearWall() {
        return (getX() < 50) ||
                (getX() > (getBattlefieldWidth() - 50)) ||
                (getY() < 50) ||
                (getY() > (getBattlefieldWidth() - 50));
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
