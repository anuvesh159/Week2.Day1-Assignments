package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement userName = driver.findElement(By.id("username"));
		
	    userName.sendKeys("DemoSalesManager");
	    
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.linkText("Leads")).click();
	    
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aniveshu");

	    WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    
	    Select createLeadForm_dataSourceId = new Select (drop);
	    createLeadForm_dataSourceId.selectByVisibleText("Conference");
	    
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ABCD");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
	    
	    WebElement drop1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    
	    Select createLeadForm_industryEnumId = new Select (drop1);
	    createLeadForm_industryEnumId.selectByVisibleText("Computer Hardware");
	    
	    WebElement drop2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    
	    Select createLeadForm_ownershipEnumId = new Select (drop2);
	    createLeadForm_ownershipEnumId.selectByVisibleText("Public Corporation");
	    
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234567");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Helloooooo");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karanam");
	    
        WebElement drop3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    
	    Select createLeadForm_marketingCampaignId = new Select (drop3);
	    createLeadForm_marketingCampaignId.selectByVisibleText("Affiliate Sites");
	    
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("XYZ");
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/07/1997");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computers");
	    
        WebElement drop4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    
	    Select createLeadForm_currencyUomId = new Select (drop4);
	    createLeadForm_currencyUomId.selectByVisibleText("INR - Indian Rupee");
	    
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$%#");
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("078");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anuvesh159@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8610220898");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Self");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("LinkedIn");
	    
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ABCD");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Andhra");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600012");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("012");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Attention");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Null");
	    
	    
        WebElement drop5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    
	    Select createLeadForm_generalStateProvinceGeoId = new Select (drop5);
	    createLeadForm_generalStateProvinceGeoId.selectByVisibleText("Indiana");
	    
        WebElement drop6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    
	    Select createLeadForm_generalCountryGeoId = new Select (drop6);
	    createLeadForm_generalCountryGeoId.selectByVisibleText("India");
        
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    WebElement title1 = driver.findElement(By.id("sectionHeaderTitle_leads"));
	    title1.getText();
	    System.out.println(title1.getText());
	    
	    
	}

}
