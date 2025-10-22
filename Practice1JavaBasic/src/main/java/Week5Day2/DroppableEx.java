package Week5Day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class DroppableEx {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
				
				driver.get("");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				

}
