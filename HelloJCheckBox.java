import javax.swing.*;
import java.awt.*;

public class HelloJCheckBox extends JFrame implements ActionListener {
	JCheckBox[] check;
	JLabel[] lbl;
	public void actionPerformed(ActionEvent e) {
		System.out.println("CLICK");
		this.label.setText("aaaaa");
		if (this.check1.isSelected()) {
			this.label.setText("check1は選択されています");
		}
	}
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Click");
		btn.addActionLIstener(this);
	}
}
		panel.setLayout(new GridLayout,(4,1));

		this label = new JLabel("This is a JLabel");
		panel.setLayout(new GridLayout(5,1));

		JCheckBox check1 = new JCheckBox("A");
		JCheckBox check2 = new JCheckBox("B");
		JCheckBox check3 = new JCheckBox("C");

		JPanel panel = new JPanel();

		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(btn);
		panel.add(label);


		Container cp = getContentPane();
		cp.add(panel,BorderLayout.CENTER);
	}

public static void main(String[] args) {
	HelloJCheckBox hcb = new HelloJCheckBox("ALOHA");
	hcb.setVisible(true);
   }
}
