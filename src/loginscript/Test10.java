package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

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
		
		String title = driver.getTitle();
		System.out.println(title);
		 String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if(title.equals("actiTIME - Login")) {
				
				System.out.println("pass the login page");
				
			}
			else { 
				System.out.println("Failed the login page");
			}
				
		
			driver.close();

	}

}
