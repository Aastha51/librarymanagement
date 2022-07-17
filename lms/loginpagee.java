package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class loginpagee {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpagee window = new loginpagee();
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
	public loginpagee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 817, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLibraryManagmentSystem = new JLabel("Library Managment System");
		lblLibraryManagmentSystem.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblLibraryManagmentSystem.setForeground(new Color(0, 0, 139));
		lblLibraryManagmentSystem.setBounds(64, 21, 493, 71);
		frame.getContentPane().add(lblLibraryManagmentSystem);

		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminloginn b = new adminloginn();
				b.mainNewScreen();
				frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdminLogin.setBackground(new Color(222, 184, 135));
		btnAdminLogin.setForeground(new Color(128, 0, 0));
		btnAdminLogin.setBounds(141, 195, 213, 38);
		frame.getContentPane().add(btnAdminLogin);

		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libblogin a = new libblogin();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnLibrarianLogin.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnLibrarianLogin.setForeground(new Color(128, 0, 0));
		btnLibrarianLogin.setBackground(new Color(222, 184, 135));
		btnLibrarianLogin.setBounds(141, 263, 213, 44);
		frame.getContentPane().add(btnLibrarianLogin);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(loginpagee.class.getResource("/SS/IMG-20190817-WA0003.jpg")));
		lblNewLabel_1.setBounds(10, 21, 547, 324);
		frame.getContentPane().add(lblNewLabel_1);

	}

}
