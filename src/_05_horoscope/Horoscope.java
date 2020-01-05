package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your star sign?");
		if (sign.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Mars.\n" + 
					"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}else if (sign.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Venus.\n" + 
					"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}else if (sign.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Mercury\n" + 
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}else if (sign.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Mercury\n" + 
					"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}else if (sign.equalsIgnoreCase("leo")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by the Sun.\n" + 
					"Generous, organized, protective, beautiful.");
		}else if (sign.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Mercury.\n" + 
					"Particular, logical, practical, sense of duty, critical.");
		}else if (sign.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Venus.\n" + 
					"Balanced, seeks beauty, sense of justice.");
		}else if (sign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Pluto\n" + 
					"Passionate, exacting, loves extremes, combative, reflective.");
		}else if (sign.equalsIgnoreCase("sigittarius")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Jupiter.\n" + 
					"Happy, absent minded, creative, adventurous.");
		}else if (sign.equalsIgnoreCase("capricorn")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Saturn.\n" + 
					"Timeless, driven, calculating, ambitious.");
		}else if (sign.equalsIgnoreCase("aquarius")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Uranus.\n" + 
					"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		}else if (sign.equalsIgnoreCase("pisces")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Neptune.\n" + 
					"Likeable, energetic, passionate, sensitive.");
		}
	}
}
