package SeleniumTasks;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2_Upload_File_Run extends Base_Class{
	
	
String URL = "https://the-internet.herokuapp.com/";
String File_Name = "Test_NG.jpg";
String Path = "\\Test_Resources\\Upload_Files\\" ; 


@Test
public void Run_Test_Case () throws InterruptedException  {


Navigate_to_Landing_Page_Method Navigate_LandingPage = new Navigate_to_Landing_Page_Method (this.driver);
Navigate_LandingPage.Set_URL(URL) ;

Landing_Page_Method Choose_Upload_Link = new Landing_Page_Method (this.driver);
Choose_Upload_Link.Choose_UploadFile_Link();


Task2_Upload_File_Test_Methods Upload_File = new Task2_Upload_File_Test_Methods(this.driver) ;
Upload_File.FILENAME = File_Name;
Upload_File.FilePath =  Path ;
Upload_File.Upload_File();
Upload_File.Submit_File();
Upload_File.Valiadte_UploadedFile();

}





}
