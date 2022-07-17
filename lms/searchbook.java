package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class searchbook {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchbook window = new searchbook();
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
	public searchbook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblEnterBookName = new JLabel("enter book name");
		lblEnterBookName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterBookName.setBounds(10, 269, 146, 33);
		frame.getContentPane().add(lblEnterBookName);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(167, 275, 164, 27);
		frame.getContentPane().add(textArea);

		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.sql.Connection con = lms.MydbConnectionClass.getConnection();
				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from issueboo where name=?");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {

				}
			}
		});
		btnSearch.setForeground(new Color(0, 0, 0));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(65, 313, 116, 33);
		frame.getContentPane().add(btnSearch);

		JLabel lblClickYesTo = new JLabel("Click yes to view details of all book details:");
		lblClickYesTo.setForeground(new Color(255, 0, 0));
		lblClickYesTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClickYesTo.setBounds(49, 49, 282, 14);
		frame.getContentPane().add(lblClickYesTo);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				java.sql.Connection con = lms.MydbConnectionClass.getConnection();
				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from issueboo");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {

				}
			}
		});

		btnYes.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnYes.setBounds(335, 46, 89, 23);
		frame.getContentPane().add(btnYes);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				libbsec p90 = new libbsec();
				p90.mainNewScreen();
				frame.dispose();

			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBounds(220, 313, 89, 33);
		frame.getContentPane().add(btnCancel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 97, 510, 167);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "Book id", "name", "Publisher", "Price", "Total pages" }) {
			boolean[] columnEditables = new boolean[] { false, false, true, false, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(searchbook.class.getResource("/SS/IMG-20190817-WA0007.jpg")));
		lblNewLabel.setBounds(0, 23, 545, 323);
		frame.getContentPane().add(lblNewLabel);
	}
}
