import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class GUI_Test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Test frame = new GUI_Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Test() {
		setTitle("INFO SK\u00C4RMEN");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hampus\\Desktop\\Elipse workspace1\\Testing_GUI\\img\\ma1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 55, 308, 78);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 178, 308, 78);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 287, 308, 78);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hampus\\Desktop\\Elipse workspace1\\Testing_GUI\\img\\MEDEA-MAH-LOGO-medium.png"));
		lblNewLabel.setBounds(330, 375, 332, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblmne = new JLabel("\u00C4mne");
		lblmne.setForeground(Color.WHITE);
		lblmne.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblmne.setBounds(275, 29, 46, 14);
		contentPane.add(lblmne);
		
		JLabel lblTid = new JLabel("Tid");
		lblTid.setForeground(Color.WHITE);
		lblTid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTid.setBounds(275, 144, 46, 14);
		contentPane.add(lblTid);
		
		JLabel lblPlats = new JLabel("Plats");
		lblPlats.setForeground(Color.WHITE);
		lblPlats.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlats.setBounds(275, 262, 46, 14);
		contentPane.add(lblPlats);
		
		lblNewLabel_1 = new JLabel("INFO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(23, 31, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Sk\u00E4rmen");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(581, 31, 81, 14);
		contentPane.add(lblNewLabel_2);
	}
}
