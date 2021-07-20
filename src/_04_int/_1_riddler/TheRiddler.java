package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog(null, "Riddle time! What has to be broken before you use it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (input.equalsIgnoreCase("An egg")) {
			score ++;
			JOptionPane.showMessageDialog(null, "Correct!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. It was an egg.");
		}
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		input = JOptionPane.showInputDialog (null, "Who makes it, has no need of it.\r\n"
				+ "Who buys it, has no use for it. \r\n"
				+ "Who uses it can neither see nor feel it. \r\n"
				+ "What is it?");
		if (input.equalsIgnoreCase("A coffin")) {
			JOptionPane.showMessageDialog(null, "You're right!");
			score ++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong. It was a coffin.");
		}
		input = JOptionPane.showInputDialog(null, "I am a odd number. Take away a letter and I become even.\r\n"
				+ "What am I?");
		if (input.equalsIgnoreCase("Seven")) {
			JOptionPane.showMessageDialog(null, "Correct!!");
			score ++;
		}
		else {
			JOptionPane.showMessageDialog(null, "No, it was seven.");
		}
		input = JOptionPane.showInputDialog(null, "Feed me and I live, yet give me a drink and I die. What am I?");
		if (input.equalsIgnoreCase("Fire")) {
			score ++;
			JOptionPane.showMessageDialog(null, "Correct.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nope, it was fire.");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, +score);
		
	}
}

