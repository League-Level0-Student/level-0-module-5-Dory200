package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("insert a number pls");
		int numb = Integer.parseInt(number);
		for(int i = 2; i <= numb/2; i++) {
			
			if(numb%i == 0) {
				JOptionPane.showMessageDialog(null, "not prime");
				System.exit(0);
			}
			
			
		}
		JOptionPane.showMessageDialog(null, "prime");
	}
}
