package SeleniumTasks;

import org.openqa.selenium.WebDriver;



public class Task2_Upload_File_TestCase {


	Task2_Upload_File_Test_Methods TestCase = new Task2_Upload_File_Test_Methods() ;
		
		
public void File_Uploaded_Successfully (WebDriver driver ,String filename , String filepath) throws InterruptedException {
			
			TestCase.FILENAME = filename ;
			TestCase.FilePath = filepath; 
			TestCase.Set_Driver(driver);
			TestCase.Upload_File();
			TestCase.Submit_File();
	        TestCase.Valiadte_UploadedFile(); 
			
			
		

	}
}
