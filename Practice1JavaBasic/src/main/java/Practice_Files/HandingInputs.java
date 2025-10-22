package Practice_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingInputs {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.id("fullName")).sendKeys("Aahil");
		driver.findElement(By.id("join")).sendKeys("Is in 5th", Keys.TAB);
		//driver.findElement(By.id("getMe")).getAttribute("value");
		String s=	driver.findElement(By.id("getMe")).getDomProperty("value");
		System.out.println(s);
		
	}

}
