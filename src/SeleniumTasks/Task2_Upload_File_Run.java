package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2_Upload_File_Run extends Base_Class{
	
	
	WebDriver driver1 ;
	
	
	String URL = "https://the-internet.herokuapp.com/";
	String File_Name = "Test_NG.jpg";
	String Path = "\\Test_Resources\\Images\\" ; 

    Task2_Upload_File_TestCase TestCaseRun = new Task2_Upload_File_TestCase();
	Navigate_to_Landing_Page_Method LandingPage = new Navigate_to_Landing_Page_Method();
	Landing_Page_Method LandingPage2 = new Landing_Page_Method() ;


	
@BeforeTest
public void B_Task2_1() throws InterruptedException 
{	
	   LandingPage.Test_Setup();
       LandingPage.Set_Landing_Page_URL(URL);
       
    
}

@Test
public void Task2_2() throws InterruptedException {
	
	LandingPage2.Choose_UploadFile_Link();
	
}

@Test
public void Task2_3() throws InterruptedException {
	
	TestCaseRun.File_Uploaded_Successfully(driver1 , File_Name, Path);
	
}




}
