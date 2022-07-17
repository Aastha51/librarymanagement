package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class returnbook {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnbook window = new returnbook();
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
	public returnbook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setForeground(Color.RED);
		lblReturnBook.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblReturnBook.setBounds(110, 38, 225, 32);
		frame.getContentPane().add(lblReturnBook);

		JLabel lblBookNo = new JLabel("book no");
		lblBookNo.setForeground(Color.ORANGE);
		lblBookNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookNo.setBounds(23, 85, 94, 24);
		frame.getContentPane().add(lblBookNo);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(145, 87, 149, 32);
		frame.getContentPane().add(textArea);

		JLabel lblBookTitle = new JLabel("book title");
		lblBookTitle.setForeground(Color.ORANGE);
		lblBookTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookTitle.setBounds(23, 151, 99, 24);
		frame.getContentPane().add(lblBookTitle);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(152, 143, 142, 32);
		frame.getContentPane().add(textArea_1);

		JLabel lblStudentId = new JLabel("student id");
		lblStudentId.setForeground(Color.ORANGE);
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentId.setBounds(23, 209, 94, 24);
		frame.getContentPane().add(lblStudentId);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(158, 196, 147, 32);
		frame.getContentPane().add(textArea_2);

		JLabel lblIssueDate = new JLabel("issue date");
		lblIssueDate.setForeground(Color.ORANGE);
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIssueDate.setBounds(23, 258, 105, 24);
		frame.getContentPane().add(lblIssueDate);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(157, 250, 148, 32);
		frame.getContentPane().add(textArea_3);

		JLabel lblReturnDate = new JLabel("Return Date");
		lblReturnDate.setForeground(Color.ORANGE);
		lblReturnDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReturnDate.setBounds(23, 315, 99, 24);
		frame.getContentPane().add(lblReturnDate);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(158, 317, 147, 32);
		frame.getContentPane().add(textArea_4);

		JLabel lblFineifAny = new JLabel("fine(if any)");
		lblFineifAny.setForeground(Color.ORANGE);
		lblFineifAny.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFineifAny.setBounds(23, 372, 170, 24);
		frame.getContentPane().add(lblFineifAny);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(158, 360, 147, 36);
		frame.getContentPane().add(textArea_5);

		JButton btnViewAllData = new JButton("save");
		btnViewAllData.setForeground(Color.RED);
		btnViewAllData.setBackground(Color.GRAY);
		btnViewAllData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnViewAllData.setBounds(101, 407, 149, 38);
		frame.getContentPane().add(btnViewAllData);
		btnViewAllData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnViewAllData) {
					String dn = textArea.getText();
					String dn1 = textArea_1.getText();
					String dn2 = textArea_2.getText();
					String dn3 = textArea_3.getText();
					String dn4 = textArea_4.getText();
					String dn5 = textArea_5.getText();

					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into returnboo(bookno,booktitle,studentid,issuedate,returndate,fine) values(?,?,?,?,?,?)");
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

		JButton btnSave = new JButton("cancel");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libbsec p90 = new libbsec();
				p90.mainNewScreen();
				frame.dispose();

			}
		});
		btnSave.setBackground(Color.GRAY);
		btnSave.setForeground(Color.RED);
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnSave.setBounds(281, 407, 129, 38);
		frame.getContentPane().add(btnSave);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(returnbook.class.getResource("/SS/IMG-20190817-WA0016.jpg")));
		lblNewLabel.setBounds(10, 38, 443, 407);
		frame.getContentPane().add(lblNewLabel);
	}
}
