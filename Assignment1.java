package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.className("crmsfa")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Aniveshu");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Karanam");
		
		driver.findElement(By.name("submitButton")).click();
		
		String firstNameText = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First Name string is : " + firstNameText);
		
		String lastNameText = driver.findElement(By.id("viewContact_lastName_sp")).getText();
		System.out.println("Last Name string is : " + lastNameText);
		
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    
		
	}

}
