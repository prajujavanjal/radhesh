package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/index.php#");
	Thread.sleep(20000);
	WebElement ele = driver.findElement(By.id("course"));
	Thread.sleep(3000);
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	WebElement ele1 = driver.findElement(By.id("add"));
	a.doubleClick(ele1).perform();
	
	
	

	}

}
