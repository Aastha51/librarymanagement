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

public class civill {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					civill window = new civill();
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
	public civill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCivilDepartmentBooks = new JLabel("civil department books");
		lblCivilDepartmentBooks.setForeground(Color.ORANGE);
		lblCivilDepartmentBooks.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblCivilDepartmentBooks.setBounds(88, 56, 361, 31);
		frame.getContentPane().add(lblCivilDepartmentBooks);

		JButton btnAddBooks = new JButton("add books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addboocivil.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddBooks.setForeground(Color.RED);
		btnAddBooks.setBounds(132, 127, 126, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBook = new JButton("view book");
		btnViewBook.setBackground(Color.LIGHT_GRAY);
		btnViewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookcivill.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewBook.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewBook.setForeground(Color.RED);
		btnViewBook.setBounds(132, 179, 126, 23);
		frame.getContentPane().add(btnViewBook);

		JButton btnCa = new JButton("Cancel");
		btnCa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depttboo.main(new String[] {});
				frame.dispose();
			}
		});
		btnCa.setBackground(Color.LIGHT_GRAY);
		btnCa.setForeground(Color.RED);
		btnCa.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCa.setBounds(137, 235, 121, 23);
		frame.getContentPane().add(btnCa);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(civill.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(26, 25, 395, 262);
		frame.getContentPane().add(lblNewLabel);
	}

}
