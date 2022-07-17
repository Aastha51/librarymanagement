package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class bookdetail {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookdetail window = new bookdetail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bookdetail() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblBookDetail = new JLabel("Book detail");
		lblBookDetail.setForeground(new Color(0, 0, 255));
		lblBookDetail.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblBookDetail.setBounds(122, 28, 228, 44);
		frame.getContentPane().add(lblBookDetail);

		JLabel lblBookId = new JLabel("book id");
		lblBookId.setForeground(new Color(255, 192, 203));
		lblBookId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblBookId.setBounds(77, 100, 73, 17);
		frame.getContentPane().add(lblBookId);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(189, 98, 131, 28);
		frame.getContentPane().add(textArea);

		JLabel lblName = new JLabel("name");
		lblName.setForeground(new Color(255, 192, 203));
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(77, 146, 90, 28);
		frame.getContentPane().add(lblName);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(189, 150, 131, 28);
		frame.getContentPane().add(textArea_1);

		JLabel lblPublisher = new JLabel("publisher");
		lblPublisher.setForeground(new Color(255, 192, 203));
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPublisher.setBounds(75, 199, 81, 28);
		frame.getContentPane().add(lblPublisher);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(189, 203, 131, 28);
		frame.getContentPane().add(textArea_2);

		JLabel lblPrice = new JLabel("price");
		lblPrice.setForeground(new Color(255, 192, 203));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPrice.setBounds(86, 264, 81, 28);
		frame.getContentPane().add(lblPrice);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(189, 268, 131, 28);
		frame.getContentPane().add(textArea_3);

		JLabel lblPage = new JLabel("Total pages");
		lblPage.setForeground(new Color(255, 192, 203));
		lblPage.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPage.setBounds(77, 303, 89, 62);
		frame.getContentPane().add(lblPage);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(189, 328, 131, 28);
		frame.getContentPane().add(textArea_4);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libbsec p9 = new libbsec();
				p9.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.setBounds(211, 373, 89, 30);
		frame.getContentPane().add(btnCancel);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAdd) {
					String dn = textArea.getText();
					String dn1 = textArea_1.getText();
					String dn2 = textArea_2.getText();
					String dn3 = textArea_3.getText();
					String dn4 = textArea_4.getText();

					try {
						java.sql.Connection con = lms.MydbConnectionClass.getConnection();
						java.sql.PreparedStatement ps = con.prepareStatement(
								"insert into bookde(bookid,name,publisher,price,totalpages) values(?,?,?,?,?)");
						ps.setString(1, dn);
						ps.setString(2, dn1);
						ps.setString(3, dn2);
						ps.setString(4, dn3);
						ps.setString(5, dn4);
						ps.execute();
						JOptionPane.showMessageDialog(frame, "you are succesful");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}
			}
		});

		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setBounds(77, 378, 89, 23);
		frame.getContentPane().add(btnAdd);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(bookdetail.class.getResource("/SS/IMG-20190817-WA0017.jpg")));
		lblNewLabel.setBounds(26, 15, 392, 400);
		frame.getContentPane().add(lblNewLabel);
	}
}
