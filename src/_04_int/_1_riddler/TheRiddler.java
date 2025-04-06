package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("What gets shorter as it gets older?");
		String ans = "A candle";
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input.equalsIgnoreCase(ans)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The correct answer is " + ans);
		}
		// 6. Add some more riddles
		input = JOptionPane.showInputDialog("Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		ans = "A coffin";
		if(input.equalsIgnoreCase(ans)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The correct answer is " + ans);
		}
		input = JOptionPane.showInputDialog("What runs all around a backyard, yet never moves?");
		ans = "A fence";
		if(input.equalsIgnoreCase(ans)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The correct answer is " + ans);
		}
		input = JOptionPane.showInputDialog("If two's company, and three's a crowd, what are four and five?");
		ans = "Nine";
		if(input.equalsIgnoreCase(ans)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. The correct answer is " + ans);
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

