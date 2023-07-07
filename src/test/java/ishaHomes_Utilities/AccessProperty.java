package ishaHomes_Utilities;

import java.util.Properties;

public class AccessProperty {

static Properties prop=ReadPropertiesFile.readPropertiesFile();
    
	public static  String getUrl()
	{
			return prop.getProperty("url");
	}
	public static String getName()
	{
			return prop.getProperty("Name");
	}
	public static String getEmail()
	{
			return prop.getProperty("Email");
	}
	public static String getPhoneNumber()
	{
			return prop.getProperty("PhoneNumber");
	}

	
	
	
}
