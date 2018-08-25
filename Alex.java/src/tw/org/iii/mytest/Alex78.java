package tw.org.iii.mytest;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;



public class Alex78 {

	public static void main(String[] args) {
		System.out.println("Start:" + System.currentTimeMillis());
		String[] urls = {
				"https://www.freeiconspng.com/download/35070",
				"https://www.desktopbackground.org/p/2011/10/02/274927_without-glass-pane-between-huge-pod-hd-wallpapers-backgrounds-d_4224x2376_h.jpg",
				"http://www.visionmotors.co.za/wp-content/uploads/2016/04/Huge-Backgrounds-26.jpg"
		};
		String[] targets = {"alex01.png","alex02.jpg","alex03.jpg"};
		
		for (int i=0; i<urls.length; i++) {
			new FetchURLImage(urls[i], targets[i]).start();
			new FetchURLImage(urls[i], targets[i]).run();
			
		}
	}

}
class FetchURLImage extends Thread {
	private String url, target;
	public FetchURLImage(String url, String target) {
		this.url= url;
		this.target = target;
	}
	@Override
	public void run() {
		try {
		URL source = new URL(url);
		HttpURLConnection conn = 
				(HttpURLConnection)source.openConnection();
		conn.connect();
		BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
		FileOutputStream fout = new FileOutputStream("dir1/" + target);
		byte[] buf = new byte[4096*1024]; int len = 0;
		while((len = bin.read(buf)) != -1) {
			fout.write(buf,0,len);
		}
		fout.flush();
		fout.close();
		bin.close();
		System.out.println(target + ":OK");
		System.out.println("End:"+System.currentTimeMillis());
		}catch(Exception e) {
			System.out.println(target + ":Error");
			System.out.println("End:"+System.currentTimeMillis());
		}
	}
}