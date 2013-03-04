package view;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ConsoleView extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextArea console;
	public ConsoleView() {
		initGui();
	}
	private void initGui(){
		this.setPreferredSize(new java.awt.Dimension(400, 122));
		{
			console = new JTextArea();
			JScrollPane scrollpane = new JScrollPane(console);
			this.add(scrollpane);
			console.setPreferredSize(new java.awt.Dimension(400, 122));
		}
	}
	
	public void addRow(String input){
		console.append(input+"\n");
	}
}
