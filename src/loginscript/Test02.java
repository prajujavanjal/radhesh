package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&prevRID=ENJTJMY8FCVB9YRWT0M0&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
       Thread.sleep(3000);
	    driver.findElement(By.id("ap_customer_name")).sendKeys("Prajakta");
	    Thread.sleep(3000);
	    driver.findElement(By.id("ap_email")).sendKeys("9423927669");
	    Thread.sleep(3000);
	    driver.findElement(By.id("ap_password")).sendKeys("Radhesh@123");
	    Thread.sleep(3000);
	    driver.findElement(By.id("ap_password_check")).sendKeys("Radhesh@123");
	    Thread.sleep(3000);
	    driver.findElement(By.id("continue")).click();
	    
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    if(title.equals("Authentication required")) {
	    	System.out.println("create account page is open suceesfully");}
	    	
	    	else {
	    		System.out.println("create account page is not open suceesfully");
	    	}
	    	
	    }
	    
	}


