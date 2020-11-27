package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethodsInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
String pg=driver.getPageSource();
System.out.println(pg);
driver.navigate().to("http://www.facebook.com");

}
}