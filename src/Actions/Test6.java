package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
Thread.sleep(3000);
WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
Thread.sleep(3000);
Actions a=new Actions(driver);
a.dragAndDrop(block1, block4).perform();
a.dragAndDrop(block2, block3).perform();

	}

}
