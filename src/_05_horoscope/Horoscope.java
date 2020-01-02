package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your star sign?");
		if (sign.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Mars.\n" + 
					"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
	}
}
