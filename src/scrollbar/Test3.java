package scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://xhamster18.desi/");
driver.findElement(By.xpath("//i[@class='xh-icon cross dialog__close-icon dlg-close-icon hover to-red white']")).click(); 
WebElement ele = driver.findElement(By.xpath("//a[text()='Orgy at the Villa, the Final Orgy']"));
Point loc = ele.getLocation();
int x = loc.getX();
int y = loc.getY();
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy("+x+","+y+")");
//ele.click();
js.executeScript("arguments[0].click();",ele);

	}

}
