package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String AYH = JOptionPane.showInputDialog("Are you happy?");
		if (AYH.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		}else if (AYH.equalsIgnoreCase("no")) {
			String WTBH = JOptionPane.showInputDialog("Do you want to be happy?");
			if (WTBH.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}else if (WTBH.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
		}
	}
}
