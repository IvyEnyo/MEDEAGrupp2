import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class SlideShow1 extends JFrame {
	JLabel photo; 
	Timer tm; 
	int x = 0; 
	String [] list = {
			"/Users/IvyEnyo/MEDEAGrupp2/src/ppwf2.jpg",
			"/Users/IvyEnyo/MEDEAGrupp2/src/ppwf3.jpg",
			"/Users/IvyEnyo/MEDEAGrupp2/src/ppwf1.jpg"
			
	};
	
	public SlideShow1() {
		super("java SlideShow");
		photo = new JLabel();
		photo.setBounds(40, 30, 700, 300); 
		SetImageSize(2); // the number of photos in the array
		
		tm = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetImageSize(x);
				x +=1; 
				if(x >= list.length)
					x = 0;
			}
		});
		add(photo); 
		tm.start();
		setLayout(null);
		setSize(800,800); 
		getContentPane();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void SetImageSize(int i) {
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage(); 
		Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		photo.setIcon(newImc);
	}
	
public static void main(String[] args) {
	
	new SlideShow1();
}
	
}