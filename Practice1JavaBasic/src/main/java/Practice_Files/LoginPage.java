package Practice_Files;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public static void main(String[] args) {
		//WebDriver.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement Login = driver.findElement(By.className("_1krdK5 vbCXhM"));
		//Login.click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.className("login")).click();
		//driver.findElement(By.partialLinkText("login?ret=/account/login%3Fret%3D%2F")).click();
		//WebElement userName = driver.findElement(By.className("r4vIwl BV+Dqf"));
		//userName.sendKeys("Enter User Name/Phone Number");
		//WebElement SendOTP = driver.findElement(By.className("QqFHMw twnTnD _7Pd1Fp"));
		//SendOTP.click();
	}
}
