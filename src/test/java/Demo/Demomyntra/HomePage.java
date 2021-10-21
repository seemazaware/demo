package Demo.Demomyntra;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.base;

//myntra
public class HomePage extends resource.base
{
	public WebDriver driver;
	public Logger log ;
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
	 log = LogManager.getLogger(resource.base.class.getName());
	 driver =initializeDriver();
	 log.info("Initialize driver");
	 driver.get("https://www.myntra.com/login?");
	 log.info("hiting Login url");
	 driver.manage().window().maximize();
	}	
	@Test(priority = 1)
	public void baseNavigation() throws IOException, InterruptedException
	{ 			
		loginpage l=new loginpage(driver); 
		l.Login();
		l.Logintoclick();
		log.info("Login complete");
		System.out.println("Positive Test completed");
	}
	
	@Test(priority = 2)
	public void baseNavigationsearch() throws IOException, InterruptedException
	{
		searchpage s=new searchpage(driver);

		s.searchproduct();
		log.info("product is searched");

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		System.out.println("search page operation complete");
    	Thread.sleep(3000);
		s.selectcheckbox();
		log.info("Select Checkbox");

		WebElement mouse = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img"));
		actions.moveToElement(mouse).perform();   
		log.info("mouse action");
		s.wishlist();
	}
	@Test(priority = 3)
	public void baseNavigationaddtobag() throws IOException, InterruptedException
	{
		AddToBag a =new AddToBag(driver);
		a.gotowishlit();
		log.info("Go to wishlist");
	    a.movetobag();
	    a.productsize();
		log.info("Product Size");
        a.Done();
	    a.Bag();
		log.info("Product in bag");
	    a.TatalPrice();
		log.info("Final price of the product");
        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        
	}
	
	@Test(priority = 4)
	public void baseNavigationvalidation() throws IOException, InterruptedException
	{
		AddToBag a =new AddToBag(driver);
		Thread.sleep(5000);
	    a.validtion();
	    log.info("validation");
	    System.out.println("product in Add to cart");   
	    return;

    }
	
	@AfterTest
	public void close()
	{
		driver.close();
	}	
	
}
