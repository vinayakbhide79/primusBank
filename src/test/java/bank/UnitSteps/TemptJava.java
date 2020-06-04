package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava implements TempData
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver chrome driver", "C:\\Users\\vinay\\OneDrive\\Desktop\\Project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElementByXPath("//input[@id='txtuId']").sendKeys(username);
		driver.findElementByXPath("//input[@id='txtPword']").sendKeys(password);
		driver.findElementByXPath("//input[@id='login']").click();
		
		driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
		
		Select sel = new Select(driver.findElementByXPath("//select[@id='lst_countryS']"));
		sel.selectByVisibleText(country);
		
		Select sel1 = new Select(driver.findElementByXPath("//select[@id='lst_stateS']"));
		sel1.selectByVisibleText(state);
		
		Select sel2 = new Select(driver.findElementByXPath("//select[@id='lst_cityS']"));
		sel2.selectByVisibleText(city);
		
		driver.findElementByXPath("//input[@id='btn_search']").click();		
		
		
		
		

	}

}
