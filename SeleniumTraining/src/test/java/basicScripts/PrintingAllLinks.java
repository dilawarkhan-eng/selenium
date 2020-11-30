package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.List;

public class PrintingAllLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/request-demo/");
		List<WebElement> alltags = driver.findElementsByTagName("a");
		System.out.println("Total Tags are:"+alltags.size());

		for (int i=0; i<alltags.size(); i++)
		{
			System.out.println("All links on the page are"+alltags.get(i).getAttribute("href"));
			System.out.println("All links on the page are"+alltags.get(i).getText());
			
		}

	}

}
