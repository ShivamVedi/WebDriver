package WebdriverProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		
		//Page inside the page, child page,  here we have switch in frame,
		driver.switchTo().frame("frame1");
		WebElement Header = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header is " + Header.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement Header2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header is " + Header2.getText());
		
		//Switch for come in main frame use default content.
		
				

	}

}
