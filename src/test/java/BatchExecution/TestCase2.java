package BatchExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase2{
	    @Test
public <WebDriver> void honda() {
   WebDriver driver= new ChromeDriver();   
  driver.manage().window().maximize();
  driver.get("https://kawasaki-india.com/");
  driver.close();

}


 @Test(dependsOnMethods = "kawasaki")
 public void royalEnfield() {
	 org.openqa.selenium.WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.tvsmotor.com/");
	 driver.close();
 }
 
 }

