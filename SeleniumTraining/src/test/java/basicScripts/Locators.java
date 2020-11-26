package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class Locators {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
	/*	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		*/
		//driver.findElement(By.id("user-name")).sendKeys("testing");
		
		//WebElement passWordField = driver.findElement(By.id("password")).sendKeys("11221122");
		//WebElement emailAddressField= driver.findElement(withTagName("input").above(passWordField)).sendKeys("Dilawarkhan@gmail.com");
		
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		
		
		driver.close();
		
		
	}

}
