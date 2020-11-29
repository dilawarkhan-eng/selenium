package basicScripts;

import java.util.List;

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
				//driver.manage().window().maximize();
				//driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
				driver.get("https://www.sugarcrm.com/request-demo/");
				WebElement ddown=driver.findElement(By.name("employees_c"));
				
				
				Select select = new Select(ddown);
			WebElement firstSelected=	select.getFirstSelectedOption();
		System.out.println(	firstSelected.getText());
				select.selectByValue("level1");
				
				Thread.sleep(2000);
				
				select.selectByVisibleText("51 - 100 employees");
				Thread.sleep(2000);

				select.selectByIndex(5);
				Thread.sleep(2000);
				

		/*	WebElement ddown=	driver.findElement(By.id("multi-select"));
			Select select =new Select(ddown);
			select.selectByValue("California");
			Thread.sleep(2000);

			select.selectByIndex(5);
			List<WebElement> allitems=select.getAllSelectedOptions();
			System.out.println(allitems.size());
			Thread.sleep(4000);
			select.deselectAll();
			Thread.sleep(4000);

			select.selectByValue("Florida");
			Thread.sleep(4000);
			select.selectByIndex(7);
			Thread.sleep(4000);
			
			select.deselectByValue("Florida");
			
			System.out.println(allitems.size());
*/

	}

}
