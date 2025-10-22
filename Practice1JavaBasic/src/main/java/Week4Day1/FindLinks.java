package Week4Day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;


public class FindLinks {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//to refresh the page
		driver.navigate();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//int size = allLinks.size();
		//System.out.println(size);
	}

}
