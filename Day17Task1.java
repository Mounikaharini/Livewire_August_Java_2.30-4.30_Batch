//java swing components

package Module1;

import java.awt.*;
import javax.swing.*;

public class SwingComponents {
	static JFrame frame;
	static JLabel rname;
	static JTextField rnamedata;
	static JLabel rpassword;
	static JPasswordField rpassworddata;
	static JLabel rlocation;
	static JComboBox rlocationdata;
	static JRadioButton male;
	static JRadioButton female;
	static ButtonGroup gender;
	static JButton submit;
	public static void main(String[] args) {
Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		//frame create
		
        frame = new JFrame("Class Login");
        frame.setSize(d.width, d.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        //background set with sizing the image
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\Public\\eclipse-workspace\\Project\\src\\Module1\\bg.jpg");
        Image img = bgIcon.getImage().getScaledInstance(d.width, d.height, Image.SCALE_SMOOTH);
        JLabel bg = new JLabel(new ImageIcon(img));
        bg.setBounds(0, 0, d.width, d.height);
        frame.add(bg);
        bg.setLayout(null);
        
        JLabel titleregister = new  JLabel("Welcome to Register");
        titleregister.setBounds(500,50,450,50);
        titleregister.setFont(new Font("Calibri", Font.BOLD, 50));
        titleregister.setForeground(Color.WHITE);
        bg.add(titleregister);
        
        rname = new JLabel("Username");
        rname.setBounds(550,150,250,50);
        rname.setFont(new Font("Calibri", Font.HANGING_BASELINE, 20));
        rname.setForeground(Color.WHITE);
        bg.add(rname);
        
        rnamedata = new JTextField();
        rnamedata.setBounds(550,200,250,40);
        rnamedata.setFont(new Font("Calibri", Font.HANGING_BASELINE, 25));
        rnamedata.setForeground(Color.black);
        bg.add(rnamedata);
        
        rpassword = new JLabel("Password");
        rpassword.setBounds(550,250,250,50);
        rpassword.setFont(new Font("Calibri", Font.HANGING_BASELINE, 20));
        rpassword.setForeground(Color.WHITE);
        bg.add(rpassword);
        
        rpassworddata = new JPasswordField();
        rpassworddata.setBounds(550,300,250,40);
        rpassworddata.setFont(new Font("Calibri", Font.HANGING_BASELINE, 25));
        rpassworddata.setForeground(Color.black);
        bg.add(rpassworddata);
        
        rlocation = new JLabel("Location");
        rlocation.setBounds(550,350,250,50);
        rlocation.setFont(new Font("Calibri", Font.HANGING_BASELINE, 20));
        rlocation.setForeground(Color.WHITE);
        bg.add(rlocation);
        
        String districts[]= {"Salem","Chennai","Kallakurichi","Namakkal","Trichy"};
        rlocationdata = new JComboBox(districts);
        rlocationdata.setFont(new Font("Calibri", Font.HANGING_BASELINE, 15));
        rlocationdata.setBounds(550, 400, 250, 40);
        bg.add(rlocationdata);
        
        male = new JRadioButton("Male");
        male.setFont(new Font("Calibri", Font.HANGING_BASELINE, 15));
        male.setSelected(true);
        male.setBounds(550, 500, 80, 40);
        bg.add(male);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Calibri", Font.HANGING_BASELINE, 15));
        female.setSelected(false);
        female.setBounds(670, 500, 80, 40);
        bg.add(female);
        
        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        submit = new JButton("Submit");
        submit.setBounds(800, 600, 130, 40);
        submit.setForeground(Color.black);
        submit.setBackground(Color.decode("#FFDAB9"));
        submit.setFont(new Font("sans serif",Font.ITALIC,25));
		bg.add(submit);
//		submit.addActionListener(this);
        
        frame.setVisible(true);

	}

}
