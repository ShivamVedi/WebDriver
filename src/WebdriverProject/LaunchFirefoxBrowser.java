package WebdriverProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.simplilearn.com/");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		}

	}

