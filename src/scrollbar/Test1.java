package scrollbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://flipcard.com/");
Thread.sleep(3000);
JavascriptExecutor js=(JavascriptExecutor) driver;
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,5000)");


Thread.sleep(1000);
js.executeScript("window.scrollBy(0,-5000)");



	}

}
