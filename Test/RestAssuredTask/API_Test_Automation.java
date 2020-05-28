package RestAssuredTask;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;


public class API_Test_Automation {

	@Test
	public void Automate_API  (){
		

	    given(). 
		when().
        get("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=1").
        then().
        assertThat().
        contentType(ContentType.JSON).
		and().
		assertThat().
        statusCode(200).
        and().
		assertThat().
		body( "text",not(empty()) ).
		and().
		log().
		all();
       
	}



	
	//String response ;
	
	
/*@AfterTest
public void Set_Path () {
	
     String ScrShot_Path = System.getProperty("user.dir")+"\\TestResources\\ScreenShots\\";
     String ScrShot_Full_Path = ScrShot_Path+ "Api_Response_ScreenShot";
     
	 File Scr_Create = new File(ScrShot_Full_Path);
	 
	 File ScrShot_GetResponse = (body()).getAs(OutputType.FILE);
	 
	 FileUtils.copyFile(ScrShot_GetResponse,Scr_Create);
	 
	 org.testng.Reporter.log(  );
}	*/
}


	