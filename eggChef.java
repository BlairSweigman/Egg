import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
* Egg Chef application
*
* @author Blair Sweigman
* @version 1.0
*/
class eggChef {
	JFrame frame;
	JPanel cartonPanel;
	JPanel cookPanel;
	JTextField text;
	int eggIndex;
	ArrayList<eggPanel> epl;
	public static void main(String[] args) {
		eggChef  ec = new eggChef();
		Carton c = new Carton(12);
		ec.buildGUI();
	}	
		public void buildGUI() {
			eggIndex=0;
		frame = new JFrame();
		
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(6,2);
		cartonPanel = new JPanel(grid);
			 epl = new ArrayList<eggPanel>() ;
		for (int i=0;i<12;i++) {
	    	eggPanel ep = new eggPanel();
			cartonPanel.add(ep);
			epl.add(ep);
			
		}
		cartonPanel.setPreferredSize(new Dimension(280, 400));
		frame.add(BorderLayout.CENTER,cartonPanel);
		cookPanel = new JPanel();
		cookPanel.setLayout(new BoxLayout(cookPanel,BoxLayout.Y_AXIS));
		JButton buttonO = new JButton("Omelete");
		buttonO.addActionListener(new makeOmelete());
		cookPanel.add(buttonO);
		JButton buttonH = new JButton("Hard Boiled");
		buttonH.addActionListener(new makeHardBoiled());
		cookPanel.add(buttonH);
		JButton buttonS = new JButton("Soft Boiled");
		buttonS.addActionListener(new makeSoftBoiled());
		cookPanel.add(buttonS);
		
		JButton buttonX = new JButton("Exit");

		buttonX.addActionListener(new exitFrame());
		cookPanel.add(buttonX);

		frame.add(BorderLayout.WEST,cookPanel);
		text = new JTextField();
		frame.add(BorderLayout.SOUTH,text);
		frame.setBounds(50,50,500,500);
		frame.pack();
		frame.repaint();
		frame.setVisible(true);
	}

	class EggMaker {
		protected void makeEgg(String status, String sText,int eggCount) {
			if (eggIndex<epl.size()) {
				text.setText( sText );
				epl.get(eggIndex).setStatus(status);
				eggIndex++;
				frame.repaint();
			}
			else {
				text.setText( "OUT OF EGGS!");
			}
		}
	}
	class makeOmelete extends EggMaker implements ActionListener {
		public void actionPerformed(ActionEvent e) {
                makeEgg("EMPTY","Made an Omelete",1);
                //text.setText("Made an Omelete");
                
                //epl.get(eggIndex).setStatus("EMPTY");
                //frame.repaint();
                //eggIndex++;

        }
	}
	class makeHardBoiled extends EggMaker implements ActionListener {
		public void actionPerformed(ActionEvent e) {
               makeEgg("HARD","Made a Hard Boiled Egg",1);
               // text.setText("Made a Hard Boiled Egg");
                //epl.get(eggIndex).setStatus("HARD");
                //frame.repaint();
                //eggIndex++;
        }
	}
	class makeSoftBoiled extends EggMaker implements ActionListener {
		public void actionPerformed(ActionEvent e) {
                
               makeEgg("SOFT","Made a Soft Boiled Egg",1);
        }
	}
	class exitFrame implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	}
}