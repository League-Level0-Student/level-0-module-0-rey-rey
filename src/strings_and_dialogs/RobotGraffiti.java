package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	Robot rr = new Robot();
	
	public RobotGraffiti()
	{
		rr.setX(500);
		rr.setY(500);
		rr.setSpeed(10);
		
/*		rr.setAngle(0);
		rr.turn(0);
		rr.sleep(2000);
		
		//rr.setAngle(0);
		rr.turn(45);
		rr.sleep(2000);
		
		//rr.setAngle(0);
		rr.turn(90);
		rr.sleep(2000);
		*/
	}
	
	private void WriteR()
	{
		rr.penDown();
		rr.move(400);
		rr.turn(90);
		rr.move(100);
		rr.turn(90);
		rr.move(100);
		rr.turn(90);
		rr.move(100);
		//rr.setSpeed(1);
		rr.setAngle(135);
		rr.move(300);
	}
	
	  public static void main(String[] args) throws Exception {
		  
		RobotGraffiti rg = new RobotGraffiti();
		rg.WriteR();
		
	  }

}
