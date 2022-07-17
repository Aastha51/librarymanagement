package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class viewbookcivill {

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
					viewbookcivill window = new viewbookcivill();
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
	public viewbookcivill() {
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
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.sql.Connection con = lms.MydbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from addboocivil");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnYes.setBackground(Color.LIGHT_GRAY);
		btnYes.setForeground(Color.RED);
		btnYes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnYes.setBounds(329, 47, 89, 23);
		frame.getContentPane().add(btnYes);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 109, 574, 160);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "name", "Id", "publisher", "price", "totalpages" }));

		JSpinner spinner = new JSpinner();
		spinner.setBounds(58, 109, 574, 160);
		frame.getContentPane().add(spinner);

		JButton btnSearch = new JButton("search");
		btnSearch.setBackground(Color.LIGHT_GRAY);
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSearch.setForeground(Color.RED);
		btnSearch.setBounds(120, 346, 89, 23);
		frame.getContentPane().add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					java.sql.Connection con = lms.MydbConnectionClass.getConnection();
					String sql = "select * from addboocivil where name=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});
		JLabel lblEnterName = new JLabel("enter name :");
		lblEnterName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterName.setBounds(85, 313, 102, 14);
		frame.getContentPane().add(lblEnterName);

		textField = new JTextField();
		textField.setBounds(175, 313, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				civill.main(new String[] {});
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setForeground(Color.RED);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel.setBounds(256, 346, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(viewbookcivill.class.getResource("/SS/IMG-20190817-WA0006.jpg")));
		lblNewLabel.setBounds(30, 33, 602, 347);
		frame.getContentPane().add(lblNewLabel);
	}
}
