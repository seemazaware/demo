package Demo.Demomyntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {

	public WebDriver driver ;
	
	By Username = By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/input");
	By clickbutton =By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[3]");

   public loginpage (WebDriver driver)
   {
           this.driver=driver;
   }
   
   public void Login()
   {
	  new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(Username))).sendKeys("9139377297");

   }
   public void Logintoclick()
   {
	   new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(clickbutton))).click();
   }
   
}
