import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.BorderLayout;

public class TestCheckBox extends JFrame{
	TestCheckBox(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox check1 = new JCheckBox("Linux");
		JCheckBox check2 = new JCheckBox("macos");
		JCheckBox check3 = new JCheckBox("Andoroid");

		JPanel panel = new JPanel();

		panel.add(check1);
		panel.add(check2);
		panel.add(check3);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.CENTER);
	}
public static void main(String[] args){
	TestCheckBox tcb = new TestCheckBox("ALOHA");
	tcb.setVisible(true);
	}
}