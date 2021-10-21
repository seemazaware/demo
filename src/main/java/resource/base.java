package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	   public Properties prop;
	      
	   public WebDriver initializeDriver() throws IOException
		{
			Properties prop=new Properties();
			FileInputStream fis =new FileInputStream("/home/seema/Documents/Eclipse workspace new/Demomyntra/src/main/java/resource/data.properties");
		    prop.load(fis);
	        String BrowserName=prop.getProperty("browser");
	      
	        if(BrowserName.equals("chrome"))
	        {
	        	System.setProperty("webdriver.chrome.driver","/home/seema/selenium setup/chromedriver");
	    	   driver =new ChromeDriver();
	        }
	        else if(BrowserName.equals("firefox"))
	        {
	        	System.setProperty("webdriver.gecko.driver","/home/seema/selenium setup/geckodriver");
	            driver=new FirefoxDriver();
	        }
	        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	        return driver;
		}	
	   
	   
	   public static void getScreenShotPath(String screenshotName,WebDriver driver) throws IOException
	   {
		    TakesScreenshot ts= (TakesScreenshot)driver;
		    File source =ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File("/home/seema/Documents/Eclipse workspace new/Demomyntra/test-output/validtionerror.png"));

	   }

//	   	TakesScreenshot ts=(TakesScreenshot) driver;
//	   	File source =ts.getScreenshotAs(OutputType.FILE);
//	   	String destination = System.getProperty("user.dir")+"/FailedTestsScreenshots/" + screenshotName + dateName	+ ".png";
//	   	
//	   	File finalDestination = new File(destination);
//		FileUtils.copyFile(source, finalDestination);
//		return destination;
//       }
}
