package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base_Class{
	
	
	WebDriver driver ;
	
	
@BeforeSuite
public void  Test_Setup()
	
	{
	
	String ChromeDriverName = "chromedriver.exe";
	String Driver_Path = System.getProperty("user.dir")+"\\Test_Resources\\ChromeDriver\\" + ChromeDriverName;
	System.setProperty("webdriver.chrome.driver", Driver_Path);
    this.driver =  new ChromeDriver();
	this.driver.manage().window().maximize();
    this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    System.out.print("Done");
   }

//@AfterSuite
//public void Test_TearDown () {
//
//	this.driver.close();
//}

}
