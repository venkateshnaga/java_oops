package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sam {
	WebDriver driver;
	public static void main(String[] args) {
		
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		String s=driver.getTitle();
		System.out.println(s);
	}

}
