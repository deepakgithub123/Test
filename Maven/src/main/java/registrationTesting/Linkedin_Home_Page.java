package registrationTesting;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

import genOps.GenMethods;

public class Linkedin_Home_Page extends GenMethods {
	private static WebElement element = null;
	static String homeUrl;
	public static String mpath;

	
	@BeforeClass
	public void InitializeSuite()
	{
		testBedSetupLinkedIn();
	}


	@Test(priority = 2)
	public void LinkedIn() throws InterruptedException, AWTException {

		GenMethods.txtbx_UserNameL(GenMethods.driver).sendKeys("deepak.chamoli11@gmail.com");
		Thread.sleep(1000);

		GenMethods.txtbx_PasswordL(GenMethods.driver).sendKeys("kismat123");
		Thread.sleep(1000);

		GenMethods.btn_LogInL(GenMethods.driver).click();
		Thread.sleep(6000);
		
		/////
		GenMethods.driver.findElement(By.xpath("//*[@id=\"ember41\"]/input")).sendKeys("QA resume");
		GenMethods.driver.findElement(By.xpath("//*[@id=\"ember41\"]/input")).click();
			  
			  Thread.sleep(2000);
			  
			  WebElement textbox =
					  GenMethods.driver.findElement(By.xpath("//*[@id=\"ember41\"]/input"));
			  textbox.sendKeys(Keys.ENTER);
			  
		  WebDriverWait wait4 = new WebDriverWait(GenMethods.driver,30);
		  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='actor-name-with-distance search-result__title single-line-truncate ember-view']")));
			  
	      String IdValue = GenMethods.driver.findElement(By.xpath("//h3[@class='actor-name-with-distance search-result__title single-line-truncate ember-view']")).getAttribute("id");

	      String IdFinal = "'"+IdValue+"'";
			  
		  String CanNAME = GenMethods.driver.findElement(By.xpath("//span[@class='name actor-name']")).getText();
			  // System.out.println("CanNAME"+CanNAME);
			  
			  String path = "//*[@id="+IdFinal+"]/span/span/span[1]"; 
			  // System.out.println("PATH VALUE"+path);
			  
			  GenMethods.driver.findElement(By.xpath(path)).click();
			  
		  //Get the More button path and click on More button
		 String moreButtonId = GenMethods.driver.findElement(By.xpath("//button[@class='pv-s-profile-actions__overflow-toggle  button-secondary-large-muted mr2 mt2 artdeco-button artdeco-button--muted artdeco-button--2 artdeco-button--secondary ember-view']"
		 )).getAttribute("id"); String IdFinal1 = "'"+moreButtonId+"'";
			  
			 String path1= "//*[@id="+IdFinal1+"]/span"; 
			 
			 // System.out.println("PATH1 VALUE"+path1);
			 GenMethods.driver.findElement(By.xpath(path1)).click();
			  
			 //Click on Save to PDF 
			 String saveToPDF = GenMethods.driver.findElement(By.xpath("//li[2][@class='pv-s-profile-actions__overflow-dropdown-item ember-view']")).getAttribute("id");
			 String IdFinal2 = "'"+saveToPDF+"'";
			 
			 System.out.println("IDS FINAL2 VALUE"+IdFinal2);
			  
			 String path2= "//*[@id="+IdFinal2+"]"; 
//			 System.out.println("PATH2 VALUE"+path2);

			 GenMethods.driver.findElement(By.xpath(path2)).click();
			  
			Thread.sleep(4000);

		////
		
		
		 //Download resume with Save As method
        GenMethods.driver.findElement(By.xpath("//*[@id=\"ember41\"]/input")).sendKeys("QA tester");
        GenMethods.driver.findElement(By.xpath("//*[@id=\"ember41\"]/input")).click();

		Thread.sleep(2000);

		WebElement textbox1 = GenMethods.driver.findElement(By.xpath("//*[@id=\"ember41\"]/input"));
		textbox1.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		String clickObJobLink = GenMethods.driver.findElement(By.xpath("//button[@data-vertical='JOBS']")).getAttribute("id");
		String IdFinal3 = "'" + clickObJobLink + "'";

		String path3 = "//*[@id=" + IdFinal3 + "]";
		// System.out.println("PATH2 VALUE"+path2);

		GenMethods.driver.findElement(By.xpath(path3)).click();

		Thread.sleep(4000);

       //Right click on Job Description text
		Actions oAction = new Actions(GenMethods.driver);
		WebElement Webelement = GenMethods.driver.findElement(By.xpath("//*[@id=\"job-details\"]/div[1]/h2"));

		String TEST = Webelement.getText();
		System.out.println("TEXT:" + TEST);

		oAction.contextClick(Webelement).build().perform();

		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

       //Click on Ok in Save as window
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);

		// Handle confirmation box
		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyRelease(KeyEvent.VK_LEFT);

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);

		////
		

		 //Download resume with Save As method
		
//		WebElement Webelement = GenMethods.driver.findElement(By.xpath("//*[@id=\"job-details\"]/div[1]/h2"));
		
		  WebDriverWait wait5 = new WebDriverWait(GenMethods.driver,30);
		  wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"job-details\"]/div[1]/h2")));
		  
		  GenMethods.driver.findElement(By.xpath("//*[@id=\"job-details\"]/div[1]/h2")).click();
		  
		  //Copy resume content
          String resumeText= GenMethods.driver.findElement(By.xpath("//*[@id=\"job-details\"]")).getText();
          System.out.println("RESUME TESXT"+resumeText);
		  
	}
    
}
