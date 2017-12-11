import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JPasswordField;
    import javax.swing.JTextField;
    import javax.swing.JLabel;
    import java.awt.Container;
    import java.awt.BorderLayout;
public class UserReg extends JFrame{
	UserReg(String title){
	setTitle(title);
	setSize(400,400);
	setLocation(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	JLabel maillabel = new JLabel("mail");
	JLabel passlabel = new JLabel("pass");
    JTextField field = new JTextField("",2);
	JPasswordField pwdField = new JPasswordField("aloha");

    JPanel panel = new JPanel();
    panel.add(field,BorderLayout.CENTER);
    panel.add(maillabel,BorderLayout.CENTER);
    panel.add(pwdField,BorderLayout.CENTER);
    panel.add(passlabel,BorderLayout.CENTER);


    Container cp = getContentPane();
	cp.add(panel,BorderLayout.CENTER);
}

	public static void main(String[] args) {
		UserReg ur = new UserReg("ALOHA");
		ur.setVisible(true);
	}
}