package DriverFactory;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

public class driversetup {
	public static WebDriver driver;

	public WebDriver getchromeDriver(String browser) throws InterruptedException {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("chromebrowser");
			LoggerLoad.info("enter getchromedriver");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		
		}
		/*else if(browsertype.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//tlDriver.set(new FirefoxDriver());
			driver=new FirefoxDriver();*/
		else if (browser.equalsIgnoreCase("edge")) {
				//Edge
			//System.setProperty("webdriver.msedge.driver", "C:/Users/sange/OneDrive/Desktop/Drivers/msedgedriver.exe");
			System.out.println("edgebrowser");
			WebDriverManager.edgedriver().setup();	
			driver=new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;	
		
	}	
		//rb=ResourceBundle.getBundle("Config");
		//br=rb.getString("browser");	
		//if(br.equals("CHROME"))
		//{
			//LoggerLoad.info("enter getchromedriver");
			/*System.setProperty("webdriver.chrome.driver",".\\src/test/resources/drivers/chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--incognito");

			driver=new ChromeDriver(options);*/
			//WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
			//tlDriver.set(new ChromeDriver());
		//}
		/*else if br.equals("FIREFOX"){
		//Firefox
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());

		}
		else if (br.equals("edge")) {
		//Edge
		System.setProperty("webdriver.msedge.driver", "C:/Users/sange/OneDrive/Desktop/Drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		}*/

		/*getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return getDriver();

	}*/

	public  static void openPage(String url) {
		LoggerLoad.info("current page :"+url);
		getDriver().get(url);
	}
	public  static String getdriverTitle() {
		return getDriver().getTitle();
	}
	public  static void NavBack() {
		getDriver().navigate().back();
	}
	public static WebDriver getDriver() {
		return driver;
		//LoggerLoad.info("enter getdriver");
		//return tlDriver.get();
	}
	
	public void setUpDriver(String browser) {
		//if (getDriver()==null) {
		System.out.println("inside setupdriver"+browser);
		//browsertype = browser;
			//getchromeDriver();
		//}
		}
/*	public static void setbrowsertype(String browser ) throws InterruptedException {
		System.out.println("inside driversetupsetbrowsertype" +browser);
		browsertype = browser;
		getchromeDriver();
	}
	
	public static String getbrowsertype() {
		System.out.println("inside driversetupgetbrowsertype" +browsertype);
		if (browsertype!=null)
			return browsertype;
		else
			throw new RuntimeException("browser not exists");
	}*/
	
	public  static void tearDown() {
		if(getDriver()!=null) {
			LoggerLoad.info("enter teardown");
			getDriver().close();
			getDriver().quit();
			driver=null;
		}
		//driver = null;
		
	}
	
	public void closedriver() {
		driver.close();
	}
	
	public void  getErrorText() throws InterruptedException {
		
	}

}
