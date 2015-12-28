import javax.swing.*;
import java.awt.*;
class eggPanel extends JPanel {
	
	public  void paintComponent(Graphics g) {
	    g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(Color.white);
		g.fillOval(5,5,25,35);
	}
}
	