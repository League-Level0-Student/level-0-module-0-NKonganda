package _03_input_dialog._3_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "Hello "+input+", I know you swam last summer");
}	
}
