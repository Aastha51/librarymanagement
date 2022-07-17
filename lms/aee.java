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

public class aee {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aee window = new aee();
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
	public aee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAutomobileDepartment = new JLabel("Automobile department books");
		lblAutomobileDepartment.setForeground(Color.ORANGE);
		lblAutomobileDepartment.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAutomobileDepartment.setBounds(91, 43, 274, 24);
		frame.getContentPane().add(lblAutomobileDepartment);

		JButton btnAddBooks = new JButton("add books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addbooauto.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddBooks.setForeground(Color.RED);
		btnAddBooks.setBounds(123, 98, 120, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBooks = new JButton("view books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookautom.main(new String[] {});
				frame.dispose();

			}
		});
		btnViewBooks.setBackground(Color.LIGHT_GRAY);
		btnViewBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewBooks.setForeground(Color.RED);
		btnViewBooks.setBounds(123, 153, 120, 23);
		frame.getContentPane().add(btnViewBooks);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depttboo.main(new String[] {});
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setForeground(Color.RED);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setBounds(123, 210, 120, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(aee.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(10, 11, 355, 239);
		frame.getContentPane().add(lblNewLabel);
	}

}
