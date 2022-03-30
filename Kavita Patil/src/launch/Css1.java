package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.findElement(By.cssSelector("a.ico-register")).click();
	        driver.findElement(By.cssSelector("input#gender-female")).click();
	        driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Kavita");
	        driver.findElement(By.cssSelector("input#LastName")).sendKeys("Patil");
	        driver.findElement(By.cssSelector("input#Email")).sendKeys("kavita.p@testyantra.com");
	        driver.findElement(By.cssSelector("input#Password")).sendKeys("Patil");
	        driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("Kavita");
	        driver.findElement(By.cssSelector("input#register-button")).click();
	      
	}

}
