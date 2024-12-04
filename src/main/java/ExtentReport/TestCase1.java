package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
       @Test
       public void Kawasaki() {
    	   System.out.println("iam Rider");
    	   WebDriver driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	   driver.get("https://www.bikewale.com/yamaha-bikes/r15/");
    	   driver.close();
    	   assertEquals("pratik","sky");
       }
        @Test(dependsOnMethods = "GT 650")
        public void royalEnfield() {
        	System.out.println("iam royalenfield");
        	WebDriver driver=new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        	driver.get("https://www.royalenfield.com/in/en/home/");
        	driver.close();        	
        }
       
}