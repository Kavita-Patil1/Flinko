package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.findElement(By.linkText("Register")).click();
	        driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).click();
	        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Kavita");
	        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patil");
	        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kavita.p@testyantra.com");
	        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Patil");
	        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Kavita");
	        driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
