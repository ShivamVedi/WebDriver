package WebdriverProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.MICROSECONDS);
		
		/*WebElement  loginLink = driver.findElement(By.linkText("Log in"));
		String location = loginLink.getAttribute("href");
		System.out.println("The link will take you to" + location);
		loginLink.click();*/
		
		WebElement UserName = driver.findElement(By.name("email"));
		UserName.sendKeys("abc@gmail.com");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("aAbd@1234");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		WebElement Forgot = driver.findElement(By.className("_97w4"));
		Forgot.click();
		
		WebElement CreateAccount = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
		Forgot.click();
		
		

	}

}
