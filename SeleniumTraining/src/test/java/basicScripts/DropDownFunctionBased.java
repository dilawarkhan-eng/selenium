package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownFunctionBased {
	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "F:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.manage().addCookie(null);
		driver.manage().window().maximize();
		//By Industry = By.id("Form_submitForm_Industry");
		//By Country = By.id("Form_submitForm_Country");
		WebElement orange=driver.findElement(By.name("Industry"));
	//	Select select1 = new Select(driver.findElement(Country));
		//select1.deselectByVisibleText("India");
		Select select = new Select(orange);
		select.selectByVisibleText("Aerospace");
	}

}
