import robocode.*;

import java.util.Random;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Johnny5 - a robot by (your name here)
 */
public class Johnny5 extends Robot
{
	Random rand;

	/**
	 * run: Johnny5's default behavior
	 */
	public void run() {
		rand = new Random();
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.PINK,Color.PINK,Color.PINK); // body,gun,radar

		// Robot main loop
		while(true) {
			doColours();

			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnLeft(rand.nextDouble()*180);
			turnGunRight(360);
			back(100);
			turnRight(rand.nextDouble()*180);
			turnGunRight(360);
		}
	}

	private void doColours() {
		Color colour = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
		setColors(colour, colour, colour);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}
}
