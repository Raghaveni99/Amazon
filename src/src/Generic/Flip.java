package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Flip
{
	public static String propertydata(String path,String key) throws Exception
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String value=p.getProperty(key);
		System.out.println(value);
		return value;

	
	}

}
