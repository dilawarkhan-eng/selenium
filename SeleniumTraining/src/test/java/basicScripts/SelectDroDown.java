package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDroDown {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
				// "F:\\ChromeDriver\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.sugarcrm.com/request-demo/");
				WebElement ddown=driver.findElement(By.name("employees_c"));
				
				Select select = new Select(ddown);
				select.selectByValue("level1");
				
				Thread.sleep(2000);
				
				select.selectByVisibleText("51 - 100 employees");
				Thread.sleep(2000);

				select.selectByIndex(5);
				Thread.sleep(2000);

				

	}

}
