package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameExample {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		

driver.switchTo().frame(0);
driver.switchTo().parentFrame();

	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.quit();

	}

}
