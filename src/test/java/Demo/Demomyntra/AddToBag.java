package Demo.Demomyntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AddToBag {
		
			     String selectedproductName;
			     String productname;
			     String TotalPrice;
				 WebDriver driver ;
				 String Name="seema";
				
			    By gotowishlist=By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[1]/span[1]");
				By MovetoBag =By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/ul/div[1]/div[2]/div[2]/span/a");
				By size =By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/ul/div[1]/div[2]/div/div/div[3]/button[5]");
				By Done =By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/ul/div[1]/div[2]/div/div/div[5]");
				By Bag =By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[1]");
				By Price =By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div[4]");
				
				 public AddToBag (WebDriver driver)
				  {
				         this.driver=driver;
				  }
				 public void gotowishlit()
				  {
				   	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(gotowishlist))).click();
				  	selectedproductName=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]/ul/div[1]/div[2]/div[1]/p[1]")).getText();
				 }
				 
				 public void movetobag()
				 {
			    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(MovetoBag))).click();
				 }
				 
			    public void productsize()
			    {
			      new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(size))).click();
			    }
			    public void Done()
			    {
			    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(Done))).click();
			    }
			    
			    public void Bag()
			    {
			    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(Bag))).click();	
			    }
			    
			    public void TatalPrice()
			    {
			    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(Price)));
			    	TotalPrice=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div[5]/span[2]/span[2]")).getText();
			        System.out.println("Amount of product " +TotalPrice );  
			    }	 
			    
			    public void validtion()
			    {
			    	 productname=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div[1]/div[4]/div[2]/div/div/div/div[2]/div/div[1]/a")).getText();
				      Assert.assertEquals(selectedproductName,Name);  
				      
			    }

	}
