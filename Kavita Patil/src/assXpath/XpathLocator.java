package assXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("kavita.p@testyantra.com");
	        driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();;
	}

}
