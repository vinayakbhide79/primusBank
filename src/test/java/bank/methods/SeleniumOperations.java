package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations //DRIVER LAUNCH
{
		 public static WebDriver driver = null;
		 public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
		 
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
		try{
			String strBrowserName = (String) inputParameters[0];
		
		String webDriverExePath = (String) inputParameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",webDriverExePath );
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}else if(strBrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",webDriverExePath );
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action:browserLaunch, Input Given:"+ inputParameters[0].toString());
		
		} catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:browserLaunch, Input Given:"+ inputParameters[0].toString());
		}
		return outputParameters;
	}
			// WEBSITE URL LAUNCH
	public static Hashtable<String,Object> applicationLaunch(Object[]inputParameters)
	{	try {
		String strURL = (String) inputParameters[0];
		
		driver.get(strURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:applicationLaunch, Input Given:"+ inputParameters[0].toString());
		
		
	}	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action:applicationLaunch, Input Given:"+ inputParameters[0].toString());
	}return outputParameters;
	}
		// SEND KEYS
	public static Hashtable<String,Object> EnterSendKeys(Object[] inputParameters)
	{	try {
		String xpath = (String) inputParameters[0];
		String value = (String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement obj1 = driver.findElement(By.xpath(xpath));
		obj1.clear();
		obj1.sendKeys(value);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:EnterSendKeys, Input Given:"+ inputParameters[1].toString());
	}	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action:EnterSendKeys, Input Given:"+ inputParameters[1].toString());
	}return outputParameters;
	}
	
			// CLICK
	public static Hashtable<String,Object> click(Object[] inputParameters)
	{	try {
		String xpath = (String) inputParameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj2 =driver.findElement(By.xpath(xpath));
		obj2.click();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: click, Input Given:"+ inputParameters[0].toString());
	}	catch(Exception e)
		{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action: click, Input Given:"+ inputParameters[0].toString());
		}return outputParameters;
	}
	
	//Select country DROPDOWN
	public static Hashtable<String,Object> dropdown(Object[] inputParameters)
	{	try {
		String xpath = (String) inputParameters[0];
		String name = (String) inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select sel = new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(name);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: dropdown, Input Given:"+ inputParameters[1].toString());
	}	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action: dropdown, Input Given:"+ inputParameters[1].toString());
	}return outputParameters;
	}
	//ALERT POPUP
	public static Hashtable<String,Object> alertPopup(Object[] inputParameters)
	{	try {
		Alert alt =driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println(alt.getText());
		alt.accept();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: alertPopup, Input Given:"+ inputParameters[0].toString());
	}	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action: alertPopup, Input Given:"+ inputParameters[0].toString());
	}return outputParameters;
	}
	// HOVER MOUSE
	public static Hashtable<String,Object> hoverMouse(Object[] inputParameters)
	
	{	try {
		String xpath = (String) inputParameters[0];
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement over = driver.findElement(By.xpath(xpath));
		act.moveToElement(over).build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: hoverMouse, Input Given:"+ inputParameters[0].toString());
	}	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action: hoverMouse, Input Given:"+ inputParameters[0].toString());
	}return outputParameters;
		}
	
	//VALIDATION for valid username and valid password
	public static Hashtable<String,Object> validation(Object[]inputParameters)
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String xpath = (String) inputParameters[0];
		String Str1 = (String) inputParameters[1];
		WebElement web = driver.findElement(By.xpath(xpath));
		String Str2 = web.getText();
		
		try
		{
			if(Str1.equalsIgnoreCase(Str2))
			{
				System.out.println("Test case Pass");
			}else
			{
				System.out.println("Test case Fail");
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: validation, Input Given:"+ inputParameters[1].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Action: validation, Input Given:"+ inputParameters[1].toString());
				
			}return outputParameters;
		}
	//INVALID VALIDATION for invalid username and invalid password
	public static Hashtable<String,Object> validationfail(Object[]inputParameters)
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Alert abc=driver.switchTo().alert();
		String errorMsg = abc.getText();
		abc.dismiss();
		
		try
		{
			if(errorMsg.equals(abc))
			{
				System.out.println("Test case Fail");
			}else
			{
				System.out.println("Test case Pass");
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: validationfail, Input Given:"+ inputParameters[0].toString());
		}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "Action: validationfail, Input Given:"+ inputParameters[0].toString());
			}return outputParameters;
		}
	
	//DOUBLE CLICK 
public static Hashtable<String,Object> mouseDoubleClick(Object[] inputParameters)
	
	{	try {
		String xpath = (String) inputParameters[0];
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement over = driver.findElement(By.xpath(xpath));
		act.moveToElement(over).doubleClick().build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: mouseDoubleClick, Input Given:"+ inputParameters[0].toString());
	}	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action: mouseDoubleClick, Input Given:"+ inputParameters[0].toString());
	}return outputParameters;
		}
	
	//RIGHT CLICK
public static Hashtable<String,Object> mouseRightClick(Object[] inputParameters)

{	try {
	String xpath = (String) inputParameters[0];
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	Actions act = new Actions(driver);
	WebElement over = driver.findElement(By.xpath(xpath));
	act.moveToElement(over).contextClick().build().perform();
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Action: mouseRightClick, Input Given:"+ inputParameters[0].toString());
}	catch(Exception e)
{
	outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "Action: mouseRightClick, Input Given:"+ inputParameters[0].toString());
}return outputParameters;
	}

//DRAG AND DROP
public static void dragAndDrop(Object[] inputParameters)
{	try {
	String xpath = (String) inputParameters[0];
	WebElement frame = driver.findElement(By.xpath(xpath));
	driver.switchTo().frame(frame);
	
	Actions act = new Actions(driver);
	String xpath1 = (String) inputParameters[1];
	String xpath2 = (String) inputParameters[2];
	WebElement drag = driver.findElement(By.xpath(xpath1));
	WebElement drop = driver.findElement(By.xpath(xpath2));
	act.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Action: dragAndDrop, Input Given:"+ inputParameters[2].toString());
	} catch(Exception e)
{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action: dragAndDrop, Input Given:"+ inputParameters[2].toString());	
}
	
	/*WebElement sourceLocator = driver. findElement(By. xpath("xpath"));
	 driver.switchTo().frame(sourceLocator);
	WebElement targetLocator = driver. findElement(By. xpath("xpath"));
	Actions act = new Actions(driver);
	act. dragAndDrop(sourceLocator, targetLocator). build(). perform();*/

}

	public static void main(String[] args)
	{ 
		
		

	}

}
