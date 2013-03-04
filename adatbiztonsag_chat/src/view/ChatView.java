package view;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
public class ChatView extends JPanel {
	private JTextArea messages;
	private JPanel inputPanel;
	private JButton sendButton;
	private JTextField inputField;
	public ChatView() {
	}
	
	private void initGUI() {
		try {
			{
				BoxLayout thisLayout = new BoxLayout(this, javax.swing.BoxLayout.Y_AXIS);
				this.setLayout(thisLayout);
				this.setPreferredSize(new java.awt.Dimension(334, 125));
				{
					messages = new JTextArea();
					this.add(messages);
					messages.setPreferredSize(new java.awt.Dimension(329, 92));
				}
				{
					inputPanel = new JPanel();
					this.add(inputPanel);
					inputPanel.setPreferredSize(new java.awt.Dimension(382, 33));
					{
						inputField = new JTextField();
						inputPanel.add(inputField);
						inputField.setText("Type here");
						inputField.setPreferredSize(new java.awt.Dimension(224, 24));
					}
					{
						sendButton = new JButton();
						inputPanel.add(sendButton);
						sendButton.setText("Send");
						sendButton.setPreferredSize(new java.awt.Dimension(82, 25));
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
