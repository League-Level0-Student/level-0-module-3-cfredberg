//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		for (int i = 0; i < 5; i++) {
		Robot robo = new Robot();
		Random gen = new Random();
		int numInt = gen.nextInt(4);
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			robo.setPenColor(Color.RED);
		}else if (color.equalsIgnoreCase("green")) {
			robo.setPenColor(Color.GREEN);
		}else if (color.equalsIgnoreCase("blue")) {
			robo.setPenColor(Color.BLUE);
		}else if (color.equalsIgnoreCase("black")) {
			robo.setPenColor(Color.BLACK);
		}else {
			if (numInt == 0) {
				robo.setPenColor(Color.RED);
			}else if (numInt == 1) {
				robo.setPenColor(Color.GREEN);
			}else if (numInt == 2) {
				robo.setPenColor(Color.BLUE);
			}else if (numInt == 3) {
				robo.setPenColor(Color.BLACK);
			}
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		robo.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robo.show();
		robo.penDown();
		robo.setSpeed(20);
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
		robo.move(100);
		robo.turn(90);
		robo.hide();
		}
	}
}
