
package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addlibr {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addlibr window = new addlibr();
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
	public addlibr() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 692, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(186, 43, 46, 14);
		frame.getContentPane().add(label);

		JLabel lblAddLibrarian = new JLabel("Add Librarian");
		lblAddLibrarian.setForeground(Color.RED);
		lblAddLibrarian.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAddLibrarian.setBounds(145, 68, 244, 29);
		frame.getContentPane().add(lblAddLibrarian);

		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(48, 145, 67, 14);
		frame.getContentPane().add(lblName);

		textField = new JTextField();
		textField.setBounds(116, 140, 166, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(48, 199, 56, 14);
		frame.getContentPane().add(lblEmail);

		textField_1 = new JTextField();
		textField_1.setBounds(116, 198, 166, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblCity = new JLabel("city");
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCity.setBounds(48, 257, 93, 19);
		frame.getContentPane().add(lblCity);

		textField_3 = new JTextField();
		textField_3.setBounds(116, 310, 169, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblAge = new JLabel("age");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAge.setBounds(48, 308, 46, 29);
		frame.getContentPane().add(lblAge);

		textField_2 = new JTextField();
		textField_2.setBounds(116, 254, 169, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblMobileno = new JLabel("mobileno");
		lblMobileno.setForeground(Color.WHITE);
		lblMobileno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMobileno.setBounds(37, 348, 104, 31);
		frame.getContentPane().add(lblMobileno);

		textField_4 = new JTextField();
		textField_4.setBounds(116, 348, 166, 31);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblGender = new JLabel("gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(48, 411, 93, 25);
		frame.getContentPane().add(lblGender);

		textField_5 = new JTextField();
		textField_5.setBounds(116, 390, 163, 35);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JButton btnCancel_1 = new JButton("cancel");
		btnCancel_1.setBackground(Color.LIGHT_GRAY);
		btnCancel_1.setForeground(Color.RED);
		btnCancel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel_1.setBounds(270, 444, 89, 23);
		frame.getContentPane().add(btnCancel_1);
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				adminsection m = new adminsection();
				m.mainNewScreen();
				frame.dispose();
			}
		});
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setBackground(new Color(240, 128, 128));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setBounds(136, 440, 96, 29);
		frame.getContentPane().add(btnSubmit);
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(addlibr.class.getResource("/SS/IMG-20190817-WA0011.jpg")));
		lblNewLabel_1.setBounds(10, 11, 517, 488);
		frame.getContentPane().add(lblNewLabel_1);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnSubmit) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();
					String dn5 = textField_5.getText();
					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into addlib(name,email,city,age,mobileno,gender) values(?,?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.setString(6, dn5);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
						frame.dispose();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		});

	}
}