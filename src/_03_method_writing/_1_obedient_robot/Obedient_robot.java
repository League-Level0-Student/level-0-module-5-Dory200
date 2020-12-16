package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.show();
		rob.penDown();
		rob.setSpeed(25);
		String shape = JOptionPane.showInputDialog("square, circle, traingle, which do you want to draw?");
	if(shape.equals("square")) {
		for(int m=0; m<4; m++) {
			rob.move(50);
			rob.turn(90);
		}
	}
	else if(shape.equals("traingle"))
		for(int a=0; a<3; a++) {
			rob.move(50);
			rob.turn(120);
		}
	else {
		for(int i=0; i<40; i++) {
			rob.move(10);
			rob.turn(9);
		}
	}
	}
}
