import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class SlideShow1 extends JFrame {
	JLabel photo; 
	Timer tm; 
	int x = 0; 
	Calendar c = Calendar.getInstance();
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	
	// List of Photo. 
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
		setUndecorated(true);
		//setImage(5); // the number of photos in the array 
		 
		// 5000 is the delay
		tm = new Timer(3000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setImage(x);
				x +=1;
				min = c.get(Calendar.MINUTE);
				sec = c.get(Calendar.SECOND);
				if(min % 5 == 0 && sec < 10) {
					x = 0;
				} 
				
				if(x >= list.length) {
					x = 0;
				}
		}
		}); 
		add(photo); 
		tm.start();
		setLayout(null);
		setSize(1080, 1920); 
		getContentPane();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
}
	

	
	public void setImage(int i) {
		ImageIcon icon = new ImageIcon(SlideShow1.class.getResource(list[i]));  // Calls the list of photos. 
		Image img = icon.getImage();  
		Image newImg = img.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon newImc = new ImageIcon(newImg);
		photo.setIcon(newImc);
	}
	

	
public static void main(String[] args) {
	
	new SlideShow1();
}


	
}