package Com.Test.SheenuArora;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyProduct2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver;		
		
		System.setProperty("webdriver.gecko.driver","/Users/sheenuarora/eclipse-workspace/Qualitest2/driver/geckodriver");
		  driver=new FirefoxDriver();
		  String URL="http://automationpractice.com/index.php";

 

	      	driver.get(URL);



	      	driver.findElement(By.linkText("Sign in")).click();



	      	driver.findElement(By.id("email")).sendKeys("sheenu.arora85@gmail.com");



	      	  driver.findElement(By.id("passwd")).sendKeys("Seaside123");



	      	  driver.findElement(By.id("SubmitLogin")).click();



	      	  



	      	  



	      	//Click on T-shirt and add to cart



	      	  



	      	  driver.findElement(By.linkText("T-SHIRTS")).click();



	      	  Actions action = new Actions(driver);



	            WebElement we = driver.findElement(By.xpath("//*[contains(text(),'Faded Short Sleeve T-shirts')]"));



	            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", we);



	            action.moveToElement(we).build().perform();



	            



	            



	            driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();



	            




   Thread.sleep(2000);


	            WebElement closebtn = driver.findElement(By.xpath("//*[@title='Close window']"));



	            closebtn.click();

           

	            //Alert alert = driver.switchTo().alert();



	            //alert().dismiss();



	      	  



	            // Update personal information



	            

	            WebElement viewAcount = driver.findElement(By.xpath("//*[@title='View my customer account']"));

	            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", viewAcount);



	            viewAcount.click();

//	            driver.findElement(By.xpath("//*[@title='View my customer account']")).click();



//	      	  Actions action2= new Actions(driver);



	      	 



	          WebElement m1 = driver.findElement(By.xpath("//*[contains(text(),'My personal information')]"));



	            



	            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", m1);

	            

	            m1.click();



//	            action2.moveToElement(m1).build().perform();



	            



	            //Open personal information



	            



//	            WebElement buttons = driver.findElement(By.xpath("//*[contains(text(),'My personal information')]"));

	//

//	          		  buttons.click();



	          		  



	          		  WebElement firstname = driver.findElement(By.id("firstname"));

	          		  

	                  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", firstname);





	          		  firstname.clear();	



	          		  firstname.sendKeys("sarora");



	          		  WebElement save = driver.findElement(By.name("submitIdentity"));

	                  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", save);





	          		  save.click();

	        	

	        	



	             driver.quit();
	}

	
	}

