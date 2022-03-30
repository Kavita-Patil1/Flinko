package webElementsTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/b/?_encoding=UTF8&node=16225015011&pf_rd_r=QN8J1JEX9DBDY37GS13Y&pf_rd_p=babef740-5109-4f42-9432-791e50a12de8&pd_rd_r=6566c2b9-9c26-4ff4-885d-63a9a3f452a0&pd_rd_w=pID7T&pd_rd_wg=lTIbQ&ref_=pd_gw_unk");
        driver.manage().window().maximize();
        List<WebElement> objlinks=driver.findElements(By.tagName("a"));
        for(int i=0;i<objlinks.size();i++)
        {
            System.out.println(objlinks.get(i).getAttribute("text"));
        }

	}

}
