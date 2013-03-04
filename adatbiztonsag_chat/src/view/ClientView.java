package view;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;


public class ClientView extends GuiAppSkeleton{
	private static final long serialVersionUID = 1L;
	private ConnectionView connectionView;
	private ConsoleView consoleView;
	private EncryptionView encryptionView;
	private ChatView chatView;
	@Override
	public void initializeGui() {
		connectionView = new ConnectionView();
		encryptionView = new EncryptionView();
		consoleView = new ConsoleView();
		chatView = new ChatView();
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("Connection", connectionView);
		tabbedPane.add("Encryption", encryptionView);
		this.add(tabbedPane, BorderLayout.CENTER);
		this.add(chatView, BorderLayout.EAST);
		this.add(consoleView, BorderLayout.SOUTH);
		//other settings
		setLayout(new BorderLayout());
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		new ClientView();
	}
}
