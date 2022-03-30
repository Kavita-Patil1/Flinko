package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.linkText("Create New Account")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kavita");
	        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
	        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9920937633");
	        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("kajbsah");
	        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
