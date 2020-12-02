package basicScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "F:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/ap/crm/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='Try For Free']")).click();
		Thread.sleep(4000);
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);// will return 2 window handles, iterator wil iterate to return total.

		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();

		driver.switchTo().window(childwindow);
		// driver.close();
		driver.findElement(By.name("UserFirstName")).sendKeys("Dilawar");
		driver.findElement(By.name("UserLastName")).sendKeys("Khan");
		driver.findElement(By.name("UserEmail")).sendKeys("dilawarmr1@gmail.com");
	//	WebElement ddown=driver.findElement(By.name("UserTitle"));
		
	//	Select select = new Select(ddown);
	//	select.deselectByVisibleText("IT Manager");
		driver.switchTo().window(parentwindow);
	}

}
