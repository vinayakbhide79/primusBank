package bank.UnitSteps;



import bank.methods.SeleniumOperations;

public class newTours {

	public static void main(String[] args) throws InterruptedException {
		//browser launch
				Object[]input=new Object[2];
				input[0]="Chrome";
				input[1]= "C:\\Users\\vinay\\OneDrive\\Desktop\\Project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
				SeleniumOperations.browserLaunch(input);
				
				
				//application open
				Object[] input1=new Object[1];
				input1[0]= "https://jqueryui.com/droppable/";
				SeleniumOperations.applicationLaunch(input1);
				
				/* sendkeys for login username and password
				Object[] input2 = new Object[2];
				input2 [0] = "//input[@name='userName']";
				input2 [1] = "vinayakbhide";
				SeleniumOperations.EnterSendKeys(input2);
				Thread.sleep(2000);
				Object[] input3 = new Object[2];
				input3 [0]  = "//input[@name='password']";
				input3 [1] = "Asdf1234@";
				SeleniumOperations.EnterSendKeys(input3);
				
				Object[] input4 = new Object[1];
				input4 [0] = "//input[@name='login']";
				SeleniumOperations.click(input4);
				
				// click one way
				Object[] input5 = new Object[1];
				input5 [0] = "//body//b//input[2]";
				SeleniumOperations.click(input5);
				
				//Select number of passengesr
				Object[] input6 = new Object[2];
				input6 [0] = "//select[@name='passCount']";
				input6 [1] = "1 ";
				SeleniumOperations.dropdown(input6);
				
				Object[] input7 = new Object[2];
				input7 [0] = "//select[@name='fromPort']";
				input7 [1] = "London";
				SeleniumOperations.dropdown(input7);
			
				
				Thread.sleep(2000);
				Object[] input9 = new Object[2];
				input9 [0] = "//select[@name='fromMonth']";
				input9 [1] = "May";
				SeleniumOperations.dropdown(input9);
				
				Object[] input10 = new Object[2];
				input10 [0] = "//select[@name='fromMonth']";
				input10 [1] = "May";
				SeleniumOperations.dropdown(input10);
				
				Object[] input11 = new Object[2];
				input11 [0] = "//select[@name='fromDay']";
				input11 [1] = "26";
				SeleniumOperations.dropdown(input11);
				
				Object[] input12 = new Object[2];
				input12 [0] = "//select[@name='toPort']";
				input12 [1] = "Paris";
				SeleniumOperations.dropdown(input12);
				
				Object[] input13 = new Object[2];
				input13 [0] = "//select[@name='toMonth']";
				input13 [1] = "June";
				SeleniumOperations.dropdown(input13);
			
				Object[] input14 = new Object[2];
				input14 [0] = "//select[@name='toDay']";
				input14 [1] = "17";
				SeleniumOperations.dropdown(input14);
				Thread.sleep(2000);
				Object[] input15 = new Object[1];
				input15[0] = "//font[contains(text(),'Economy class')]";
				SeleniumOperations.click(input15);
				Thread.sleep(2000);
				Object[] input16 = new Object[2];
				input16 [0] = "//select[@name='airline']";
				input16 [1] = "Blue Skies Airlines";
				SeleniumOperations.dropdown(input16);
				Thread.sleep(2000);
				Object[] input17 = new Object[1];
				input17[0] = "//input[@name='findFlights']";
				SeleniumOperations.click(input17);
																																					
				// hover mouse over cruises
				Object[] input8 = new Object[1];
				input8 [0] = "//a[contains(text(),'Cruises')]";
				SeleniumOperations.hoverMouse(input8);
				
				// double click
				
				Object[] input19 = new Object[1];
				input8 [0] = "//a[contains(text(),'Car Rentals')]";
				SeleniumOperations.mouseDoubleClick(input19);*/
				
				
				//DRAG AND DROP
				Object[] input20 = new Object[3];
				input20[0] = "//*[@class='demo-frame']";
				input20[1] = "//div[@id='draggable']";
				input20[2] = "//div[@id='droppable']";
				SeleniumOperations.dragAndDrop(input20);		
				
				
				

	}

}
