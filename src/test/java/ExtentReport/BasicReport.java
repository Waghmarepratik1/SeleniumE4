package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasicReport {
	@Test

	public void main() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		File path=new File(".src/main/resources/Sample.html");
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		//configure spark
		spark.config().setDocumentTitle("CRM Vtiger");
		spark.config().setReportName("heyyprateek");
		spark.config().setReportName("Theme.DARK");
		//CREATE EXTENT REPORT
		ExtentReports report=new ExtentReports();
		//configure Extent Report
		report.setSystemInfo("Os", "window-11");
		report.setSystemInfo("Browser", "Chrome-101");
		//attach thee spark to the extent report
		report.attachReporter(spark);
		//create extent test
		ExtentTest test = report.createTest("main");
		test.log(Status.INFO, "demo web shop Launching.....");
		driver.close();
		test.log(Status.FAIL, "intention")
		assertEquals("Sky","Nolan");
		report.flush();
	}

}
