

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	private static Socket socket;

	public static void main(String args[]) throws InterruptedException {
		for(int i =1;i<16000;i++){
		Thread T = new SimpleThread("Thread_"+i);
		T.start();
		if(((float)i)/4000 == 0){
			Thread.sleep(1000);
		}
		/*if(i==5000||i==10000||i==15000||i==20000){
			T.sleep(1000);
		}*/
		}
	}
}

class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}

	public void run() {
		try {
			String host = "localhost";
			int port = 7891;
			InetAddress address = InetAddress.getByName(host);
			Socket socket = new Socket(address, port);
			// System.out.println("You're now connected to the Server");
			// /*this should only print once */
			// Send the message to the server
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			String number;
			number = this.getName();
			String sendMessage = number + "\n";
			//System.out.println("Message: "+sendMessage);
			bw.write(sendMessage);
			bw.flush();
			

		} catch (IOException exception) {
			// System.out.println("Server is still offline");/*This should
			// only print once*/
		}
		}
		
	}

