package IntroPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {

	public static void main(String[] args) {
		
		// Invoking Browser
		// Chrome - ChromeDriver -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//Safari  - SafariDriver -> Methods close get
		// WebDriver - An Interface - Methods just declared and implemented under the classes in it -  close get
		// WebDriver Methods + ChromeDriver Class methods

		//Chromedriver.exe -> To invoke Chrome browser by Selenium
		//SeleniumManager(Search web and download  chromedriver.exe automatically -> Inbuilt library in ChromeDriver to invoke Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "D:\\Learn\\Selenium\\SoftwaresTostart\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
	}

}
