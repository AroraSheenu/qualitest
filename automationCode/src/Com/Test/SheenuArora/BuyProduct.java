package Com.Test.SheenuArora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver;		
		
		System.setProperty("webdriver.chrome.driver","/Users/sheenuarora/eclipse-workspace/Qualitest2/driver/chromedriver‎⁨");
		  driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";
		  
		  
		// Open URL		
		  
	driver.get(URL);
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email")).sendKeys("sheenu.arora85@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("Seaside123");
	  driver.findElement(By.id("SubmitLogin")).click();
	  
	  
	//Click on T-shirt
	  
	  driver.findElement(By.linkText("T-SHIRTS")).click();
	
	  
	}

}
