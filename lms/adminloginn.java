package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class adminloginn {

	private JFrame frame;
	private JTextField textField;

	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminloginn window = new adminloginn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminloginn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 587, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAdminLogin.setForeground(new Color(72, 61, 139));
		lblAdminLogin.setBounds(170, 11, 244, 47);
		frame.getContentPane().add(lblAdminLogin);

		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(new Color(175, 238, 238));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUsername.setBounds(59, 111, 107, 28);
		frame.getContentPane().add(lblUsername);

		textField = new JTextField();
		textField.setBounds(169, 111, 216, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(175, 238, 238));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(59, 170, 99, 28);
		frame.getContentPane().add(lblPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ga) {
				if (ga.getSource() == btnLogin) {
					String dn = textField.getText();
					String da = passwordField.getText();
					if (dn.equals("admin") && da.equals("admin1")) {

						adminsection hp = new adminsection();
						hp.mainNewScreen();
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(frame, "enter correct information");
					}

				}

			}
		});

		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setForeground(new Color(220, 20, 60));
		btnLogin.setBounds(79, 256, 122, 28);
		frame.getContentPane().add(btnLogin);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginpagee.main(new String[] {});
				frame.dispose();

			}
		});
		btnCancel.setBackground(new Color(230, 230, 250));
		btnCancel.setForeground(new Color(220, 20, 60));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancel.setBounds(246, 257, 107, 26);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(adminloginn.class.getResource("/SS/IMG-20190817-WA0009.jpg")));
		lblNewLabel_1.setBounds(0, 11, 512, 331);
		frame.getContentPane().add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(170, 169, 215, 28);
		frame.getContentPane().add(passwordField);

	}
}
