package BatchExecution;

public class TestCase2 {
	
	public class TestCase2{
		    @Test
	public void honda() {
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



}
