package genOps;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import registrationTesting.Home_page;

public class GenMethods {

public static WebDriver driver;
public static WebElement element;
static String homeUrl;

public String chromeDriverPath = System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
public String url = "https://outlook.office365.com";
public String url1 = "https://www.linkedin.com/";

public void testBedSetup() //open URL after browser setup
{
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to(url);
	driver.manage().window().maximize();
}

public void testBedSetupLinkedIn() //open URL after browser setup
{
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	String downloadFilepath ="D:\\Sumit_Backup\\Automation\\Workspace\\Maven\\src\\Downloaded Resume\\";
	
	Map<String, Object> chromePrefs = new HashMap<String, Object>();
	chromePrefs.put("profile.default_content_settings.popups", 0);
	chromePrefs.put("download.default_directory", downloadFilepath);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", chromePrefs);

	driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to(url1);
	driver.manage().window().maximize();
	
}


public static WebElement txtbx_UserName(WebDriver driver){
	 
    element = driver.findElement(By.id("i0116"));
    return element;
    }


public static WebElement btn_Next(WebDriver driver){
    element = driver.findElement(By.id("idSIButton9"));
    return element;
    }


public static WebElement txtbx_Password(WebDriver driver){
    element = driver.findElement(By.id("i0118"));
    return element;
    }

public static WebElement btn_LogIn(WebDriver driver){
    
    element = driver.findElement(By.id("idSIButton9"));
    return element;
    }

public static String validateHomeage(WebDriver driver) {

	homeUrl = driver.getCurrentUrl();
	return homeUrl;
}


//Linked In Element
public static WebElement txtbx_UserNameL(WebDriver driver){
	 
    element = driver.findElement(By.id("login-email")); 
    return element;
    }

public static WebElement txtbx_PasswordL(WebDriver driver){
	 
    element = driver.findElement(By.id("login-password"));
    return element;
    }

public static WebElement btn_LogInL(WebDriver driver){
	    
	    element = driver.findElement(By.id("login-submit"));
	    return element;
	    }
}


