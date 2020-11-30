package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		WebElement radio=driver.findElement(By.id("doi0")); //actions class here is used to scroll down the web page.Scroll till the radio button.
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		Thread.sleep(4000);
		driver.findElement(By.name("interest_market_c")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.name("interest_market_c")).click();

	System.out.println(	driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	
	}

}
