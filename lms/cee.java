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

public class cee {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cee window = new cee();
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
	public cee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 584, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCeDepatmentBooks = new JLabel("CE depatment books");
		lblCeDepatmentBooks.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblCeDepatmentBooks.setForeground(Color.ORANGE);
		lblCeDepatmentBooks.setBounds(110, 53, 306, 43);
		frame.getContentPane().add(lblCeDepatmentBooks);

		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addbooce.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddBooks.setForeground(Color.RED);
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setBounds(147, 131, 122, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookcee.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewBooks.setBackground(Color.LIGHT_GRAY);
		btnViewBooks.setForeground(Color.RED);
		btnViewBooks.setBounds(147, 194, 122, 23);
		frame.getContentPane().add(btnViewBooks);

		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depttboo.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(147, 250, 122, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(cee.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(10, 40, 379, 252);
		frame.getContentPane().add(lblNewLabel);
	}

}
