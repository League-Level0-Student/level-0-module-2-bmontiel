import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int userHeight = Integer.parseInt(height);
		if (userHeight > 48) {
			JOptionPane.showMessageDialog(null, "You can come on the ride!");
		} else {
			JOptionPane.showMessageDialog(null, "You need to grom more!");
		}
	}
}
