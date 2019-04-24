package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot rr = new  Robot();

        // 3. Put the robot's pen down
rr.penDown();

        // 6. Make the robot move as fast as possible
rr.setSpeed(100);


        // 5. Do everything below here 4 times
for (int ii = 0; ii < 4; ii++)
{

        //         2. Move your robot 200 pixels
rr.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
rr.turn(90);
}

    }
}
