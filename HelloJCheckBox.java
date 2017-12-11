import javax.swing.*;
import java.awt.*;

public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox check1 = new JCheckBox("A");
		JCheckBox check2 = new JCheckBox("B");
		JCheckBox check3 = new JCheckBox("C");

		JPanel panel = new JPanel();

		panel.add(check1);
		panel.add(check2);
		panel.add(check3);


		Container cp = getContentPane();
		cp.add(panel,BorderLayout.CENTER);
	}

public static void main(String[] args) {
	HelloJCheckBox hcb = new HelloJCheckBox("ALOHA");
	hcb.setVisible(true);
   }
}
