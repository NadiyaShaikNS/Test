package Practice_Files;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import java.time.Duration;

	public class LoginPageAI 
	{
	    public static void main(String[] args) {
	    	// Setup Chromedriver
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Open Flipkart homepage
	        driver.get("https://www.flipkart.com");

	        // Wait for Login button to be visible, then click it
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
	        loginButton.click();

	        // Wait for the login popup to appear
	        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='r4vIwl BV+Dqf']")));
	        emailInput.sendKeys("7386111687");
	        
	        // Enter your email and password
	        
	        WebElement requestOTP = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")));
	        requestOTP.click();
	        System.out.println("Enter your OTP");

	        // Click the submit/login button
	        WebElement submitLogin = driver.findElement(By.xpath("//button[@type='submit']"));
	        submitLogin.click();
	        

	        // Optional: Validate login
	        // Wait for a profile element or successful login indicator
	        // Example (change locator as needed):
	        //WebElement profileIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='My Account']")));
	        //System.out.println("Logged in successfully!");

	        //driver.quit(); 
	        
	        Actions action = new Actions(driver);
	        /*WebElement Furniture = driver.findElement(By.xpath("//img[@alt='Furniture']"));
	        //Furniture.click();
	        WebElement beds = driver.findElement(By.xpath("//div[@class='ZHvV68' and text()='Beds']"));
	        //beds.click();
	        action.moveToElement(Furniture).moveToElement(beds).click().perform();*/
	        
	        WebElement furniture = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.xpath("//span[contains(text(),'Furniture')]")));

	        // Hover over Furniture
	        action.moveToElement(furniture).perform();

	        // Wait for the "Beds" submenu to appear
	        WebElement beds = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.xpath("//div[@class='ZHvV68' and normalize-space(text())='Beds']")));

	        // Click on Beds
	        action.moveToElement(beds).click().perform();

	        System.out.println("Navigated to Beds section successfully!");
	        
	      driver.quit();
	    }
	}

	
