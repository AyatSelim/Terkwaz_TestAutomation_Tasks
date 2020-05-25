package RestAssuredTask;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;


public class API_Test_Automation {

	
	public static void Automate_API  (String[] args){
		

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
		body( "text",not(empty()) );
		
		
        
      
        
           
	}
}


	