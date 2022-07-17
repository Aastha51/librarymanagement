package lms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class viewmaga {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewmaga window = new viewmaga();
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
	public viewmaga() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 622, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblClickYesTo = new JLabel("Click yes to view details of all magazines:");
		lblClickYesTo.setForeground(new Color(255, 0, 0));
		lblClickYesTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClickYesTo.setBounds(67, 55, 278, 25);
		frame.getContentPane().add(lblClickYesTo);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				java.sql.Connection con = lms.MydbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from addmag");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnYes.setForeground(new Color(255, 0, 0));
		btnYes.setBounds(355, 57, 89, 23);
		frame.getContentPane().add(btnYes);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 111, 574, 160);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "Magazine Id", "Magazine name", "Author", "Price", "Total pages" }));

		JLabel lblSearchName = new JLabel("Search name:");
		lblSearchName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSearchName.setForeground(new Color(255, 0, 0));
		lblSearchName.setBounds(36, 302, 108, 25);
		frame.getContentPane().add(lblSearchName);

		textField = new JTextField();
		textField.setBounds(130, 305, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(165, 42, 42));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(96, 360, 89, 23);
		frame.getContentPane().add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				java.sql.Connection con = lms.MydbConnectionClass.getConnection();

				try {
					String sql = "select * from addmag where magazinename=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});

		JButton btnCancel_1 = new JButton("cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				libbsec p = new libbsec();
				p.mainNewScreen();
				frame.dispose();
			}
		});
		btnCancel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel_1.setForeground(Color.RED);
		btnCancel_1.setBounds(267, 362, 89, 23);
		frame.getContentPane().add(btnCancel_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(viewmaga.class.getResource("/SS/IMG-20190817-WA0013.jpg")));
		lblNewLabel.setBounds(0, 28, 594, 366);
		frame.getContentPane().add(lblNewLabel);
	}
}
