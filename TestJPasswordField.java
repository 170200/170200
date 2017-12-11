import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JPanel
import java.awt.BorderLayout;
import java.awt.Container;


public class TestPasswordField extends JFrame{
	TestPasswordFiled(String title) {
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JPanel panel = new JPanel();
   		panel.add(field);
		Container cp = getContentPane();
		cp.add(field,BorderLayout.SOUTH);
	}
public static void main(String[] args) {
		TestPasswordField hello = new TestPasswordField("ALOHA");
		hello.setVisible(true);
	
	}
}