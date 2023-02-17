package Stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class LoginStepdefination {
	 private static WebDriver driver; 
	  @Before
	    public void setUp() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\karan\\OneDrive\\Desktop\\seleniumstuff\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	 
	    @Given("open browser and launch website")
	    public void loginTest() {
	         
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	    }
}
