package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("books");
        driver.findElement(By.cssSelector("input[value='Search'] ")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 300)");
       // driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("a[class='ico-register']")).click();
        //  driver.findElement(By.cssSelector("input[id='gender-female']")).click();
        //  driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Kavita");
        // driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Patil");
        //  driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("kavita.p@testyantra.com");
        //   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Patil");
        //  driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Kavita");
        //  driver.findElement(By.cssSelector("input[value='Register']")).click();
      
	}

}
