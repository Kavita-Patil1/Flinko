package assXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoshop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
        driver.findElement(By.partialLinkText("Shopping cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']]")).click();
	}

}
