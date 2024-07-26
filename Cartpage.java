package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {
    private WebDriver driver;
    private By catbtn = By.id("nav-cart");
    private By checkoutbtn = By.xpath("//input[@name='proceedToRetailCheckout']");
    
    Cartpage(WebDriver driver)
    {
    	
    	this.driver = driver;
    }
    public void gotocart()
    {
    		driver.findElement(catbtn).click();
    }
    public void clickcheckout()
    {
    	driver.findElement(checkoutbtn).click();
    }
    
    


}
