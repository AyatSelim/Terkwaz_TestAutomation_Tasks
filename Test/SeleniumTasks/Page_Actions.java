package SeleniumTasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Page_Actions {
	


		 public void Take_ScreenShot ( WebDriver driver , String file_ext) throws IOException {
			 
			 String ScreenShot_Name = driver.getTitle()+file_ext;
		     String ScrShot_Path = System.getProperty("user.dir")+"\\TestResources\\ScreenShots\\";
		     String ScrShot_Full_Path = ScrShot_Path+ScreenShot_Name;
		     
			 File Scr_Create = new File(ScrShot_Full_Path);
			 
			 File ScrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 FileUtils.copyFile(ScrShot,Scr_Create);
			 
			 
			 org.testng.Reporter.log("<br><img src='"+ScrShot_Full_Path+"' height='600' width =600' /> <br>");
		 }
	

}
