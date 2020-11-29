package basicScripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsInSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "F:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//*[@id='field7']/div/input")).sendKeys("Dilawar");

		// Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='field7']/div/input")).clear();
		//String att = driver.findElement(By.xpath("//*[@id='field7']/div/input")).getAttribute("class");
		//System.out.println(att);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'field1\']/div/inputv")).getCssValue("text-transform"));
		

	}

}
