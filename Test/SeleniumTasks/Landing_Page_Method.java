package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing_Page_Method {

WebDriver driver ;
	
	
	public Landing_Page_Method(WebDriver driver) {
		
		this.driver = driver ;
		
	}
	
	String Link_Xpath = "//div[@class='large-12 columns'][@id='content']/ul/li[18]/a" ;
	String Link2_Xpath ="//div[@class='large-12 columns'][@id='content']/ul/li[14]/a" ;

	WebElement Link ;
	WebElement Link2 ;
	
	 public  void Choose_UploadFile_Link( ) throws InterruptedException 
	 {             
		 Link = this.driver.findElement(By.xpath(Link_Xpath));
		  Link.click();  
		
		
	 }
	 
	 
	 public  void Dynamic_Load_Link( ) throws InterruptedException 
	 {             
		  Link2 = this.driver.findElement(By.xpath(Link2_Xpath));
		  Link2.click();  
		
		
	 }
}
