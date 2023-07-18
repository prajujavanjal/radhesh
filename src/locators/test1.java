package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("prajaktajavanjak@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("lol");
		driver.findElement(By.id("loginButton")).click();

	}

}
