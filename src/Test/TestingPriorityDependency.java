package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingPriorityDependency {
	
	public WebDriver drv;
	
	@BeforeTest
	public void TestInitiation()
	{
		drv = new FirefoxDriver();
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
  @Test(priority=1,dataProviderClass=CommonData.class,dataProvider="LoginInfo")
  public void LoginToApplication(String UserName,String Password) {
	  
	  drv.get("https://eprescribeint.allscripts.com/");
	  drv.findElement(By.cssSelector("#txtUserName")).clear();
	  drv.findElement(By.cssSelector("#txtPassword")).clear();
	  
	  drv.findElement(By.cssSelector("#txtUserName")).sendKeys(UserName);
	  drv.findElement(By.cssSelector("#txtPassword")).sendKeys(Password);
	  
	  drv.findElement(By.cssSelector("#btnLogin")).click();
	  
  }
  
  @Test(priority=2,dependsOnMethods="LoginToApplication")
  public void AddPatient() {
	  
//	 drv.findElement(By.xpath("//input[contains(@name,'btnAddPatient')]")).click();
	  
  }
  
  @Test(priority=3,dependsOnMethods={"AddPatient","LoginToApplication"})
  public void Logout()
  {
	  drv.findElement(By.xpath("//img[@id='logoutIcon']")).click();
	  drv.quit();
  }
}
