package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
Thread.sleep(3000);
WebElement ele = driver.findElement(By.id("searchDropdownBox"));

Thread.sleep(3000);
Select s=new Select(ele);
Thread.sleep(1000);
s.selectByIndex(2);
Thread.sleep(1000);
s.selectByValue("search-alias=baby-products-intl-ship");
Thread.sleep(1000);

s.selectByVisibleText("Arts & Crafts");
Thread.sleep(1000);
List<WebElement> opp = s.getOptions();
System.out.println(opp.size());
for(WebElement b:opp)
{
	System.out.println(b.getText());
	
	
	
	}
driver.close();
	}

}
