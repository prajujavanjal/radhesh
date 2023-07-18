package multiselect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(co);
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);

 WebElement ele1 = driver.findElement(By.xpath("//a[text()='Create new account']"));
 Actions a=new Actions(driver);
 a.moveToElement(ele1).click().perform();
 Thread.sleep(3000);
 
WebElement ele = driver.findElement(By.id("month"));
Thread.sleep(3000);

Select s=new Select(ele); 
List<WebElement> opp = s.getOptions();
System.out.println(opp.size());
ArrayList c=new ArrayList();
for(WebElement b:opp)
{
	System.out.println(b.getText());
	String r = b.getText();
	c.add(r);
	}
System.out.println(s.isMultiple());
if(s.isMultiple())
{
	s.deselectAll();
	}

 System.out.println("*****After sorting**");
Collections.sort(c);
for(Object x:c)
{
	System.out.println(x);
	}

driver.close();


	}

}
