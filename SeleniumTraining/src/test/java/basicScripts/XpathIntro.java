package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathIntro {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		

		driver.manage().window().maximize();

	driver.get("https://developer.salesforce.com/signup");
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Dilawar");
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Khan");
	//driver.quit();

	}

}

/*

 *
//type[@attribute=’value’]
i.e input[@type=’text’]  if we use this then all of the matching xpath will be hilighted.
If we want to right a unique Xpath so we have to provide any other attribute like ID or TagName etc.
i.e
//input[@ID=’First_Name’]

*/
