package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
    private WebDriver driver;
    private By signbtn = By.className("nav-action-inner");
    private By email = By.id("ap_email");
    private By continuebtn = By.id("continue");
    private By password = By.id("ap_password");
    private By loginbtn = By.id("signInSubmit");
    
    public Login (WebDriver driver)	{
    	
    	
    	this.driver = driver;
    	 }
    public void clicksignbtn() {
    	
    	driver.findElement(signbtn).click();
    	
    }
    public void enteremail(String emailid)
    
    {
    	
    	driver.findElement(email).sendKeys(emailid);
    }
    public void clickbtn()
    {
    	
    	driver.findElement(continuebtn).click();
    }
    
    public void enterpwd(String pwd)
    {
    	
    	driver.findElement(password).sendKeys(pwd);
    }
    public void clicklogin()
    {
    	
    	driver.findElement(loginbtn).click();
    }
    public void ln(String emailid,String pwd )
    {
    	clicksignbtn();
    	enteremail(emailid);
    	clickbtn();
    	enterpwd(pwd);
    	clicklogin();	
    	
    	
    	
    	
    }
    
    
	
    


}
