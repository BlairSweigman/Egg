import java.util.*;
import java.awt.*;
import javax.swing.*;
class eggChef {
	JFrame frame;
	JPanel cartonPanel;
	JPanel cookPanel;
	public static void main(String[] args) {
		eggChef  ec = new eggChef();
		Carton c = new Carton(12);
		ec.buildGUI();
	}	
		public void buildGUI() {
		frame = new JFrame();
		
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(6,2);
		cartonPanel = new JPanel(grid);
			ArrayList<eggPanel> epl = new ArrayList<eggPanel>() ;
		for (int i=0;i<12;i++) {
	    	eggPanel ep = new eggPanel();
			cartonPanel.add(ep);
			
		}
		cartonPanel.setPreferredSize(new Dimension(280, 400));
		frame.add(BorderLayout.CENTER,cartonPanel);
		cookPanel = new JPanel();
		cookPanel.setLayout(new BoxLayout(cookPanel,BoxLayout.Y_AXIS));
		JButton buttonO = new JButton("Omelete");
		cookPanel.add(buttonO);
		JButton buttonH = new JButton("Hard Boiled");
		cookPanel.add(buttonH);
		JButton buttonS = new JButton("Soft Boiled");
		cookPanel.add(buttonS);
		frame.add(BorderLayout.WEST,cookPanel);
		frame.setBounds(50,50,500,500);
		frame.pack();
		frame.repaint();
		frame.setVisible(true);
	}

}