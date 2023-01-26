package MeierNoah;
import robocode.*;
public class NoahMeierAurelienDansUnTank extends JuniorRobot
{
	public void run() {
			setColors(red, green, green, green, yellow);



			while(true) {
				turnGunRight(360);
				DriveInCurveRight();
			}
	}
	public void onScannedRobot() {
		turnTo(scannedAngle);
		ahead(40);
		// Shoot stronger, if the target robot is closer
		if (gunReady) {
			fire(1);
		}
		if (scannedDistance < 5){
			fire(3);
			fire(3);
			fire(3);
		}
	}
	public void onHitByBullet() {
		// When hit by bullet, drive perpendicular to where the bulltet came from
		back(10);
		turnAheadLeft(70, 45 - hitByBulletBearing);
	}
	public void onHitWall() {
		// When a wall is hit, turn away from it
		back(20);
		turnRight(180);
	}	
	public void DriveInCurveRight(){
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
	}
}



