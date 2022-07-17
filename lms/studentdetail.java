package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class studentdetail {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetail window = new studentdetail();
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
	public studentdetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblStudentDetails = new JLabel("student details");
		lblStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStudentDetails.setBounds(148, 66, 221, 31);
		frame.getContentPane().add(lblStudentDetails);

		JLabel lblStudentId = new JLabel("student id");
		lblStudentId.setForeground(Color.WHITE);
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentId.setBounds(36, 130, 111, 22);
		frame.getContentPane().add(lblStudentId);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(148, 131, 154, 31);
		frame.getContentPane().add(textArea);

		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(36, 191, 79, 22);
		frame.getContentPane().add(lblName);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(148, 182, 154, 31);
		frame.getContentPane().add(textArea_1);

		JLabel lblFathername = new JLabel("fathername");
		lblFathername.setForeground(Color.WHITE);
		lblFathername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFathername.setBounds(26, 253, 100, 22);
		frame.getContentPane().add(lblFathername);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(148, 241, 154, 31);
		frame.getContentPane().add(textArea_2);

		JLabel lblBranch = new JLabel("branch");
		lblBranch.setForeground(Color.WHITE);
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBranch.setBounds(26, 291, 87, 22);
		frame.getContentPane().add(lblBranch);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(148, 292, 154, 31);
		frame.getContentPane().add(textArea_3);

		JLabel lblIssueDate = new JLabel("issue date");
		lblIssueDate.setForeground(Color.WHITE);
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIssueDate.setBounds(26, 341, 92, 22);
		frame.getContentPane().add(lblIssueDate);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(148, 342, 159, 31);
		frame.getContentPane().add(textArea_4);

		JButton btnIssue = new JButton("ok");
		btnIssue.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnIssue.setBounds(101, 402, 123, 31);
		frame.getContentPane().add(btnIssue);
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnIssue) {
					String dn = textArea.getText();
					String dn1 = textArea_1.getText();
					String dn2 = textArea_2.getText();
					String dn3 = textArea_3.getText();
					String dn4 = textArea_4.getText();

					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into studentde(studentid,name,fathername,branch,issuedate) values(?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

		});

		JButton btnBack = new JButton("cancel");
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnBack.setBounds(264, 402, 123, 31);
		frame.getContentPane().add(btnBack);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(studentdetail.class.getResource("/SS/IMG-20190817-WA0002.jpg")));
		lblNewLabel.setBounds(10, 108, 491, 341);
		frame.getContentPane().add(lblNewLabel);
	}

}
