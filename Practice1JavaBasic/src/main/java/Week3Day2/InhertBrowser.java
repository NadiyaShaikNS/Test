package Week3Day2;

import Week1.day1.Chrome;

public class InhertBrowser {

	public static void main(String[] args) {
		
		String browserName = "Chrome";
		int browserVersion = 5;
		System.out.println(browserName);
		System.out.println(browserVersion);
		Chrome.openURL('http://www.msn.com/en-in/money?ocid=msedgntphdr&cvid=c24321c3c8274226878391a1273e6ca9');
		
	}
}
