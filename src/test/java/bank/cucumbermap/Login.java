package bank.cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@When("^user opens the \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_the_browser_and_exe(String bname, String exe) throws Throwable
	{
	Object[]input=new Object[2];
	input[0]= bname;
	input[1]= exe;
SeleniumOperations.browserLaunch(input);

	 }

	@When("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String url) throws Throwable 
	{Object[] input1=new Object[1];
	input1[0]= url;
	SeleniumOperations.applicationLaunch(input1);
	
	
	   
	}

	@When("^user enters \"([^\"]*)\" as user name$")
	public void user_enters_as_user_name(String uname) throws Throwable 
	{Object[]input2 = new Object[2];
	input2[0] = "//input[@id='txtuId']";
	input2[1] = uname;
	
Hashtable<String,Object>input2op = SeleniumOperations.EnterSendKeys(input2);
HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(), "user enters \"([^\"]*)\" as user name" , input2op.get("MESSAGE").toString());
	  
	    
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String pword) throws Throwable 
	{Object[]input3 = new Object[2];
	input3[0] = "//input[@id='txtPword']";
	input3[1] = pword;
Hashtable<String,Object>input3op = SeleniumOperations.EnterSendKeys(input3);
HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(), "user enters \"([^\"]*)\" as password" , input3op.get("MESSAGE").toString());   
	   
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{Object[] input5=new Object[1];
	input5[0]= "//input[@id='login']";
Hashtable<String,Object>input5op = SeleniumOperations.click(input5);
HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user click on Login button", input5op.get("MESSAGE").toString());
	    
	}

	@Then("^user is on \"([^\"]*)\" main page and get msg as welcome to Admin$")
	public void user_is_on_main_page_and_get_msg_as_welcome_to_Admin(String word) throws Throwable 
	{
	Object[] login = new Object[2];
	login[0] = "//*[text() = 'Admin']";
	login[1] = word;
Hashtable<String,Object>loginop = SeleniumOperations.validation(login);
HTMLReportGenerator.StepDetails(loginop.get("STATUS").toString(),"user is on \"([^\"]*)\" main page and get msg as welcome to Admin", loginop.get("MESSAGE").toString());   
	    
	}
	@Then("^user gets appropriate error message$")
	public void user_gets_appropriate_error_message() throws Throwable 
	{
		Object[] popup = new Object[0];
Hashtable<String,Object>popup01 = SeleniumOperations.validationfail(popup);
HTMLReportGenerator.StepDetails(popup01.get("STATUS").toString(),"user gets appropriate error message", popup01.get("MESSAGE").toString());
	   
	}



}
