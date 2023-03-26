package WebdriverProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Step-1:Launch the browser,		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.simplilearn.com/");
		
		//Step-2:Maximise the browser.		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.MICROSECONDS);
		
		//Step-3: Click on the login link,
		System.out.println("The title of the page" + driver.getTitle());
		
		WebElement  loginLink = driver.findElement(By.linkText("Log in"));
		String location = loginLink.getAttribute("href");
		System.out.println("The link will take you to" + location);
		loginLink.click();
		
		//Step-4: Enter the login user id and password,
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@gmail.com");
		
		//Step-5: Enter the password,
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("aAbd@1234");
		
		//Step-6: Click on the login button,
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement Loginbtn = driver.findElement(By.name("btn_login"));
		Loginbtn.click();
		Thread.sleep(3000);				
		
		//Step-7: Validate the login was unsuccessful,
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		//System.out.println("The error message is "+ errorMsg);
		String exeErrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed() && errorMsg.equals(exeErrorMsg)) {
			System.out.println("TesCase Passed");			
			
		}
		
		else {
			System.out.println("TestCase Failed");
		}
		
		//Find all the links over the page,
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are " + AllLinks.size());
		
		//Find all the links,
		for(WebElement link : AllLinks) {
			System.out.println(link.getAttribute("href"));
		}
		
		//Step-9:
		driver.close();		
		

	}

}
