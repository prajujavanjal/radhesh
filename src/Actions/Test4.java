package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.name("q"));
	
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
		
		
	}

}
