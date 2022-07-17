package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminsection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminsection window = new adminsection();
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
	public adminsection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 847, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setForeground(Color.ORANGE);
		lblAdminSection.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAdminSection.setBounds(117, 99, 302, 37);
		frame.getContentPane().add(lblAdminSection);

		JButton btnAddLibrarian = new JButton("Add Librarian");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addlibr a = new addlibr();
				a.mainNewScreen();
				frame.dispose();
			}
		});
		btnAddLibrarian.setBackground(new Color(255, 250, 205));
		btnAddLibrarian.setForeground(new Color(244, 164, 96));
		btnAddLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddLibrarian.setBounds(141, 174, 198, 42);
		frame.getContentPane().add(btnAddLibrarian);

		JButton btnViewLibrarian = new JButton("View Librarian");

		btnViewLibrarian.setBackground(new Color(255, 250, 205));
		btnViewLibrarian.setForeground(new Color(244, 164, 96));
		btnViewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnViewLibrarian.setBounds(141, 245, 198, 42);
		frame.getContentPane().add(btnViewLibrarian);
		btnViewLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewlibb.main(new String[] {});
				frame.dispose();

			}
		});

		JButton btnDeleteLibrarian = new JButton("Delete Librarian");
		btnDeleteLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				deletelibb g = new deletelibb();
				g.mainNewScreen();
				frame.dispose();
			}
		});
		btnDeleteLibrarian.setBackground(new Color(255, 250, 205));
		btnDeleteLibrarian.setForeground(new Color(244, 164, 96));
		btnDeleteLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDeleteLibrarian.setBounds(141, 319, 198, 42);
		frame.getContentPane().add(btnDeleteLibrarian);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminloginn cc = new adminloginn();
				cc.mainNewScreen();
				frame.dispose();
			}
		});
		btnLogout.setBackground(new Color(255, 250, 205));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogout.setForeground(new Color(244, 164, 96));
		btnLogout.setBounds(141, 389, 198, 42);
		frame.getContentPane().add(btnLogout);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(adminsection.class.getResource("/SS/IMG-20190817-WA0006.jpg")));
		lblNewLabel.setBounds(24, 67, 421, 376);
		frame.getContentPane().add(lblNewLabel);
	}
}
