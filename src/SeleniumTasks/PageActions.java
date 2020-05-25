package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageActions {
	

protected WebDriver driver;
	
	public PageActions(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver , this);
	}

protected void Click_Element(WebElement element) {
	element.click();
}	


protected void Enter_Text(WebElement element , String text) {
	element.clear();
	element.sendKeys(text);
}


}
