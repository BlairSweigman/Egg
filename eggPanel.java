import javax.swing.*;
import java.awt.*;
class eggPanel extends JPanel {
	private String eggStatus;
 	public eggPanel() {
 		eggStatus = "RAW";
 	}	
 	public void setStatus(String inStatus) {
 		eggStatus = inStatus;
 	}
	public  void paintComponent(Graphics g) {
	    g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(getColor());
		g.fillOval(5,5,25,35);
	}
	private Color getColor() {
		Color retCol;
		switch (eggStatus) {
			case "RAW":
				retCol = Color.white;
				break;
			case "HARD":
				retCol = Color.yellow;
				break;
			case "SOFT":
				retCol = Color.pink;
				break;
			case "EMPTY":
				retCol = Color.darkGray;	
			    break;
			default:
				retCol = Color.red;
				break;
		}
		return retCol;
		
	}
}
	