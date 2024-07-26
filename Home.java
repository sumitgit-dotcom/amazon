package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	private WebDriver driver;
	
	private By srchbox = By.id("twotabsearchtextbox");
	private By srchbtn = By.id("nav-search-submit-button");
	
	public Home(WebDriver driver)
	{
		
		this.driver = driver;
		}
	
	public void enterSearchTerm(String searchTerm) {
		
		driver.findElement(srchbox).sendKeys("searchTerm");
	}
	public void clickbtn()
	{
		
		driver.findElement(srchbtn).click();
	}
	
	public void srchproduct(String prname)
	{
		
		enterSearchTerm(prname);
		clickbtn();
		
	}
	
	

}
