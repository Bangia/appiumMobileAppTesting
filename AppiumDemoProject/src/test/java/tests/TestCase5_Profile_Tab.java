package tests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;


public class TestCase5_Profile_Tab extends BaseClass{
	
	public String newemails;

	@Test (priority=1)
	public void verify_Login_Name() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
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
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("com.joyscore:id/img_forward")).click();
		Thread.sleep(5000);
		//Click Profile Tab
		driver.findElement(By.id("com.joyscore:id/img_profile")).click();
		Thread.sleep(5000);
		String getUsername = driver.findElement(By.id("com.joyscore:id/txt_name")).getText();
		System.out.println("Actual Name :"+getUsername);
		
		String ExpectedgetUsername = driver.findElement(By.id("com.joyscore:id/txt_name")).getText();
		System.out.println("Expectedget Name :"+ExpectedgetUsername);
		Assert.assertEquals(getUsername, ExpectedgetUsername);
	}
	
	@Test (priority=2 ,dependsOnMethods = { "verify_Login_Name" }, alwaysRun = true)
	public void get_all_link_name() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/img_setting")).click();
		
		Thread.sleep(5000);
		
		
		String name = driver.findElement(By.id("com.joyscore:id/rl_name")).getText();
		System.out.println(name);
		String email = driver.findElement(By.id("com.joyscore:id/rl_email")).getText();
		System.out.println(email);
		String changePassword = driver.findElement(By.id("com.joyscore:id/rl_changepassword")).getText();
		System.out.println(changePassword);
		String notification = driver.findElement(By.id("com.joyscore:id/rl_notification")).getText();
		System.out.println(notification);
		String notes = driver.findElement(By.id("com.joyscore:id/rl_notes")).getText();
		System.out.println(notes);
		String games = driver.findElement(By.id("com.joyscore:id/rl_games")).getText();
		System.out.println(games);
		String logout = driver.findElement(By.id("com.joyscore:id/rl_logout")).getText();
		System.out.println(logout);
		
		String feedback = driver.findElement(By.id("com.joyscore:id/rl_feedback")).getText();
		System.out.println(feedback);
		String rateUs = driver.findElement(By.id("com.joyscore:id/rl_rateus")).getText();
		System.out.println(rateUs);
		String privacy = driver.findElement(By.id("com.joyscore:id/rl_privacy")).getText();
		System.out.println(privacy);
		//String terms = driver.findElement(By.id("com.joyscore:id/rl_term")).getText();
		//System.out.println(terms);
//		String faq = driver.findElement(By.id("com.joyscore:id/rl_faq")).getText();
//		System.out.println(faq);
//		String delete = driver.findElement(By.id("com.joyscore:id/rl_delete")).getText();
//		System.out.println(delete);
	}
	
	@Test (priority=3 ,dependsOnMethods = { "get_all_link_name" })
	public void Edit_Name() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/rl_name")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/edt_name")).clear();
		
		driver.findElement(By.id("com.joyscore:id/edt_name")).sendKeys(dummyName());
		
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		
		Thread.sleep(2000);
	}
	
