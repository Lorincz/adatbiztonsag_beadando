package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public abstract class GuiAppSkeleton extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void initializeGui();
	
	public GuiAppSkeleton() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				initializeGui();
				
			}
		};
		EventQueue.invokeLater(runnable);
	}
}
