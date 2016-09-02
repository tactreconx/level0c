	import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;





public class RobotGraffiti {
	public static void main(String[] args) {
		new RobotGraffiti().controlTheTortoise();
	}

	private void controlTheTortoise() {
		Tortoise.getBackgroundWindow().setBackgroundImage(
				"https://thumbs.dreamstime.com/t/blue-green-abstract-background-illustration-squares-42115002.jpg");
		Tortoise.penUp();
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.setX(100);
		Tortoise.setY(300);
		Tortoise.penDown();
		Tortoise.move(100);
		Tortoise.turn(60);
		Tortoise.move(28);
		Tortoise.turn(30);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(35);
		Tortoise.turn(71);
		Tortoise.move(80);
		 Tortoise.turn(199);
		Tortoise.move(75);
		Tortoise.turn(80);
		Tortoise.move(45);
		Tortoise.turn(80);
		Tortoise.move(45);
		Tortoise.turn(10);
		Tortoise.move(40);
		Tortoise.turn(98);
		Tortoise.move(5);
		 Tortoise.penUp();
		 Tortoise.setX(200);
			Tortoise.setY(300);
		  Tortoise.penDown();
		 Tortoise.move(100);
		Tortoise.turn(180);
		Tortoise.move(100);
		Tortoise.turn(-160);
		Tortoise.move(60);
		Tortoise.turn(160);
		Tortoise.move(60);
		Tortoise.turn(-160);
		Tortoise.move(100);
}

}
