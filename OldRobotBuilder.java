package dp.builder;

public class OldRobotBuilder implements RobotBuilder {
	private Robot robot;

	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {robot.setRobotHead("tin");}

	@Override
	public void buildRobotTorso() {robot.setRobotTorso("tin");}

	@Override
	public void buildRobotArms() {robot.setRobotArms("blowtorch");}

	@Override
	public void buildRobotLegs() {robot.setRobotLegs("rollerskate");}
	
	public Robot getRobot() {return this.robot;}
}
