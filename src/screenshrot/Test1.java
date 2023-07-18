package screenshrot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//Acess the method and photo store in ram
		ts.getScreenshotAs(OutputType.FILE);
		//Specify the location stored in ram
		File fi=new File("./myntra.png");
		//copy paste from ram to your location
		FileUtils.copyFile((File) ts, fi);
		driver.close();

	}

}
