package IndependentToDependent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.findElement(By.xpath("//a[contains(text(),'Virtual Gift Card')]/../../..//input[@value='Add to cart']")).click();
	}

}
