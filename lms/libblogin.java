package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class libblogin {

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
					libblogin window = new libblogin();
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
	public libblogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLibrarianLogin = new JLabel("Librarian Login");
		lblLibrarianLogin.setForeground(Color.RED);
		lblLibrarianLogin.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblLibrarianLogin.setBounds(290, 34, 251, 39);
		frame.getContentPane().add(lblLibrarianLogin);

		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(264, 84, 67, 21);
		frame.getContentPane().add(lblName);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(250, 235, 215));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(235, 158, 111, 14);
		frame.getContentPane().add(lblPassword);

		textField = new JTextField();
		textField.setBounds(375, 83, 207, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnLogin) {
					String dn = textField.getText();
					String da = passwordField.getText();
					if (dn.equals("librarian") && da.equals("librarian1")) {

						libbsec ba9 = new libbsec();
						ba9.mainNewScreen();
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(frame, "enter correct information");
					}
					java.sql.Connection con;
					try {
						con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con
								.prepareStatement("insert into adminlogin(username,password) values (?,?)");
						ps.setString(1, dn);
						ps.setString(2, da);
						ps.executeUpdate();
						System.out.println("inserted sucessfully");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});

		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setForeground(new Color(255, 0, 0));
		btnLogin.setBounds(277, 241, 120, 28);
		frame.getContentPane().add(btnLogin);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginpagee.main(new String[] {});
				frame.dispose();

			}
		});
		btnCancel.setBackground(new Color(230, 230, 250));
		btnCancel.setForeground(new Color(255, 0, 0));
		btnCancel.setBounds(422, 241, 105, 28);
		frame.getContentPane().add(btnCancel);

		passwordField = new JPasswordField();
		passwordField.setBounds(375, 150, 207, 28);
		frame.getContentPane().add(passwordField);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(libblogin.class.getResource("/SS/IMG-20190817-WA0009.jpg")));
		lblNewLabel.setBounds(26, 11, 666, 337);
		frame.getContentPane().add(lblNewLabel);
	}

}
