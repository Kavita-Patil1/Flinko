package Cointainsfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistertoDemoshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'gender-female')]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("Kavita");
        driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("kavita.p@testyantra.com");
        driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[contains(@id,'ConfirmPassword')]")).sendKeys("Kavita");
        driver.findElement(By.xpath("//input[contains(@id,'register-button')]")).click();
	}

}