package tw.org.iii.mytest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Alex67 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/iTq9GvgHNYL5zK2au5bITQ--~A/YXBwaWQ9aGlnaGxhbmRlcjtzbT0xO3c9MTI3OTtoPTcyMA--/http://media.zenfs.com/zh-Hant-TW/homerun/udn.com/8f758b9d195f8caea99940ceecf461af");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			FileOutputStream fout = new FileOutputStream("dir3/ok.jpg");
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while ((len=bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			bin.close();
			fout.flush();
			fout.close();
			
			
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}