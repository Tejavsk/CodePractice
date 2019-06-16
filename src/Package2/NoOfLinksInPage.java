package Package2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int  n = links.size();
		System.out.println(n);
		for (int i=0; i<n; i++)
		{
			String str = links.get(i).getText();
			System.out.println(str);
		}
		driver.close();
	}

}
