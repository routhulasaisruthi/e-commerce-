package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {
	
	public static WebDriver driver;
	public Logger logger;// for logging
	public ResourceBundle rb;
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) {
		logger=LogManager.getLogger(this.getClass());//get test case name
		rb=ResourceBundle.getBundle("config");// read values from config.properties file
		if(br.equals("chrome")) {
		driver= new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("https://demo.opencart.com/"));
	}
	@AfterClass
	public void close() {
		driver.quit();
		
	}

}