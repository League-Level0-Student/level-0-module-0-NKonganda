package _01_robot._2_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;

public class Robot2 {
public static void main(String[] args) throws Exception {
	Robot call = new Robot();
	call.penDown();
	call.setSpeed(10);
	call.move(150);
	call.turn(135);
	call.move(225);
	call.turn(-135);
	call.move(150);
}
}
