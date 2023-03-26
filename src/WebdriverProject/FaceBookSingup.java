package WebdriverProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSingup {

	public static void main(String[] args) {
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
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mnumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement newpassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		fname.sendKeys("John");
		lname.sendKeys("Curl");
		mnumber.sendKeys("7896556333");
		newpassword.sendKeys("John@123");
		
		//Print all the months value,
		List<WebElement> list = driver.findElements(By.xpath("//select[@title='Month']/option"));
		
		for(WebElement month:list) {
			System.out.println(month.getText());
		}
			
		WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("The default day is " + selectedDay.getText());
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("10");
		//ddDay.selectByValue("10")
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select mMonth = new Select(Month);
		mMonth.selectByVisibleText("Jan");
		
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yYear = new Select(Year);
		yYear.selectByVisibleText("2022");
		

		//*WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		//Female.click();*//
		
		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		Male.click();
		
		//Using this code the to use the this code for using the different Xpath.
		String Gender = "Male";
		
		String genderXpath = "//label[text()= 'shivam']";
		
		String newXpath = genderXpath.replace("shivam", Gender);
		System.out.println("New xpath is " + newXpath);
		
		
		/*String newXpath = "//label[text()='" + Gender + "']";
		System.out.println("The newXpath is " + newXpath );*/
		
		WebElement genderElem = driver.findElement(By.xpath(newXpath));
		genderElem.click();

	


	}

}
