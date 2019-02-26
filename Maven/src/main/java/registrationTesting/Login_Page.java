package registrationTesting;

import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genOps.GenMethods;
//import testData.GenerateData;

public class Login_Page extends GenMethods{

	@BeforeClass
	public void InitializeSuite()
	{
		testBedSetup();
		
	//	testBedSetupLinkedIn();
//		genData = new GenerateData();
	}	

	
	@Test(priority=1)
	public void OutlookLogin() throws InterruptedException 
	{

	Login_Page.txtbx_UserName(driver).sendKeys("amit.r@idsil.com");
	Login_Page.btn_Next(driver).click();
	Thread.sleep(4000);
	
	Login_Page.txtbx_Password(driver).sendKeys("login@1234");
	Login_Page.btn_LogIn(driver).click();

	Thread.sleep(2000);
	
	//Check Don't show this again checkbox
	driver.findElement(By.xpath("//*[@id=\"KmsiCheckboxField\"]")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();

	}
		

/*
	@Test(priority=2)
	public void LJD1() throws InterruptedException 
	{

	Login_Page.txtbx_UserNameL(driver).sendKeys("deepak.chamoli11@gmail.com");

	Thread.sleep(1000);
	
	Login_Page.txtbx_PasswordL(driver).sendKeys("kismat123");

	Thread.sleep(1000);
	
	Login_Page.btn_LogInL(driver).click();

	Thread.sleep(6000);
	
	
	driver.findElement(By.xpath("//*[@id=\"ember41\"]/input")).sendKeys("QA resume");
	driver.findElement(By.xpath("//*[@id=\"ember41\"]/input")).click();

	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//input[@aria-owns='nav-search-artdeco-typeahead-results' and aria-expanded =true and  @data-artdeco-is-focused='true']")).click();

	WebElement textbox = driver.findElement(By.xpath("//*[@id=\"ember41\"]/input"));
	textbox.sendKeys(Keys.ENTER);
	
	Thread.sleep(4000);
	
//    String IdValue =
	
	
	//*[@id="ember862"]/div/div[2]
	
	//*[@id="ember867"]/span/span
	
	//*[@id="ember867"]
	
	//*[@id="ember867"]/span/span
	
    		
	String IdValue =    driver.findElement(By.xpath("//h3[@class='actor-name-with-distance search-result__title single-line-truncate ember-view']")).getAttribute("id");

//	System.out.println("Id VALUE","+IdValue+");
	
//	String s=50+30+"Sachin"+40+40;  
	
	String IdFinal =  "'"+IdValue+"'";
	
	String CanNAME =    driver.findElement(By.xpath("//span[@class='name actor-name']")).getText();	
	System.out.println("CanNAME"+CanNAME);
	
	String path =  "//*[@id="+IdFinal+"]/span/span/span[1]"; 
	
	
	System.out.println("PATH VALUE"+path);
	
//	driver.findElement(By.xpath(path)).click();
	
	driver.findElement(By.xpath(path)).click();
	
	//*[@id="ember1255"]/span
	
	//Get the More button path and click on More button
	String moreButtonId =    driver.findElement(By.xpath("//button[@class='pv-s-profile-actions__overflow-toggle  button-secondary-large-muted mr2 mt2 artdeco-button artdeco-button--muted artdeco-button--2 artdeco-button--secondary ember-view']")).getAttribute("id");
	
	String IdFinal1 =  "'"+moreButtonId+"'";
	
	String path1= "//*[@id="+IdFinal1+"]/span";

	System.out.println("PATH1 VALUE"+path1);

	driver.findElement(By.xpath(path1)).click();

	//Click on Save to PDF
	String saveToPDF =    driver.findElement(By.xpath("//li[3][@class='pv-s-profile-actions__overflow-dropdown-item ember-view']")).getAttribute("id");
	String IdFinal2 =  "'"+saveToPDF+"'";
	
	String path2= "//*[@id="+IdFinal2+"]";

	System.out.println("PATH2 VALUE"+path2);

	driver.findElement(By.xpath(path2)).click();

	//*[@id="ember2091"]
	//*[@id="ember2095"]
	//*[@id="ember2099"]/button/li-icon/svg/path
	//*[@id="ember2099"]/button/li-icon/svg
	//*[@id="ember2099"]/button/li-icon
	
	
	
	//*[@id="ember2509"]/button
	//*[@id="ember2509"]
	
	
	
	//*[@id="ember1255"]
	//*[@id="ember1255"]/span
	
//	driver.findElement(By.xpath("//*[@id=ember933]/span/span/span[1]")).click();
	
	
//	String IdValue1 =    driver.findElement(By.xpath("//a[@class='search-result__result-link ember-view']")).getAttribute("id");
	
  //   System.out.println("data-control-id VALUE"+IdValue);
  //   System.out.println("ID VALUE1"+IdValue1);


     //*[@id="ember869"]/span/span/span[1]
	
//	driver.findElement(By.xpath("//*[@id='+IdValue+']")).click();

	//    driver.findElement(By.xpath("//*[@id=\"+IdValue+\"]")).click();
	
//   String name=  driver.findElement(By.xpath("//*[@id='+IdValue+']/span/span/span[1]")).getText();
   
	//String name=	driver.findElement(By.xpath("//*[@id="+IdValue+"]/span/span/span[1]")).getText();
//	System.out.println("CANDIDATE NAME "+name);
	
 //   driver.findElement(By.xpath("//*[@id="+IdValue+"]/span/span/span[1]")).click();
    
  //*[@id="ember866"]
   
    
  //*[@id="ember862"]/div/div[2]
    
    
  //*[@id="ember862"]/div/div[2]
  //*[@id="ember866"]
    
    
}


	//*[@id="ember863"]/div/div[2]
	//*[@id="ember867"]
	
	//*[@id="ember867"]
	
	
	
/*     
    public static String validateHomeage(WebDriver driver) {

		homeUrl = driver.getCurrentUrl();
		return homeUrl;
	}
  */   
}

