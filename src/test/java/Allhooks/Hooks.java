package Allhooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import DriverFactory.*;
import utilities.*;

public class Hooks {
 private static WebDriver driver;
 private static driversetup Driversetup;
 
	@BeforeAll
	public static void before() throws Throwable
	{
		System.out.println("enter hooks beforeall");
		//Configreader.loadConfig();
		String browser=	Configreader.getBrowesrType();
		Driversetup=new driversetup();
		driver=Driversetup.getchromeDriver(browser);
	}
	
	
	/*    public static void setUp() throws Exception {
		LoggerLoad.info("before hook order 0");
		//driversetup.setUpDriver();
		driversetup.getbrowsertype();
		
	    }
	@Before(order=1)
	public static void setup2() {
		LoggerLoad.info("before hook order 1");
		driversetup.getDriver();
		}*/

		 
	 @AfterStep
	    public void tearDown(Scenario scenario) {
		 LoggerLoad.info("enter after hook");
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	            //driversetup.tearDown();
	        } 
	        //driversetup.getDriver().quit();
	        //driversetup.tearDown();
	    }
	 @AfterAll
	 public static void closedriver( ) {
		 Driversetup.closedriver();
	 }
}
