package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConnectionView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField clientIp, clientPort, serverPort;
	private JButton connectToServer, listenToClient;
	public ConnectionView() {
		initGui();
	}
	
	private void initGui() {
		//textfields
		clientIp = new JTextField(15);
		clientPort = new JTextField(5);		
		serverPort = new JTextField(5);
		//buttons
		connectToServer = new JButton("Connect");
		listenToClient = new JButton("Listen");
		//layout
		GridLayout layout = new GridLayout(2, 3);
		layout.addLayoutComponent("Client IP", clientIp);
		layout.addLayoutComponent("Client port", clientPort);
		layout.addLayoutComponent("Connect", connectToServer);
		layout.addLayoutComponent("EMPTY_LABEL", new JLabel("Server"));
		layout.addLayoutComponent("Server port", serverPort);
		layout.addLayoutComponent("Listen", listenToClient);
		//attach
		setLayout(layout);
		//other settings
	}
	
	
}
