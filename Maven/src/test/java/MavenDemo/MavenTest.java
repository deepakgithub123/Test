package MavenDemo;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class MavenTest {
	
	@Test
	public void TestMaven()
	{
/*		
//	String chromeDriverPath = System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
	WebDriver driver;
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
//	String chromeDriverPath ="D:\\Sumit_Backup\\Automation\\Workspace\Maven\src\\Browser\\chromedriver.exe";
*/
	System.setProperty("webdriver.chrome.driver", "D:\\Sumit_Backup\\Automation\\Workspace\\Maven\\src\\Browser\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://testng.org/doc/maven.html");
	driver.manage().window().maximize();


/*		
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://testng.org/doc/maven.html");		
//		System.out.println("Done");
*/	
	
	}
}
