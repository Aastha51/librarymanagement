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

public class archi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					archi window = new archi();
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
	public archi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 654, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblArchitectureDepartmentBooks = new JLabel("architecture department books");
		lblArchitectureDepartmentBooks.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblArchitectureDepartmentBooks.setForeground(Color.ORANGE);
		lblArchitectureDepartmentBooks.setBounds(115, 51, 293, 36);
		frame.getContentPane().add(lblArchitectureDepartmentBooks);

		JButton btnAddBooks = new JButton("add books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addbooarchi.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setForeground(Color.RED);
		btnAddBooks.setBounds(171, 122, 118, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBooks = new JButton("view books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookarchi.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewBooks.setBackground(Color.LIGHT_GRAY);
		btnViewBooks.setForeground(Color.RED);
		btnViewBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnViewBooks.setBounds(174, 175, 112, 23);
		frame.getContentPane().add(btnViewBooks);

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
		btnCancel.setBounds(171, 234, 115, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(archi.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(43, 34, 385, 256);
		frame.getContentPane().add(lblNewLabel);
	}
}
