package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkout {
	private WebDriver driver;
	private Login lg;
	private Home home;
	private Productpage product;
	private Cartpage cart;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        
        lg = new Login(driver);
        home = new Home(driver);
        product = new Productpage(driver);
        cart = new Cartpage(driver);
		
	
	}
	
	@Test
	public void amazoncheckout()
	{
		
		String email = "rawatsumit@gmail.com";
		String password = "123456789";
		String product = "mobile phone";
		lg.ln(email, product);
		home.srchproduct(product);
		
	}
	

}
