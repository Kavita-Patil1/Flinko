package webElementsTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        List<WebElement> objlinks=driver.findElements(By.tagName("input"));
       
        for(int i=0;i<objlinks.size();i++)
        {
        	System.out.println(objlinks.get(i).getAttribute("text"));
        }
        driver.quit();
	}
	}


