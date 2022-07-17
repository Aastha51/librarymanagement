package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class libbsec {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mainNewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libbsec window = new libbsec();
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
	public libbsec() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 706, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setForeground(new Color(165, 42, 42));
		lblLibrarianSection.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblLibrarianSection.setBounds(260, 40, 310, 39);
		frame.getContentPane().add(lblLibrarianSection);

		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bookdetail p = new bookdetail();
				p.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setBackground(Color.LIGHT_GRAY);
		btnAddBooks.setForeground(new Color(72, 61, 139));
		btnAddBooks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddBooks.setBounds(123, 119, 210, 23);
		frame.getContentPane().add(btnAddBooks);

		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewbookk p1 = new viewbookk();
				p1.main(new String[] {});
				frame.dispose();

			}
		});
		btnViewBooks.setBackground(Color.LIGHT_GRAY);
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnViewBooks.setForeground(new Color(72, 61, 139));
		btnViewBooks.setBounds(123, 163, 210, 23);
		frame.getContentPane().add(btnViewBooks);

		JButton btnIssueBooks = new JButton("Issue Books");
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				issuebook p2 = new issuebook();
				p2.main(new String[] {});
				frame.dispose();

			}
		});
		btnIssueBooks.setBackground(Color.LIGHT_GRAY);
		btnIssueBooks.setForeground(new Color(72, 61, 139));
		btnIssueBooks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnIssueBooks.setBounds(123, 210, 210, 23);
		frame.getContentPane().add(btnIssueBooks);

		JButton btnReturnBooks = new JButton("Return Books");
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				returnbook p3 = new returnbook();
				p3.main(new String[] {});
				frame.dispose();

			}
		});
		btnReturnBooks.setBackground(Color.LIGHT_GRAY);
		btnReturnBooks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReturnBooks.setForeground(new Color(72, 61, 139));
		btnReturnBooks.setBounds(123, 256, 210, 23);
		frame.getContentPane().add(btnReturnBooks);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				adminloginn ci = new adminloginn();
				ci.mainNewScreen();
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setForeground(new Color(72, 61, 139));
		btnLogout.setBounds(123, 434, 210, 23);
		frame.getContentPane().add(btnLogout);

		JButton btnBooksDetails = new JButton("Books details");
		btnBooksDetails.setBackground(Color.LIGHT_GRAY);
		btnBooksDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				depttboo p7 = new depttboo();
				p7.main(new String[] {});
				frame.dispose();

			}
		});
		btnBooksDetails.setForeground(new Color(0, 0, 128));
		btnBooksDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBooksDetails.setBounds(123, 395, 210, 23);
		frame.getContentPane().add(btnBooksDetails);

		JButton btnAddMagazine = new JButton("Add magazine");
		btnAddMagazine.setBackground(Color.LIGHT_GRAY);
		btnAddMagazine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addmagz p4 = new addmagz();
				p4.main(new String[] {});
				frame.dispose();

			}
		});
		btnAddMagazine.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddMagazine.setForeground(new Color(0, 0, 139));
		btnAddMagazine.setBounds(123, 303, 210, 23);
		frame.getContentPane().add(btnAddMagazine);

		JButton btnViewMagazineDetails = new JButton("View magazine details");
		btnViewMagazineDetails.setBackground(Color.LIGHT_GRAY);
		btnViewMagazineDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewmaga p5 = new viewmaga();
				p5.main(new String[] {});
				frame.dispose();

			}
		});
		btnViewMagazineDetails.setForeground(new Color(0, 0, 128));
		btnViewMagazineDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnViewMagazineDetails.setBounds(123, 349, 210, 23);
		frame.getContentPane().add(btnViewMagazineDetails);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(libbsec.class.getResource("/SS/IMG-20190817-WA0005.jpg")));
		lblNewLabel.setBounds(123, 80, 494, 391);
		frame.getContentPane().add(lblNewLabel);
	}

}
