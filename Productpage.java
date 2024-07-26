package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productpage {
    private WebDriver driver;
    
    private By firstpro = By.cssSelector("div[data-index='0'] h2 a");
    private By addtocartbtn = By.id("add-to-cart-button");
    
    public Productpage(WebDriver driver)
    {
    	
    	this.driver = driver;
    	 }
    
    public void selectfirstpr()
    {
    	WebElement prlink = driver.findElement(firstpro);
    	prlink.click();
    }
    
    public void clickaddtocartbtn()
    {
    	
    	driver.findElement(addtocartbtn).click();
    }
    


}
