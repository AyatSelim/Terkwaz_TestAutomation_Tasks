package SeleniumTasks;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Task2_Upload_File_Test_Methods{

	WebDriver driver;
	  
	  public Task2_Upload_File_Test_Methods(WebDriver driver) {
		  this.driver = driver ;
	  }

	 String FILENAME ;
	 String FilePath ;
	 String FileFullPath ;
	 String ScreenShot_Name ;
	 String ScrShot_Path ;
	 
	 String Link_Xpath = "//div[@class='large-12 columns'][@id='content']/ul/li[18]/a" ;
	 String FileUploader_id = "file-upload" ;
	 String FileSubmit_id = "file-submit";
	 String uploadedFiles_id = "uploaded-files" ;
	 
	 
	 WebElement FileUploader ;
	 WebElement FileSubmit;
	 WebElement uploadedFiles ; 
	 
	 Page_Actions P_A = new Page_Actions();
	 
	 public  void Upload_File( ) throws InterruptedException 
	 {             
		  FileUploader = this.driver.findElement(By.id(FileUploader_id));
		  FileFullPath = System.getProperty("user.dir") +FilePath+FILENAME;  
		  FileUploader.sendKeys(FileFullPath);
		
	 }
	 
	 public  void Submit_File( ) throws InterruptedException 
	 {   
		 FileSubmit = this.driver.findElement(By.id(FileSubmit_id));
		 FileSubmit.click();
		
	 }
	 
	 public  void Valiadte_UploadedFile( ) throws InterruptedException, IOException 
	 {   
	    
		 
		 uploadedFiles = this.driver.findElement(By.id(uploadedFiles_id));
		 Assert.assertEquals(FILENAME, uploadedFiles.getText());
		 
		
	 }
	 
	 
	 public void Add_ScrShot () throws IOException {
		 
		 P_A.Take_ScreenShot(this.driver, "_Task2.png");
		 
	 }



}
