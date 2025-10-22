package Week1Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver(); 
		 //launch browser
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		//pass the url
		driver.manage().window().maximize();
		//min; max etc
		String titleofthepage = driver.getTitle();
		//webpage name
		System.out.println(titleofthepage);
		//driver.close();//single window
		//driver.quit();//all at a time
		
		
		} 
}
