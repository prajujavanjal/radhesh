package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("mahesh");
		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct sbre']"));
		System.out.println(ele1.size());
		for(WebElement b:ele1)
		{
			System.out.println(b.getText());
		}
		driver.close();
	
		

	}

}
