package tw.org.iii.mytest;

import java.io.File;

public class Alex44 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		File dir1 = new File("./dir1");
		System.out.println(dir1.getAbsolutePath());
		
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
	}

}
