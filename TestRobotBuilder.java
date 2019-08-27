package dp.builder;

public class TestRobotBuilder {
	public static void main(String[] args) {
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotEngineer engie = new RobotEngineer(oldStyleRobot);
		
		engie.makeRobot();
		Robot firstRobot = engie.getRobot();

		System.out.println("Robot built with " + firstRobot.getRobotHead() + " head, " + firstRobot.getRobotTorso() + " torso, " + firstRobot.getRobotArms() + " arms, and " +firstRobot.getRobotLegs() + " legs!");
	}
}
