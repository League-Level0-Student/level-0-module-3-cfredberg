package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot robo = new Robot();
	public static void main(String[] args) {
		int color1 = 0;
		ObedientRobot oRobo = new ObedientRobot();
		String drawColor = JOptionPane.showInputDialog("What color would you like to draw with? Cyan, red, or green?");
		String shape = JOptionPane.showInputDialog("What shape would you like to draw? Square, triangle, or circle?");
		if (drawColor.equalsIgnoreCase("cyan")) {
			color1 = 1;
		}else if (drawColor.equalsIgnoreCase("red")) {
			color1 = 2;
		}else {
			color1 = 3;
		}
		if (shape.equalsIgnoreCase("square")) {
			oRobo.square(color1, 100);
		}else if (shape.equalsIgnoreCase("triangle")) {
			oRobo.triangle(color1, 100);
		}else {
			oRobo.circle(color1, 100);
		}
	}
	void square(int color, int speed) {
		robo.penDown();
		robo.setSpeed(speed);
		if (color == 1) {
			robo.setPenColor(Color.CYAN);
		}else if (color == 2) {
			robo.setPenColor(Color.RED);
		}else if (color == 3) {
			robo.setPenColor(Color.GREEN);
		}
		for (int i = 0; i < 4; i++) {
			robo.move(100);
			robo.turn(90);
		}
	}
	void triangle(int color, int speed) {
		robo.penDown();
		robo.setSpeed(speed);
		if (color == 1) {
			robo.setPenColor(Color.CYAN);
		}else if (color == 2) {
			robo.setPenColor(Color.RED);
		}else if (color == 3) {
			robo.setPenColor(Color.GREEN);
		}
		for (int i = 0; i < 3; i++) {
			robo.move(100);
			robo.turn(120);
		}
	}
	void circle(int color, int speed) {
		robo.penDown();
		robo.setSpeed(speed);
		if (color == 1) {
			robo.setPenColor(Color.CYAN);
		}else if (color == 2) {
			robo.setPenColor(Color.RED);
		}else if (color == 3) {
			robo.setPenColor(Color.GREEN);
		}
		for (int i = 0; i < 36; i++) {
			robo.move(10);
			robo.turn(10);
		}
	}
}
