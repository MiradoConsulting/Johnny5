import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Johnny5 extends AdvancedRobot {

    public void run() {
        setAllColors(Color.WHITE);
        while (true) {
            setTurnRight(1);
            setAhead(1);
            setTurnGunLeft(10);
            if (nearWall()) {
                turnLeft(45);
            }
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
