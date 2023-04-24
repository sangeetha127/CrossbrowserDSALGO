package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.Combase;

public class portalopenpage extends Combase {

	@FindBy(xpath="//button[text()='Get Started']") WebElement getstartedbtn;

	 public portalopenpage (WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }	
	
	public void clickgetstartedbtn() {
		getstartedbtn.click();
	}
	public  String gethomepagetitle() {
		return "NumpyNinja";
	}
}
