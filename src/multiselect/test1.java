package multiselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
Thread.sleep(3000);
WebElement ele = driver.findElement(By.id("searchDropdownBox"));
Select s=new Select(ele);
s.selectByIndex(4);

Thread.sleep(1000);
s.selectByValue("search-alias=aps");

Thread.sleep(1000);
s.selectByVisibleText("Baby");

Thread.sleep(1000);

Thread.sleep(3000);
List<WebElement> opp = s.getOptions();
System.out.println(opp.size());

Thread.sleep(3000);
for(WebElement b:opp)
{
	System.out.println(b.getText());
	}

Thread.sleep(1000);
System.out.println(s.isMultiple());
if(s.isMultiple()) {
	s.deselectAll();
}



	}

}
