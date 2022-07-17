package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class addmagz {

	private JFrame frame;
	private JLabel lblAddMagazineDetails;
	private JLabel lblName;
	private JLabel lblId;
	private JLabel label;
	private JLabel lblAuthor;
	private JLabel lblTotalPages;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnAdd;
	private JButton btnCancel;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmagz window = new addmagz();
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
	public addmagz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblAddMagazineDetails = new JLabel("Add Magazine Details");
		lblAddMagazineDetails.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblAddMagazineDetails.setForeground(Color.RED);
		lblAddMagazineDetails.setBounds(146, 86, 262, 27);
		frame.getContentPane().add(lblAddMagazineDetails);

		lblName = new JLabel("Magazine Id");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setBounds(84, 173, 121, 27);
		frame.getContentPane().add(lblName);

		lblId = new JLabel("Magazine name");
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblId.setBounds(84, 124, 104, 27);
		frame.getContentPane().add(lblId);

		label = new JLabel("Price");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(99, 266, 46, 14);
		frame.getContentPane().add(label);

		lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAuthor.setForeground(Color.BLACK);
		lblAuthor.setBounds(99, 219, 46, 14);
		frame.getContentPane().add(lblAuthor);

		lblTotalPages = new JLabel("Total pages");
		lblTotalPages.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTotalPages.setForeground(Color.BLACK);
		lblTotalPages.setBounds(99, 308, 73, 14);
		frame.getContentPane().add(lblTotalPages);

		textField = new JTextField();
		textField.setBounds(211, 128, 160, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(213, 177, 158, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(211, 217, 160, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(211, 264, 160, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(211, 306, 160, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setForeground(Color.RED);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAdd.setBounds(120, 373, 89, 23);
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
								"insert into addmag(magazinename,magazineid,author,price,totalpages) values(?,?,?,?,?)");
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
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libbsec p = new libbsec();
				p.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setForeground(Color.RED);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setBounds(245, 374, 89, 23);
		frame.getContentPane().add(btnCancel);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(addmagz.class.getResource("/SS/IMG-20190817-WA0008.jpg")));
		lblNewLabel.setBounds(55, -169, 423, 593);
		frame.getContentPane().add(lblNewLabel);
	}
}
