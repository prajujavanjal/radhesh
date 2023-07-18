package pOPUPS;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		 Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		 Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(3000);
		  WebElement ele = driver.findElement(By.id("ext-gen29"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).click().perform();
		
	
		
		
		driver.findElement(By.xpath("(//span[text()='30'])[2]")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	        

	}

}
