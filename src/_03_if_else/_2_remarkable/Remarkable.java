package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Shail = "He has a dog.";
String Dad = "He is cool.";
String Mom = "She is kind.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(input.equals("Shail")) {
	JOptionPane.showMessageDialog(null, Shail);
}
else if(input.equals("Dad")) {
	JOptionPane.showMessageDialog(null, Dad);
}
else if(input.equals("Mom")) {
	JOptionPane.showMessageDialog(null, Mom);
}
	}
}

