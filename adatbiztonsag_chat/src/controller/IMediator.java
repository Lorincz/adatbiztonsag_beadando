package controller;

import view.ChatView;
import view.ConnectionView;
import view.ConsoleView;
import view.EncryptionView;

public interface IMediator {
	void addConnection(ConnectionView connectionView);
	void addEncryption(EncryptionView encryptionView);
	void addChat(ChatView chatView);
	void addConsole(ConsoleView consoleView);
	
	
}
