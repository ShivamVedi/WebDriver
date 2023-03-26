package WebdriverProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		WebElement newTab = driver.findElement(By.id("tabButton"));
		
		String PaerentWin = driver.getWindowHandle();
		System.out.println("Parent win is " + PaerentWin);
		
		Thread.sleep(3000);
		newTab.click();
		
		Set<String> AllWin = driver.getWindowHandles();
		String childWin= "";
		
		for(String win: AllWin) {
			
			System.out.println("The win ID is " + win);

			if(!win.equals(PaerentWin)) {
				
				childWin = win;
			}
		}
		
		System.out.println("Child win is " + childWin);
		
		driver.switchTo().window(childWin);
		
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header in child win is " + childHeader.getText());
		
		Thread.sleep(3000);
		driver.close();
		
		//Click over the Second window
		driver.switchTo().window(PaerentWin);
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		
		AllWin = driver.getWindowHandles();
		
        for(String win: AllWin) {
			
			System.out.println("The win ID is " + win);

			if(!win.equals(PaerentWin)) {
				
				childWin = win;
			}
		}
        System.out.println("Child win is " + childWin);
		
		driver.switchTo().window(childWin);
		
		
		
		WebElement childHeader2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header in child win is " + childHeader2.getText());
		
		Thread.sleep(3000);
		driver.quit();

	}

}
