package selenium;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	}

}