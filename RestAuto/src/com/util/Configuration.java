import java.util.Properties;


public class Configuration {
	public static String URI;
	
	public Configuration(){
		loadProperties();
	}
	
	public void loadProperties(){
		
		Properties prop = new Properties();
		try{
		FileReader reader = new FileReader(new File("%s/config.properties", Syetem.getProperty("user.dir")));
		prop.load(reader);
		
		URI = prop.getProperty("uri");
		}
		catch(Exception ex)
		
	}
         
}
