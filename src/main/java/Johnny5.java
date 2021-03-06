import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Johnny5 extends Robot {

    public void run() {
        setAllColors(Color.WHITE);

        turnLeft(getHeading());
        turnGunLeft(90);
        while (true) {
            if (nearWall()) {
                back(50);
                turnLeft(90);
                turnGunLeft(360);
            }
            ahead(100);
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
            fire(Math.min(50.0, getEnergy()));
        }

    }
}
