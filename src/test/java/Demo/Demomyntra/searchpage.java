package Demo.Demomyntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchpage {
		
		    public  WebDriver driver;
		    
			By search = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input");
			By checkbutton =By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label/div");	
			By product =By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[3]/a/div[1]/div");
			By wishlist =By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/div[3]/span");
			
			public searchpage (WebDriver driver)
		    {
		             this.driver=driver;
		    }		

		    public void searchproduct()
		    {
		    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(search))).sendKeys("Puma Casual Shoes for women");
		    }
		    
		    public void selectcheckbox()
		    {
		    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(checkbutton))).click();
		    }
		    
		    public void selectproduct()
		    {
		    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(product))).click();	
		    }
		    
		    public void wishlist()
		    {
		    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(wishlist))).click();	    
		    }
		    
		    
		    
		}
	   
