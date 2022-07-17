package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mecha {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mecha window = new mecha();
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
	public mecha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblMechanicalDepartmentBooks = new JLabel("mechanical department  books");
		lblMechanicalDepartmentBooks.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblMechanicalDepartmentBooks.setForeground(Color.ORANGE);
		lblMechanicalDepartmentBooks.setBounds(96, 64, 327, 38);
		frame.getContentPane().add(lblMechanicalDepartmentBooks);

		JButton btnAddBooks = new JButton("add books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addboomech.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setForeground(Color.RED);
		btnAddBooks.setBounds(156, 130, 107, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBooks = new JButton("view books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookmecha.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewBooks.setBackground(Color.LIGHT_GRAY);
		btnViewBooks.setForeground(Color.RED);
		btnViewBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewBooks.setBounds(156, 195, 107, 23);
		frame.getContentPane().add(btnViewBooks);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depttboo.main(new String[] {});
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setForeground(Color.RED);
		btnCancel.setBounds(156, 257, 107, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(mecha.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(10, 44, 446, 268);
		frame.getContentPane().add(lblNewLabel);
	}

}
