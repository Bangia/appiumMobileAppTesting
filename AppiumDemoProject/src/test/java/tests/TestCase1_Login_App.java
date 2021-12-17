package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.Login_Page_Objects;



public class TestCase1_Login_App extends BaseClass {
	
	
	
//	@Test
//	public void app_download_status() throws InterruptedException {
//		System.out.println("Mobile App & Appium Server Successfully Run !!!");
//		Thread.sleep(5000);
//	}
	
	
	
	//Login app with existing credentials
	@Test (priority=1)
	public void Login_By_Email() throws InterruptedException {
		//Login_Page_Objects lp = new Login_Page_Objects(null);
		Thread.sleep(8000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
		//lp.haveAccount();
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
		Thread.sleep(8000);
		//SignInlink
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
		Thread.sleep(8000);
		//username
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("nitinbangia8@gmail.com");
		//password
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("password1");
		//submit
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.id("com.joyscore:id/img_forward")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/img_forward")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		Thread.sleep(5000);
//		driver.findElement(By.id("com.joyscore:id/img_forward")).click();
		
	String Status = driver.findElement(By.id("com.joyscore:id/txt1")).getText();
		System.out.println(Status);
	if(Status.contains("A new day, a new beginning")) {
		Assert.assertEquals("A new day, a new beginning", Status);
		System.out.println("TEST CASE PASSED !!!");
	}
	else {
		System.out.println("TEST CASE FAILED !!!");
	}
	Thread.sleep(5000);
	
		driver.findElement(By.id("com.joyscore:id/txt_profile")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.joyscore:id/img_setting")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.joyscore:id/rl_logout")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("com.joyscore:id/txt_logout")).click();
	}
	
//	@Test (priority=3)
//	public void Login_By_Gmail() throws InterruptedException {
//		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")).click();
//		Thread.sleep(3000);
//		WebElement gmailEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]"));
//		gmailEmail.click();
//	Assert.assertTrue(false);
//	System.out.println("Unable to Login By gmail");
//	
//	//THIS ALSO NOT WORKING
//	
//	}
	
	
	
	@Test (priority=2, dependsOnMethods = {"Login_By_Email"})
	public void Login_By_Facebook() throws InterruptedException {
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
		Thread.sleep(8000);
		//facebook button click
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[1]")).click();
		
		
		
		String login_failed_message = driver.findElement(By.xpath("/hierarchy/android.widget.Toast")).getText();
		System.out.println(login_failed_message);
		
		
		
		if(login_failed_message.contains("Login Error")) {
			System.out.println("FACEBOOK SIGN IN NOT WORKING HENCE..."+"Test case failed");
			Assert.assertTrue(false);
		}
		else {
			
			System.out.println("Test case Passed !!!");
			Assert.assertTrue(true);
		}
		
	}
	
	
	@Test (priority=4)
	public void LoginForm_Validation() throws InterruptedException {
		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
		//lp.haveAccount();
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
		Thread.sleep(8000);
		//SignInlink
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
		Thread.sleep(8000);
		//username
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("niti");
		//password
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("pass");
			
			String ActualEmailIdMessage = driver.findElement(By.id("com.joyscore:id/txt_email")).getText();
			System.out.println(ActualEmailIdMessage);
			String ActualPasswordMessage = driver.findElement(By.id("com.joyscore:id/txt_password")).getText();
			System.out.println(ActualPasswordMessage);	
			
			if (ActualEmailIdMessage == "Please enter valid email address" && ActualPasswordMessage == "Password length should be 8 digit") {
				System.out.println("Test Case Passed email and password message !!");
				Assert.assertTrue(true);
			}
			else {
				System.out.println("Test Case Failed email and password message not valid !!");
				Assert.assertTrue(false);
			}
	}
	
}

		
	


	
	
//@AfterClass
//public void tearDown(){
//	driver.quit();
//}


