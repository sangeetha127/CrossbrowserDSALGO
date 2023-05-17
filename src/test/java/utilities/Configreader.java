package utilities;
import java.util.ResourceBundle;

public class Configreader {
	private static String browserType = null;
	
	public static void setBrowserType(String browser) {
		System.out.println("enter config reader set browsertype " + browser);
		browserType = browser;
	}
	
	public static String getBrowesrType(){
		if(browserType!=null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");		
	}
	public static void loadConfig() {
		 ResourceBundle rb;
		 String br;
		rb=ResourceBundle.getBundle("Config");
		br=rb.getString("browser");
	}
}
