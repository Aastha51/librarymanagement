package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addbooarchi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addbooarchi window = new addbooarchi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public addbooarchi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 655, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblAddBooks = new JLabel("add books");
		lblAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblAddBooks.setForeground(Color.RED);
		lblAddBooks.setBounds(212, 58, 151, 42);
		frame.getContentPane().add(lblAddBooks);

		JLabel lblName = new JLabel("name:");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setBounds(114, 125, 46, 14);
		frame.getContentPane().add(lblName);

		JLabel lblId = new JLabel("id :");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblId.setBounds(114, 172, 46, 14);
		frame.getContentPane().add(lblId);

		JLabel lblPublisher = new JLabel("publisher:");
		lblPublisher.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPublisher.setBounds(114, 225, 85, 22);
		frame.getContentPane().add(lblPublisher);

		JLabel lblPrice = new JLabel("price :");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPrice.setBounds(114, 280, 46, 14);
		frame.getContentPane().add(lblPrice);

		JLabel lblTotalpages = new JLabel("totalpages:");
		lblTotalpages.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotalpages.setBounds(114, 319, 85, 22);
		frame.getContentPane().add(lblTotalpages);

		JButton btnAdd = new JButton("add");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setForeground(Color.RED);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAdd.setBounds(150, 394, 89, 23);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnAdd) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();
					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addbooarchi(name,id,publisher,price,totalpages) values(?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
						frame.dispose();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		});
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				archi.main(new String[] {});
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setForeground(Color.RED);
		btnCancel.setBounds(274, 395, 89, 23);
		frame.getContentPane().add(btnCancel);

		textField = new JTextField();
		textField.setBounds(209, 123, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(212, 170, 120, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(212, 227, 120, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(212, 278, 120, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(212, 321, 120, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(addbooarchi.class.getResource("/SS/IMG-20190817-WA0017.jpg")));
		lblNewLabel.setBounds(25, 58, 388, 396);
		frame.getContentPane().add(lblNewLabel);
	}
}
