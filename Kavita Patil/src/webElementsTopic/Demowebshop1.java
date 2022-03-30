package webElementsTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        List<WebElement> objlinks=driver.findElements(By.tagName("a"));
        for(int i=0;i<objlinks.size();i++)
        {
            System.out.println(objlinks.get(i).getAttribute("text"));
        }
	}

}
