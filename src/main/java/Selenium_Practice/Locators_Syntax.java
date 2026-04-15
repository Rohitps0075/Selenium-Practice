package Selenium_Practice;

public class Locators_Syntax {

	public static void main(String[] args) {
		//xpath- it is the path of the webelment in the dom
		/*
		 * in xpath we have absolute and relative xpath
		 * in absolute xpath we use /
		 * in relative xpath we use //
		 * 
		 * relative xpath
		 
		 */

		
		//relative xpath
		
		//tagname[@AN='AV']
		//input[@placeholder='First Name']
		
		//tagname[@AN1='AV1' and @AN2='AV2']
		//input[@placeholder='First Name' and @id='input-firstname']
		
		// text function
		//tagname[text()='tv']
		//a[text()='Login']
		
		//a--.all links
		//img--all images
		//a[@href]-->links with href attribute
		//a[not(@href)]---> links without href attribute
		
		//contains function
		//tagname[contains(@AN,'AV')] or //tagname[conatins(text(),'tv')]
		//input[contains(@placeholder,'Last')]
		//a[contains(text(),'Recurring')]
		
		
		
		
		
	}

}
