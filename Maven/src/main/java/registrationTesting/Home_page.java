package registrationTesting;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.text.SimpleDateFormat;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

import genOps.GenMethods;
import net.sourceforge.htmlunit.corejs.javascript.ast.VariableDeclaration;

public class Home_page {
	private static WebElement element = null;

	static String homeUrl;

	public static String mpath;
	
	@Test(priority=1)
	public void OutlookHome() throws InterruptedException 
	{
		GenMethods.validateHomeage(GenMethods.driver);
		GenMethods.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	//Search Job Description Email in Inbox
	@Test(priority=2)
	public void OutlookJobDetails() throws InterruptedException
	{ 

	//Click on Search button
//	GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/button/span[1]")).click();

WebDriverWait wait = new WebDriverWait(GenMethods.driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/button/span[1]")));
GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/button/span[1]")).click();
	
	
//WebElement locator = GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/button/span[1]"));

WebDriverWait wait1 = new WebDriverWait(GenMethods.driver,30);
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/form/div/input")));
GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/form/div/input")).sendKeys("Job Description");
	
	
    //Search with Job Title
//	GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/form/div/input")).sendKeys("Job Description");

	GenMethods.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  WebElement searchTextfielsEnter =
	  GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/form/div/input"));
	  searchTextfielsEnter.sendKeys(Keys.ENTER);
	
	GenMethods.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    //Click on First Job Description title 
	String moreButtonId10 =    GenMethods.driver.findElement(By.xpath("//div[@data-convid='AAQkAGFmYWFlOGEwLWYzYzgtNDZiOS05YTJiLWM2MjQ2YmU5YWQxYwAQAKLX5jM7W31GhLOquSFsiYs=']")).getAttribute("id");
	String IdFinal10 =  "'"+moreButtonId10+"'";
	String path10= "//*[@id="+IdFinal10+"]/div[2]";

//	System.out.println("PATH10 VALUE"+path10);

	GenMethods.driver.findElement(By.xpath(path10)).click();

	GenMethods.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
//Click on JobDetail.docx resume
GenMethods.driver.findElement(By.xpath("//*[@id=\"primaryContainer\"]/div[4]/div/div[1]/div/div[4]/div[3]/div/div[5]/div[1]/div/div/div[3]/div[2]/div[2]/div[6]/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[8]/div/div[1]/div[2]/div/div/table/tbody/tr/td/div/div/div[2]/a")).click();
                                        
//	GenMethods.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//Click on Edit and copy link
//	GenMethods.driver.findElement(By.xpath("//*[@id=\"_ariaId_268\"]")).click();
	
/*	
	String moreButtonId11 =    GenMethods.driver.findElement(By.xpath("//span[@class='_fc_4 o365buttonLabel _fc_2']")).getAttribute("id");
	String IdFinal11 =  "'"+moreButtonId11+"'";
	String path11= "//*[@id="+IdFinal11+"]";

	System.out.println("PATH11 VALUE"+path11);
	GenMethods.driver.findElement(By.xpath(path11)).click();
*/
//	/html/body/div[15]/div/div/div[2]/div[7]/div[1]/button/span[1]
			
//	String path10= "//*[@id="+IdFinal11+"]/div[2]";

GenMethods.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	//Click on Edit and Reply button
//	WebDriverWait waitEditandreply = new WebDriverWait(GenMethods.driver,30);
//	waitEditandreply.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Edit and reply')]")));

try 
{
    boolean editEnabled = GenMethods.driver.findElement(By.xpath("//button[contains(.,'Edit and reply')]")).isEnabled();
	boolean editDispalyed = GenMethods.driver.findElement(By.xpath("//button[contains(.,'Edit and reply')]")).isDisplayed();
	
   //editReply.isDisplayed();
	if (editEnabled==true && editDispalyed==true)
         {
    	GenMethods.driver.findElement(By.xpath("//button[contains(.,'Edit and reply')]")).click();
         }
}

catch(ElementClickInterceptedException e1 )
{
    System.out.println("ElementClickInterceptedException occurs");  
}

catch(ElementNotVisibleException e2 )
{
    System.out.println("ElementNotVisibleException occurs");  
	
}

catch(NoSuchElementException e3 )
{
    System.out.println("NoSuchElementException occurs");  
}


try{
    boolean editContinue = GenMethods.driver.findElement(By.xpath("//button[contains(.,'Continue editing')]")).isEnabled();
	boolean continueDispalyed = GenMethods.driver.findElement(By.xpath("//button[contains(.,'Continue editing')]")).isDisplayed();

//    WebElement contEditing = 	GenMethods.driver.findElement(By.xpath("//button[contains(.,'Continue editing')]"));
//    contEditing.isDisplayed();
 	
//	  if(contEditing.isDisplayed())
	if (editContinue==true && continueDispalyed==true)
	  {
		  GenMethods.driver.findElement(By.xpath("//button[contains(.,'Continue editing')]")).click();
	  }	

}
catch(ElementClickInterceptedException e4 )
{
    System.out.println("ElementClickInterceptedException occurs");  
}

catch(ElementNotVisibleException e5 )
{
    System.out.println("ElementNotVisibleException occurs");  
	
}

catch(NoSuchElementException e6 )
{
    System.out.println("NoSuchElementException occurs");  
}

	  GenMethods.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

  
	  
/*	//*[@id="WACViewPanel_EditingElement"]/p/span[1]
 	//*[@id="WACViewPanel_EditingElement"]/p/span[1]

	WebDriverWait waitContinueediting = new WebDriverWait(GenMethods.driver,30);
	waitContinueediting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Continue editing')]")));
	
	GenMethods.driver.findElement(By.xpath("//button[contains(.,'Continue editing')]")).click();	
*/	
	//Get the Job Title from email
//	WebDriverWait getJobTitle = new WebDriverWait(GenMethods.driver,30);
//	getJobTitle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='WACViewPanel_EditingElement']/p/span[1]/span")));
	
	  
	
/*	  
	  if(GenMethods.driver.getPageSource().contains("QA resume"))
	  {
		  System.out.println("JOB TITLE DONE");
	  }

*/	
	  
//String jobTitle = GenMethods.driver.findElement(By.xpath("//*[@id=\"PageContentContainer\"]/div/div[1]/div/div[1]")).getAttribute("class");
//System.out.println("JOB TITLE:"+jobTitle);
	  
//	  <span class="NormalTextRun" style="background-color: inherit;">QA resume</span>

	//*[@id="WACViewPanel_EditingElement_WrappingDiv"]
	//*[@id="WACViewPanel_EditingElement"]

	  //RIGHT
	  
/*	  
WebDriverWait waitTitle = new WebDriverWait(GenMethods.driver,80);
waitTitle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"WACViewPanel_EditingElement\"]/p")));
	  
try{
    boolean editjobText = GenMethods.driver.findElement(By.xpath("//*[@id=\"WACViewPanel_EditingElement\"]/p")).isEnabled();
	boolean displayText = GenMethods.driver.findElement(By.xpath("//*[@id=\"WACViewPanel_EditingElement\"]/p")).isDisplayed();

	if (editjobText==true && displayText==true)
     {
String title= GenMethods.driver.findElement(By.xpath("//*[@id=\"WACViewPanel_EditingElement\"]/p")).getText();
System.out.println("JOB TITLE:"+title);

     }
}

	catch(NoSuchElementException e7 )
{
  System.out.println("NoSuchElementException occurs");  
}
*/
	
//RIGHT END

//String jobTitle = 	GenMethods.driver.findElement(By.xpath("//button[contains(.,'Continue editing')]")).getText();
	
//	String jobTitle = 	GenMethods.driver.findElement(By.xpath("//*[@id=\"PageContentContainer\"]/div/div[1]/div/div[1]/div[1]/div/p/span[1]/span")).getText();
 //   System.out.println("JOB TITLE:"+jobTitle);
    
	}
/*
	<span class="NormalTextRun" style="background-color: inherit;">QA resume</span>


	
	public static void lnk_LogOut(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		// return element;

	}
*/
}
