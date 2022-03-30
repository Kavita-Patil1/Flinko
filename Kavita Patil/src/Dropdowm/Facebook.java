package Dropdowm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kavita");
      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9920937633");
      driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("kajbsah");
	  
	 	WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
	 	Select dropdown=new Select(date);
	 	dropdown.selectByVisibleText("13");
	 	
	 	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	 	Select dropdown1=new Select(month);
	 	dropdown1.selectByVisibleText("Apr");
	 	
	 	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	 	Select dropdown2=new Select(year);
	 	dropdown2.selectByVisibleText("2020");
}
}
