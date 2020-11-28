package basicScripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInSelenium2 {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "F:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div")); // findElementsBy
		// System.out.println(webElements);

		driver.navigate().to("https://www.sugarcrm.com"); //Window Handle and Window Handles
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles);
	}

}
