package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropeties {
  Properties prop=new Properties();
	
	public String ReadProperty(String fileName,String propertyName)throws Exception {
		
		FileInputStream file=new FileInputStream(fileName);
		
		prop.load(file);
		
		return prop.getProperty(propertyName);
	}
}
