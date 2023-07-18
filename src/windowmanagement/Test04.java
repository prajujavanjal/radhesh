package windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
	
		Thread.sleep(500);
	
	//fullscreen the window
		
	driver.manage().window().fullscreen();
	
	    Thread.sleep(500);
	
	//minimize the browser

		driver.manage().window().minimize();
		driver.close();
		
		

	}

}
