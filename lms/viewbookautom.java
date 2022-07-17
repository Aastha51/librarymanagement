package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class viewbookautom {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewbookautom window = new viewbookautom();
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
	public viewbookautom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblClickYesTo = new JLabel("click yes to view all book details:");
		lblClickYesTo.setForeground(Color.WHITE);
		lblClickYesTo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblClickYesTo.setBounds(102, 45, 217, 24);
		frame.getContentPane().add(lblClickYesTo);

		JButton btnYes = new JButton("yes");
		btnYes.setBackground(Color.LIGHT_GRAY);
		btnYes.setForeground(Color.RED);
		btnYes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnYes.setBounds(329, 47, 89, 23);
		frame.getContentPane().add(btnYes);
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ba) {
				java.sql.Connection con = lms.MydbConnectionClass.getConnection();
				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from addbookauto");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnYes, "null", "not", 0);
				}
			}
		});
		JTextField textField = new JTextField();
		textField.setBounds(175, 313, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 118, 574, 160);
		frame.getContentPane().add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "name", "Id", "publisher", "price", "totalpages" }));

		JSpinner spinner = new JSpinner();
		spinner.setBounds(65, 117, 567, 160);
		frame.getContentPane().add(spinner);

		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent d) {
				try {
					java.sql.Connection con = lms.MydbConnectionClass.getConnection();
					String sql = "select * from addbookauto where name=? ";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});
		btnSearch.setBackground(Color.LIGHT_GRAY);
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSearch.setForeground(Color.RED);
		btnSearch.setBounds(120, 346, 89, 23);
		frame.getContentPane().add(btnSearch);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aee.main(new String[] {});
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setForeground(Color.RED);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setBounds(260, 346, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblEnterName_1 = new JLabel("Enter name:");
		lblEnterName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterName_1.setBounds(65, 316, 108, 14);
		frame.getContentPane().add(lblEnterName_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(viewbookautom.class.getResource("/SS/IMG-20190817-WA0006.jpg")));
		lblNewLabel.setBounds(30, 33, 602, 347);
		frame.getContentPane().add(lblNewLabel);
	}
}
