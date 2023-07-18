package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.snapdeal.com/");
Thread.sleep(3000);
WebElement ele = driver.findElement(By.xpath("//div[@class='accountInner']"));
Actions a=new Actions(driver);
a.moveToElement(ele).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
Thread.sleep(3000);
driver.switchTo().frame(0);
driver.findElement(By.id("userName")).sendKeys("9423907669");
driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.name("keyword")).sendKeys("phone");


	}

}
