package deepthi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Datafrom_File {

	public static void main(String[] args) throws Exception {
	
		
		Properties pro=new Properties();
		
		FileInputStream fis=new FileInputStream("G:\\deepu\\src\\deepthi\\data.properties");
		
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		pro.setProperty("browser", "firefox");
		System.out.println(pro.getProperty("browser"));

		FileOutputStream fos=new FileOutputStream("G:\\deepu\\src\\deepthi\\data.properties");
		pro.store(fos, null);
	}

}
