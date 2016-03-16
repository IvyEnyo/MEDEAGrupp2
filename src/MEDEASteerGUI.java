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
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MEDEASteerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField amneField;
	private JTextField tidField;
	private JTextField platsField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MEDEASteerGUI frame = new MEDEASteerGUI();
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
	public MEDEASteerGUI() {
		setTitle("INFO SK\u00C4RMEN");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hampus\\Desktop\\Elipse workspace1\\Testing_GUI\\img\\ma1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1276, 940);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		amneField = new JTextField();
		amneField.setFont(new Font("Avenir", Font.PLAIN, 12));
		amneField.setBounds(189, 53, 308, 78);
		contentPane.add(amneField);
		amneField.setColumns(10);
		
		tidField = new JTextField();
		tidField.setFont(new Font("Avenir", Font.PLAIN, 12));
		tidField.setBounds(189, 176, 308, 78);
		contentPane.add(tidField);
		tidField.setColumns(10);
		
		platsField = new JTextField();
		platsField.setFont(new Font("Avenir", Font.PLAIN, 12));
		platsField.setBounds(189, 285, 308, 78);
		contentPane.add(platsField);
		platsField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/hermanwikner/Desktop/Skola/Programmering II/GitHub/MEDEAGrupp2/MEDEA-MAH-LOGO-medium.png"));
		lblNewLabel.setBounds(330, 374, 332, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblmne = new JLabel("\u00C4mne");
		lblmne.setForeground(Color.WHITE);
		lblmne.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblmne.setBounds(316, 28, 46, 14);
		contentPane.add(lblmne);
		
		JLabel lblTid = new JLabel("Tid");
		lblTid.setForeground(Color.WHITE);
		lblTid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTid.setBounds(316, 143, 46, 14);
		contentPane.add(lblTid);
		
		JLabel lblPlats = new JLabel("Plats");
		lblPlats.setForeground(Color.WHITE);
		lblPlats.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlats.setBounds(316, 261, 46, 14);
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
		
		JTextArea skarmArea = new JTextArea();
		skarmArea.setFont(new Font("Avenir", Font.PLAIN, 15));
		skarmArea.setEditable(false);
		skarmArea.setBounds(509, 84, 201, 238);
		contentPane.add(skarmArea);
		
		JButton btnNewButton = new JButton("SPARA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String amne = amneField.getText();
				String tid = tidField.getText();
				String plats = platsField.getText();
				
				amneField.setText("");
				tidField.setText("");
				platsField.setText("");
				
				skarmArea.append("Ämne: " + amne + "\n");
				skarmArea.append("Tid: " + tid + "\n");
				skarmArea.append("Plats: " + plats + "\n");
				
				
			}
		});
		btnNewButton.setBounds(529, 334, 117, 29);
		contentPane.add(btnNewButton);
		
	
	}
}
