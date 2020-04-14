package _03_input_dialog._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hello "+input);
}
}
