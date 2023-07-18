package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(4);
		Thread.sleep(1000);
		s.selectByValue("550");
		Thread.sleep(1000);
		s.selectByVisibleText("Business & Industrial");
		List<WebElement> opp = s.getOptions();
		System.out.println(opp.size());
		for(WebElement b:opp)
			
		{
			System.out.println(b.getText());
		}
		      

	}

}








