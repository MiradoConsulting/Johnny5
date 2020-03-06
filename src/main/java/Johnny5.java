import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Johnny5 extends Robot {

    public void run() {
        setAllColors(Color.WHITE);

        int dir = 0;
        while (getHeading() > 0) {
            turnLeft(1);
        }

        while (true) {
            if (nearWall()) {
                back(10);
                turnLeft(90);
                dir = (dir + 90) % 90;
            }
            ahead(100);
            turnGunLeft(360);
        }

    }

    public boolean nearWall() {
        return (getX() < 50) ||
                (getX() > (getBattleFieldWidth() - 50)) ||
                (getY() < 50) ||
                (getY() > (getBattleFieldHeight() - 50));
    }



    public void onScannedRobot(ScannedRobotEvent e) {
        if (e.getDistance() > 100)
        fire(Math.min(1, getEnergy()));
        else if (e.getDistance() > 10)
            fire (Math.min(4.0, getEnergy()));
        else {
            fire(Math.min(10.0, getEnergy()));
        }

    }
}
