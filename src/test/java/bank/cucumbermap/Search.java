package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
	@When("^user click on branches$")
	public void user_click_on_branches() throws Throwable 
	{
		Object[] input6 = new Object[1];
		input6[0] = "//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]";
		Hashtable<String,Object>input6op = SeleniumOperations.click(input6);
		HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user click on branches", input6op.get("MESSAGE").toString());
		//SeleniumOperations.click(input6);
	}
	   

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String country) throws Throwable
	{
		Object[] input7 = new Object[2];
		input7[0] = "//select[@id='lst_countryS']";
		input7[1] = country;
		Hashtable<String,Object>input7op = SeleniumOperations.dropdown(input7);
HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"user select \"([^\"]*)\" as country", input7op.get("MESSAGE").toString());
		
		
		//SeleniumOperations.dropdown(input7);
	}
	   

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String state) throws Throwable
	{
		Object[] input8 = new Object[2];
		input8[0] = "//select[@id='lst_stateS']";
		input8[1] = state;
		
		Hashtable<String,Object>input8op = SeleniumOperations.dropdown(input8);
HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"user select \"([^\"]*)\" as state", input8op.get("MESSAGE").toString());
		
		
		
		//SeleniumOperations.dropdown(input8);
	}

	@When("^user select \"([^\"]*)\" as city$")
	public void user_select_as_city(String city) throws Throwable 
	{
		Object[] input9 = new Object[2];
		input9[0] = "//select[@id='lst_cityS']";
		input9[1] = city;
		
		Hashtable<String,Object>input9op = SeleniumOperations.dropdown(input9);
HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(),"user select \"([^\"]*)\" as city", input9op.get("MESSAGE").toString());
		//SeleniumOperations.dropdown(input9);
	}
	   

	@When("^user click on Search button$")
	public void user_click_on_Search_button() throws Throwable 
	{
		Object[] input10 = new Object[1];
		input10[0] = "//input[@id='btn_search']";
		
Hashtable<String,Object>input10op = SeleniumOperations.click(input10);
HTMLReportGenerator.StepDetails(input10op.get("STATUS").toString(),"user click on Search button", input10op.get("MESSAGE").toString());
		//SeleniumOperations.click(input10);
		
	}
	    

	@Then("^Application shows search result for \"([^\"]*)\" city$")
	public void application_shows_search_result_for_city(String arg1) throws Throwable
	{
		Object[] search= new Object[2];
		search[0] = "(//*[text() = 'MUMBAI'])[1]";
		search[1] = "MUMBAI";
		
		Hashtable<String,Object>searchop = SeleniumOperations.validation(search);
HTMLReportGenerator.StepDetails(searchop.get("STATUS").toString(),"Application shows search result for \"([^\"]*)\" city", searchop.get("MESSAGE").toString());
		//SeleniumOperations.validation(search);

	}
}
