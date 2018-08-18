package tw.org.iii.mytest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Alex61 {

	public static void main(String[] args) {
		byte[] buf = "Hi".getBytes();
				
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					buf, buf.length, InetAddress.getByName("192.168.201.160"), 8888);
			socket.send(packet);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
