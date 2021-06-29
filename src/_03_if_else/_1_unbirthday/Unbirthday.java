package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Is today your birthday?");
		
		if (input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Have a very merry UnBirthday then!!");
		}
	}
}
