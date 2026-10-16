package Module1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

//create database javaproject;
//use javaproject;
//create table livewire(id varchar(25),mailid varchar(40),password varchar(15));
//select * from livewire;

public class LoginPage implements ActionListener{
	static JFrame f;
	static JLabel heading;
	static JLabel studentId;
	static JTextField studentIdData;
	static JLabel studentEmail;
	static JTextField studentEmailData;
	static JLabel studentPassword;
	static JTextField studentPasswordData;
	static JButton submit;
	
	public void loginPage() {
		//get our screen size
				Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
				f = new JFrame("Livewire Login Page");
				
				//for set image
//				f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Public\\eclipse-workspace\\Project\\src\\Module1\\bg.jpg")));
				f.setSize(d.width,d.height);
				
				//for set bg color
				f.getContentPane().setBackground(Color.BLACK);
				f.setLayout(null);
				
				heading = new JLabel("Livewire Student Login");
				heading.setBounds(600, 50, 500, 50);
				heading.setFont(new Font("Calibri",Font.HANGING_BASELINE,40));
				heading.setForeground(Color.WHITE);
				f.add(heading);
				
				studentId = new JLabel("Student Id");
				studentId.setBounds(600, 150, 500, 50);
				studentId.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				studentId.setForeground(Color.WHITE);
				f.add(studentId);
				
				studentIdData = new JTextField();
				studentIdData.setBounds(600, 200, 500, 50);
				studentIdData.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				studentIdData.setForeground(Color.white);
				studentIdData.setBackground(Color.BLACK);
				f.add(studentIdData);
				
				studentEmail = new JLabel("Student Email");
				studentEmail.setBounds(600, 250, 500, 50);
				studentEmail.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				studentEmail.setForeground(Color.WHITE);
				f.add(studentEmail);
				
				studentEmailData = new JTextField();
				studentEmailData.setBounds(600, 300, 500, 50);
				studentEmailData.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				studentEmailData.setForeground(Color.white);
				studentEmailData.setBackground(Color.BLACK);
				f.add(studentEmailData);
				
				studentPassword = new JLabel("Student Password");
				studentPassword.setBounds(600, 350, 500, 50);
				studentPassword.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				studentPassword.setForeground(Color.WHITE);
				f.add(studentPassword);
				
				
//				JPasswordField studentPasswordData = new JPasswordField();
				studentPasswordData = new JTextField();
				studentPasswordData.setBounds(600, 400, 500, 50);
				studentPasswordData.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				studentPasswordData.setForeground(Color.white);
				studentPasswordData.setBackground(Color.BLACK);
				f.add(studentPasswordData);
				
				submit = new JButton("Login Into Livewire");
				submit.setBounds(600, 500, 500, 50);
				submit.setFont(new Font("Calibri",Font.HANGING_BASELINE,20));
				submit.setForeground(Color.white);
				submit.setBackground(Color.BLUE);
				f.add(submit);
				submit.addActionListener(this);
				f.setVisible(true);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = studentIdData.getText();
				String email = studentEmailData.getText();
				String passworddata = studentPasswordData.getText();
				if(e.getSource()==submit) {
					if(id.isEmpty() || email.isEmpty() || passworddata.isEmpty()) {
						JOptionPane.showMessageDialog(submit, "Fill all The Details");
					}
					else {
						JOptionPane.showMessageDialog(submit, "Login Sucessful");
						String url = "jdbc:mysql://localhost:3306/javaproject";
					    String user = "root"; 
					    String password = "1234";
					    try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection(url, user, password);
							String insertQuery = "INSERT INTO livewire(id, mailid, password) VALUES (?, ?, ?)";
				    	    		PreparedStatement pst = con.prepareStatement(insertQuery);
				    	    		pst.setString(1, id);
				    	    		pst.setString(2, email);
				    	    		pst.setString(3, passworddata);
				    	    		pst.executeUpdate();
				    	    		
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						//redirect to next page
//						f.setVisible(false);
//						LoginPage login = new LoginPage();
//						login.StudentPage();
					}
				}
				
			}
			
//			public void StudentPage() {
//				//get our screen size
//						Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//						f = new JFrame("Livewire Student Portal");
//						
//						//for set image
////						f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Public\\eclipse-workspace\\Project\\src\\Module1\\bg.jpg")));
//						f.setSize(d.width,d.height);
//						
//						//for set bg color
//						f.getContentPane().setBackground(Color.BLACK);
//						f.setLayout(null);
//						
//						heading = new JLabel("Livewire Student Portal");
//						heading.setBounds(600, 50, 500, 50);
//						heading.setFont(new Font("Calibri",Font.HANGING_BASELINE,40));
//						heading.setForeground(Color.WHITE);
//						f.add(heading);
//						
//						f.setVisible(true);
//			}
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.loginPage();
	}
}
