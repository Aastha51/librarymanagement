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

public class eee {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eee window = new eee();
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
	public eee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 612, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblElectricalDepatmentBooks = new JLabel("electrical depatment books");
		lblElectricalDepatmentBooks.setForeground(Color.ORANGE);
		lblElectricalDepatmentBooks.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblElectricalDepatmentBooks.setBounds(101, 65, 258, 25);
		frame.getContentPane().add(lblElectricalDepatmentBooks);

		JButton btnAddBooks = new JButton("add books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addbooelec.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setForeground(Color.RED);
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddBooks.setBounds(156, 124, 153, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBook = new JButton("view book");
		btnViewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookelect.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewBook.setBackground(Color.LIGHT_GRAY);
		btnViewBook.setForeground(Color.RED);
		btnViewBook.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewBook.setBounds(156, 180, 153, 23);
		frame.getContentPane().add(btnViewBook);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depttboo.main(new String[] {});
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setForeground(Color.RED);
		btnCancel.setBounds(159, 242, 150, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(eee.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(60, 44, 367, 267);
		frame.getContentPane().add(lblNewLabel);
	}

}
