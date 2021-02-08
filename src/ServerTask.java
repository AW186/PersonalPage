import java.io.*;
import java.net.*;
import java.lang.Runnable;

public class ServerTask implements Runnable {
	protected Socket client;
	private boolean enable = false;
	ServerTask() {
	
	}
	ServerTask(Socket client) {
		this.client = client;
		enable = true;
	}
	public void setClient(Socket client) {
		this.client = client;
		enable = true;
	}
	protected void questDidRecieved(InputStream in) {

	}

	protected void sendResponse(OutputStream out) {

	}

	protected ServerTask duplicate() {
		ServerTask task = new ServerTask(client);
		return task;
	}
	public void run() {
		try {
			questDidRecieved(client.getInputStream());
			sendResponse(client.getOutputStream());
			client.close();
		} catch (Exception e) {
			System.out.println("Error e");
		}
	}
}














