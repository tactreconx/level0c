import org.jointheleague.graphical.robot.Robot;

public class RegularPolygons {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.moveTo(500, 500);

		for (int i = 0; i < 5; i = i + 1) {

			robot.penDown();
			robot.setSpeed(30);
			robot.setRandomPenColor();
			robot.move(90);
			robot.turn(90);

		}
		robot.penUp();
		robot.moveTo(500, 600);
			robot.penDown();
			robot.setSpeed(30);
			robot.setRandomPenColor();
			robot.turn(85);
			robot.move(90);
			robot.turn(85);
			robot.move(90);
			robot.turn(100);
			robot.move(90);

		}
		
	

	public static float getAngle(int sides) {
		float total = 3 * 180 - 360;
		float angle = 80 / 3;
		System.out.println(angle);
		return angle;

	}
}
