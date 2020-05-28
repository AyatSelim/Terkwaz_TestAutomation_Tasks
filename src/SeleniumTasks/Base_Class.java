package SeleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base_Class{
	
	
	WebDriver driver ;
	
	
//@BeforeTest
public void  Test_Setup()
	
	{
	
	String ChromeDriverName = "chromedriver.exe";
	String Driver_Path = System.getProperty("user.dir")+"\\TestResources\\ChromeDriver\\" + ChromeDriverName;
	System.setProperty("webdriver.chrome.driver", Driver_Path);
    this.driver =  new ChromeDriver();
	this.driver.manage().window().maximize();
    this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    System.out.print("Done");
   }

//@AfterTest
public void Test_TearDown () {

	this.driver.close();
}

}
