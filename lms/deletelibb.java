package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class deletelibb {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletelibb window = new deletelibb();
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
	public deletelibb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblDeleteLibrarian = new JLabel("Delete librarian");
		lblDeleteLibrarian.setForeground(Color.RED);
		lblDeleteLibrarian.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblDeleteLibrarian.setBounds(105, 45, 229, 38);
		frame.getContentPane().add(lblDeleteLibrarian);

		JLabel lblEnterLibrarianName = new JLabel("enter librarian name");
		lblEnterLibrarianName.setForeground(new Color(0, 255, 255));
		lblEnterLibrarianName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterLibrarianName.setBounds(35, 114, 176, 32);
		frame.getContentPane().add(lblEnterLibrarianName);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(208, 120, 176, 26);
		frame.getContentPane().add(textArea);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(53, 194, 118, 32);
		frame.getContentPane().add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnDelete) {
					String dn = textArea.getText();

					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement("Delete from addlib where name=?");
						ps.setString(1, dn);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "deleted successfully");
					} catch (SQLException e) {

						e.printStackTrace();
					}

				}

			}

		});
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				adminsection k = new adminsection();
				k.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setForeground(Color.RED);
		btnCancel.setBounds(239, 194, 89, 32);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(deletelibb.class.getResource("/SS/IMG-20190817-WA0006.jpg")));
		lblNewLabel.setBounds(10, 33, 423, 271);
		frame.getContentPane().add(lblNewLabel);
	}
}
