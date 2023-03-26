package WebdriverProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Step-1:Launch the browser,		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		//Step-2:Maximise the browser.		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		//Create new account
		WebElement singup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		singup.click();
		
		TakesScreenshot tsObj = (TakesScreenshot) driver;
		File fileObj = tsObj.getScreenshotAs(OutputType.FILE);
		//File screenshotObj = new File("image.png");
		File screenshotObj = new File("src/resource/image.png");
		
		FileUtils.copyFile(fileObj,screenshotObj);
		driver.close();

	}

}