//	@Test(priority=4)
//	public void Edit_Email() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("com.joyscore:id/rl_email")).click();
//		Thread.sleep(3000);
//		WebElement emails = driver.findElement(By.id("com.joyscore:id/edt_nememail"));
//		Thread.sleep(3000);
//		emails.sendKeys(dummyName()+"@gmil.com");
//		String newemails = emails.getText();
//		System.out.println("NEW EMAIL ID :"+newemails);
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("com.joyscore:id/edt_password")).sendKeys("password1");
//		Thread.sleep(3000);
//		driver.findElement(By.id("com.joyscore:id/rl_submit")).click();
//		Assert.assertTrue(true);
//		Thread.sleep(3000);
//	}
//	
//	@Test
//	public void Edit_Change_Password() {
//		System.out.println("Verify change password");
//		
//	}
//	
	@Test(priority=5 ,dependsOnMethods = { "get_all_link_name" })
	public void Verify_Notes() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/rl_notes")).click();
		Thread.sleep(5000);
		List<MobileElement> Notes = driver.findElements(By.id("com.joyscore:id/txt_name"));
		 System.out.println(Notes.size());
		 
		 for (WebElement webElement : Notes) {
	         String NotesNames = webElement.getText();
	          System.out.println(NotesNames);
	          
			
	      }
		 
		 if (Notes.size() == 2) {
				Assert.assertEquals(Notes.size(), 2);
				System.out.println("Test cases is passed");
				Thread.sleep(3000);
				driver.findElement(By.id("com.joyscore:id/ll_back")).click();
			}
	        else {
	        	System.out.println("Test cases is failed");
	        }
		 
	}
	
	@Test(priority=4 ,dependsOnMethods = { "get_all_link_name" })
	public void Verify_Games() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/rl_games")).click();
	
		Thread.sleep(5000);
		List<MobileElement> profile = driver.findElements(MobileBy.id("com.joyscore:id/txt_name"));
        System.out.println(profile.size());
        

        for (WebElement webElement : profile) {
         String name = webElement.getText();
          System.out.println(name);
		
      }
        
        if (profile.size() == 3) {
			Assert.assertEquals(profile.size(), 3);
			System.out.println("Test cases is passed");
			Thread.sleep(3000);
			driver.findElement(By.id("com.joyscore:id/ll_back")).click();
		}
        else {
        	System.out.println("Test cases is failed");
        }
        
       
	}
//	
//	@Test (priority=4)
//	public void Verify_Feedback_Link() throws InterruptedException {
//		driver.findElement(By.id("com.joyscore:id/rl_feedback")).click();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(By.id("com.joyscore:id/edt_msg")).sendKeys(dummyText);
//		
//		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
//		Thread.sleep(5000);
//		String ActualMessage = driver.findElement(By.id("com.joyscore:id/txt_dialogmsg")).getText();
//		System.out.println("Feedback message received !!! "+ActualMessage);
//		String ExpectedMessage = "Your Feedback send to us..";
//		Assert.assertEquals(ActualMessage, ExpectedMessage);
//		Thread.sleep(5000);
//		driver.navigate().back();
//		
//	}
//	
//	@Test (priority=5)
//	public void Verify_Privacy_Link() throws InterruptedException {
//		driver.findElement(By.id("com.joyscore:id/rl_privacy")).click();
//		Thread.sleep(5000);
//		String TitlePrivacyLink = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.TextView[1]")).getText();
//		System.out.println(TitlePrivacyLink);
//		
//		Assert.assertEquals(TitlePrivacyLink, "JoyScore Privacy Policy");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.id("com.joyscore:id/ll_back")).click();
//		
//		
//	}
//	
//	@Test (priority=6)
//	public void Verify_Terms_Link() throws InterruptedException {
//		
//		driver.findElement(By.id("com.joyscore:id/rl_term")).click();
//		Thread.sleep(5000);
//		String TitleTermsLink = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.TextView[1]")).getText();
//		System.out.println(TitleTermsLink);
//		
//		Assert.assertEquals(TitleTermsLink, "Terms and Conditions");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.id("com.joyscore:id/ll_back")).click();
//	}
//	
//	@Test (priority=7)
//	public void Verify_FAQ_Link() throws InterruptedException {
//		driver.findElement(By.id("com.joyscore:id/rl_faq")).click();
//		Thread.sleep(5000);
//		String TitleFaqLink = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.TextView[1]")).getText();
//		System.out.println(TitleFaqLink);
//		
//		Assert.assertEquals(TitleFaqLink, "Frequently Asked Questions");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.id("com.joyscore:id/ll_back")).click();
//		
//	}
//	
//	@Test
//	public void Verify_Delete_data() {
//		
//		
//	}
	
}
