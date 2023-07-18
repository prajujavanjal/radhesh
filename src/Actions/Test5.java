package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.com/");
      WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
      Actions a=new Actions(driver);
      a.contextClick(ele).perform();
      
      
	}

}
