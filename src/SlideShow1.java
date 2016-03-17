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
	
			"/img/Gubbe1.1.jpg",
			"/img/utanbubbla.jpg",
			"/img/Gubbe1.2.jpg",
			"/img/utanbubbla.jpg", 
			"/img/Gubbe1.3.jpg",
			"/img/utanbubbla.jpg"
		
	};
	
	public SlideShow1() {
		//super("java SlideShow");
		photo = new JLabel();
		photo.setBounds(0, 0, 405, 720); 
		//SetImageSize(6); // the number of photos in the array

		
		// 5000 is the delay
		tm = new Timer(3000, new ActionListener() {
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
		setSize(405, 720); 
		getContentPane();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void SetImageSize(int i) {
		ImageIcon icon = new ImageIcon(SlideShow1.class.getResource(list[i]));
		Image img = icon.getImage();  
		Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		photo.setIcon(newImc);
	}
	
public static void main(String[] args) {
	
	new SlideShow1();
}
	
}