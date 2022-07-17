package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class issuebook {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issuebook window = new issuebook();
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
	public issuebook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblIssueBooks = new JLabel("Issue books");
		lblIssueBooks.setForeground(Color.MAGENTA);
		lblIssueBooks.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblIssueBooks.setBounds(199, 46, 167, 31);
		frame.getContentPane().add(lblIssueBooks);

		JLabel lblStudentId = new JLabel("student id :");
		lblStudentId.setForeground(Color.YELLOW);
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentId.setBounds(61, 113, 96, 24);
		frame.getContentPane().add(lblStudentId);

		JLabel lblStudentName = new JLabel("student name :");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentName.setForeground(Color.YELLOW);
		lblStudentName.setBounds(52, 161, 105, 14);
		frame.getContentPane().add(lblStudentName);

		JLabel lblBranch = new JLabel("branch :");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBranch.setForeground(Color.YELLOW);
		lblBranch.setBounds(61, 208, 96, 14);
		frame.getContentPane().add(lblBranch);

		JLabel lblBookNo = new JLabel("book no:");
		lblBookNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookNo.setForeground(Color.YELLOW);
		lblBookNo.setBounds(61, 253, 71, 14);
		frame.getContentPane().add(lblBookNo);

		JLabel lblBookTitle = new JLabel("book title:");
		lblBookTitle.setForeground(Color.YELLOW);
		lblBookTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookTitle.setBounds(61, 299, 80, 14);
		frame.getContentPane().add(lblBookTitle);

		JLabel lblIssueDate = new JLabel("issue date: ");
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIssueDate.setForeground(Color.YELLOW);
		lblIssueDate.setBounds(61, 344, 96, 14);
		frame.getContentPane().add(lblIssueDate);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnOk) {
					String dn = textField.getText();
					String dn1 = textField_1.getText();
					String dn2 = textField_2.getText();
					String dn3 = textField_3.getText();
					String dn4 = textField_4.getText();
					String dn5 = textField_5.getText();

					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into issueboo(studentid,studentname,branch,bookno,booktitle,issuedate) values(?,?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.setString(6, dn5);
						ps.execute();

						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		});

		btnOk.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOk.setForeground(Color.RED);
		btnOk.setBackground(Color.LIGHT_GRAY);
		btnOk.setBounds(114, 389, 89, 23);
		frame.getContentPane().add(btnOk);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				libbsec p90 = new libbsec();
				p90.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setForeground(Color.RED);
		btnCancel.setBounds(243, 390, 89, 23);
		frame.getContentPane().add(btnCancel);

		textField = new JTextField();
		textField.setBounds(167, 117, 116, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(167, 160, 116, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(167, 207, 116, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(167, 252, 116, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(167, 298, 116, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(167, 343, 116, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(issuebook.class.getResource("/SS/IMG-20190817-WA0004.jpg")));
		lblNewLabel.setBounds(40, 46, 437, 377);
		frame.getContentPane().add(lblNewLabel);
	}
}
