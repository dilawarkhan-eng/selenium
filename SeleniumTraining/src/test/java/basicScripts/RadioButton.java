package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.singaporeair.com/en_UK/sg/home#/book/bookflight");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement radiobtn1=driver.findElement(By.id("redeemFlights"));
		radiobtn1.click();
	System.out.println(	radiobtn1.isSelected());
//	System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());

	}

}
