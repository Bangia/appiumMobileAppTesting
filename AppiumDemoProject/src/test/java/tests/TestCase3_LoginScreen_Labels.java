package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3_LoginScreen_Labels extends BaseClass {

	
	@Test
	public void verifyHomePageLabels() {
		
		String ActualtitleLabel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")).getText();
		System.out.println(ActualtitleLabel);
		
		String expectedtitleLabel = "Welcome to JoyScore";
		
		if (ActualtitleLabel.contains(expectedtitleLabel)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
	}
	
	@Test
	public void verifyLogoDispalyed() {
		
		Boolean logoDisplayed = driver.findElement(By.id("com.joyscore:id/img1")).isDisplayed();
		
	if (logoDisplayed == true) {
		Assert.assertTrue(true);
		System.out.println("LOGO OF JOY SCORE DISPLAYED !!!");
	}
	else {
		Assert.assertTrue(false);
		System.out.println("LOGO OF JOY SCORE NOT DISPLAYED !!!");
	}
		
		
		
	}
	
	@Test
	public void verifyCreate_LoginLabels() throws InterruptedException {
		Thread.sleep(8000);
		String ActualLoginLabel = driver.findElement(By.id("com.joyscore:id/txt_submit")).getText();
		System.out.println(ActualLoginLabel);
		
		String expectedLoginLabel = "I’m a new user";
		
		Assert.assertEquals(expectedLoginLabel, ActualLoginLabel);
		
		
		Thread.sleep(8000);
		String actualCreateAccountLabel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).getText();
		System.out.println(actualCreateAccountLabel);
		
		String expectedCreateAccountLabel = "I have an account";

		Assert.assertEquals(expectedCreateAccountLabel, actualCreateAccountLabel);
		
		
		
	}
	
	
	
}
