package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class depttboo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					depttboo window = new depttboo();
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
	public depttboo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblBookDetailsdepatment = new JLabel("Book details (depatment wise)");
		lblBookDetailsdepatment.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBookDetailsdepatment.setForeground(Color.WHITE);
		lblBookDetailsdepatment.setBounds(123, 69, 422, 31);
		frame.getContentPane().add(lblBookDetailsdepatment);

		JButton btnComputerDept = new JButton("Computer dept.");
		btnComputerDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cee.main(new String[] {});
				frame.dispose();
			}
		});
		btnComputerDept.setBackground(Color.LIGHT_GRAY);
		btnComputerDept.setForeground(new Color(255, 0, 255));
		btnComputerDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnComputerDept.setBounds(123, 141, 235, 23);
		frame.getContentPane().add(btnComputerDept);

		JButton btnElectricalDept = new JButton("Electrical dept.");
		btnElectricalDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eee.main(new String[] {});
				frame.dispose();
			}
		});
		btnElectricalDept.setBackground(Color.LIGHT_GRAY);
		btnElectricalDept.setForeground(new Color(255, 0, 255));
		btnElectricalDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnElectricalDept.setBounds(123, 188, 231, 23);
		frame.getContentPane().add(btnElectricalDept);

		JButton btnAutoMobilesDept = new JButton("Auto mobiles dept.");
		btnAutoMobilesDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aee.main(new String[] {});
				frame.dispose();
			}
		});
		btnAutoMobilesDept.setBackground(Color.LIGHT_GRAY);
		btnAutoMobilesDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAutoMobilesDept.setForeground(new Color(255, 0, 255));
		btnAutoMobilesDept.setBounds(123, 237, 235, 23);
		frame.getContentPane().add(btnAutoMobilesDept);

		JButton btnMechanicalDept = new JButton("Mechanical dept.");
		btnMechanicalDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mecha.main(new String[] {});
				frame.dispose();
			}
		});
		btnMechanicalDept.setBackground(Color.LIGHT_GRAY);
		btnMechanicalDept.setForeground(new Color(255, 0, 255));
		btnMechanicalDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMechanicalDept.setBounds(123, 286, 235, 23);
		frame.getContentPane().add(btnMechanicalDept);

		JButton btnArchitectDept = new JButton("Architect dept.");
		btnArchitectDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				archi.main(new String[] {});
				frame.dispose();
			}
		});
		btnArchitectDept.setBackground(Color.LIGHT_GRAY);
		btnArchitectDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnArchitectDept.setForeground(new Color(255, 0, 255));
		btnArchitectDept.setBounds(123, 334, 235, 23);
		frame.getContentPane().add(btnArchitectDept);

		JButton btnCivilDept = new JButton("Civil dept.");
		btnCivilDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				civill.main(new String[] {});
				frame.dispose();
			}
		});
		btnCivilDept.setBackground(Color.LIGHT_GRAY);
		btnCivilDept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCivilDept.setForeground(new Color(255, 0, 255));
		btnCivilDept.setBounds(123, 381, 235, 23);
		frame.getContentPane().add(btnCivilDept);

		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libbsec p = new libbsec();
				p.mainNewScreen();
				frame.dispose();

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBounds(120, 424, 238, 31);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(depttboo.class.getResource("/SS/IMG-20190817-WA0014.jpg")));
		lblNewLabel.setBounds(61, 47, 532, 435);
		frame.getContentPane().add(lblNewLabel);
	}
}
