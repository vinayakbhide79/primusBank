package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		//browser launch
		Object[]input=new Object[2];
		input[0]="Chrome";
		input[1]= "C:\\Users\\vinay\\OneDrive\\Desktop\\Project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		//application opem
		Object[] input1=new Object[1];
		input1[0]= "http://primusbank.qedgetech.com/";
		SeleniumOperations.applicationLaunch(input1);
		
		//sendkeys username
		
		Object[]input2 = new Object[2];
		input2[0] = "//input[@id='txtuId']";
		input2[1] = "Admin";
		SeleniumOperations.EnterSendKeys(input2);
		
		//sendkeys password
		Object[]input3 = new Object[2];
		input3[0] = "//input[@id='txtPword']";
		input3[1] = "Admin";
		SeleniumOperations.EnterSendKeys(input3);
		
		// CLICK login
		
		Object[] input5=new Object[1];
		input5[0]= "//input[@id='login']";
		SeleniumOperations.click(input5);
		
		//  CLICK branches button
		
		Object[] input6 = new Object[1];
		input6[0] = "//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]";
		SeleniumOperations.click(input6);
		
		//DROPDOWN select country
		Object[] input7 = new Object[2];
		input7[0] = "//select[@id='lst_countryS']";
		input7[1] = "INDIA";
		SeleniumOperations.dropdown(input7);
		//DROPDOWN select state
		Object[] input8 = new Object[2];
		input8[0] = "//select[@id='lst_stateS']";
		input8[1] = "MAHARASTRA";
		SeleniumOperations.dropdown(input8);
		//DROPDOWN select city
		Object[] input9 = new Object[2];
		input9[0] = "//select[@id='lst_cityS']";
		input9[1] = "MUMBAI";
		SeleniumOperations.dropdown(input9);
		//search button
		Object[] input10 = new Object[1];
		input10[0] = "//input[@id='btn_search']";
		SeleniumOperations.click(input10);
		
		//click roles button
		
		Object[] input11 = new Object[1];
		input11[0] = "//tr//tr//tr[4]//td[1]//a[1]//img[1]";
		SeleniumOperations.click(input11);
		
		//click new roles
		
		Object[] input12 = new Object[1];
		input12 [0] = "//input[@id='btnRoles']";
		SeleniumOperations.click(input12);
		
		Object[] input13 = new Object[2];
		input13 [0] = "//input[@id='txtRname']";
		input13 [1] = "DEPUTYMANAGER";
		SeleniumOperations.EnterSendKeys(input13);
		
		Object[] input14 = new Object[2];
		input14 [0] = "//input[@id='txtRDesc']";
		input14 [1] = "OVERALL ASSISTANCE";
		SeleniumOperations.EnterSendKeys(input14);
		
		Object[] input15 = new Object[2];
		input15 [0] = "//select[@id='lstRtypeN']";
		input15 [1] = "C";
		SeleniumOperations.dropdown(input15);
		
		
		Thread.sleep(3000);
		//click submit
		Object[] input16 = new Object[1];
		input16 [0] = "//input[@id='btninsert']";
		SeleniumOperations.click(input16);
	
		
		//ALERT POPUP
				Object[] input17 = new Object[0];
				SeleniumOperations.alertPopup(input17);
				
		//VALIDATION OF SEARCH TEST CASE
				
		Object[] search= new Object[2];
		search[0] = "(//*[text() = 'MUMBAI'])[1]";
		search[1] = "MUMBAI";
		SeleniumOperations.validation(search);
		
		//VALIDATION FOR LOGIN
		
		Object[] login = new Object[2];
		login[0] = "//*[text() = 'Admin']";
		login[1] = "Admin";
		SeleniumOperations.validation(login);
		
				
		// invalid VALIDATION   FOR LOGIN
				Object[] popup = new Object[0];
				SeleniumOperations.validationfail(popup);
				
		//drag and drop
				Object[] input20 = new Object[3];
				input20[0] = "//*[@class='demo-frame']";
				input20[1] = "//div[@id='draggable']";
				input20[2] = "//div[@id='droppable']";
				SeleniumOperations.dragAndDrop(input20);
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
