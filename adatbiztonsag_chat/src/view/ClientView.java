package view;


public class ClientView extends GuiAppSkeleton{
	private static final long serialVersionUID = 1L;
	private ConnectionPanel connectionPanel;
	
	@Override
	public void initializeGui() {
		connectionPanel = new ConnectionPanel();
		connectionPanel.init();
		getContentPane().add(connectionPanel);
		//other settings
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		new ClientView();
	}
}
