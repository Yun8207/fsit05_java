package tw.alex.java;

import java.lang.reflect.Method;

public class JDBC01 {

	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("OK");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Not Found");
		}

//		String str1 = new String();
//		String str2 = "";
//		
//		Class class1 = str1.getClass();
//		System.out.println(class1.getName());
//		Class class2 = class1.getSuperclass();
//		System.out.println(class2.getName());
//		
//		Method[] methods = class1.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}

	}

}
