package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	    Thread.sleep(300);
		//back
		driver.navigate().back();
	    Thread.sleep(300);
		
		//forward
		driver.navigate().forward();
	    Thread.sleep(300);
		
		//refresh
		driver.navigate().refresh();
		driver.close();
		

	}

}
