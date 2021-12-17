package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TestCase2_SignUp_App extends BaseClass {
	

	@Test
	public void app_download_status() throws InterruptedException {
		System.out.println("Mobile App & Appium Server Successfully Run !!!");
		Thread.sleep(5000);
	}
	

	@Test
	public void SignUp_New_Account() throws InterruptedException {
		Thread.sleep(8000);
		//for i am new account
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		Thread.sleep(5000);
		//continue
		driver.findElement(By.id("com.joyscore:id/rl_submit")).click();
		Thread.sleep(5000);
		//continue
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
		Thread.sleep(5000);
		//continue
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")).click();
		Thread.sleep(5000);
		//begin
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
		Thread.sleep(5000);
	//Horizontal scrolling / Range slider code starts here....
		
		//*********************FITNESS CODE STARTS HERE *********************
		//Creativity
		WebElement obj = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		TouchAction action = new TouchAction((MobileDriver)driver);
		//action.longPress(obj,250,250)
		action.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,250,250)).release().perform();
		
		
		//Mindfullness
		WebElement obj2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		//TouchAction action = new TouchAction((MobileDriver)driver);
		//action.longPress(obj,250,250)
		action.longPress(ElementOption.element(obj2)).moveTo(ElementOption.element(obj2,250,250)).release().perform();
		
		//Learning
		
		WebElement obj3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		//TouchAction action = new TouchAction((MobileDriver)driver);
		//action.longPress(obj,250,250)
		action.longPress(ElementOption.element(obj3)).moveTo(ElementOption.element(obj3,250,250)).release().perform();
	
		
		//continue Click
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		
		//*********************BODY CODE STARTS HERE *********************
		Thread.sleep(8000);
		//Sleep
		WebElement obj4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		action.longPress(ElementOption.element(obj4)).moveTo(ElementOption.element(obj4,250,250)).release().perform();
		
		
		//Nutrtion
		WebElement obj5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		action.longPress(ElementOption.element(obj5)).moveTo(ElementOption.element(obj5,250,250)).release().perform();
		
		//fitness
		WebElement obj6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		action.longPress(ElementOption.element(obj6)).moveTo(ElementOption.element(obj6,250,250)).release().perform();
		
		//continue Click
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		
		//*********************LIFE CODE STARTS HERE *********************
		Thread.sleep(8000);
		
		WebElement obj7 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		action.longPress(ElementOption.element(obj7)).moveTo(ElementOption.element(obj7,250,250)).release().perform();
		
		
		//Nutrtion
		WebElement obj8 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		action.longPress(ElementOption.element(obj8)).moveTo(ElementOption.element(obj8,250,250)).release().perform();
		
		//fitness
		WebElement obj9 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout[2]/android.widget.SeekBar"));
		Thread.sleep(8000);
		action.longPress(ElementOption.element(obj9)).moveTo(ElementOption.element(obj9,250,250)).release().perform();
		
		//continue Click
		Thread.sleep(5000);
		driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
		
		//****************** MIND SCROLLER CODE STARTS HERE ******************
		
		Thread.sleep(8000);
		
		//scroller 
				WebElement Panel = driver.findElement(By.id("com.joyscore:id/animation_view"));
				swipe(Panel, driver);
				
				
				
		
		//continue button
		driver.findElement(By.id("com.joyscore:id/rl_submit")).click();
		Thread.sleep(8000);
		
		
		
		
		//Sign up link click
		
		driver.findElement(By.id("com.joyscore:id/txt_signup")).click();
		Thread.sleep(5000);
		
		//Sign up form
		
		//Name
		driver.findElement(By.id("com.joyscore:id/edt_name")).sendKeys(dummyName());
		Thread.sleep(3000);
		//Email
		driver.findElement(By.id("com.joyscore:id/edt_email")).sendKeys(dummyName()+"@gmil.com");
		Thread.sleep(3000);
		//Password
		driver.findElement(By.id("com.joyscore:id/edt_password")).sendKeys(dummyPassword());
		Thread.sleep(3000);
		//Continue link
		driver.findElement(By.id("com.joyscore:id/rl_submit")).click();
		
		Thread.sleep(5000);
		
		String ActualalreadyRegisteredUser = driver.findElement(By.id("com.joyscore:id/txt_dialogmsg")).getText();
		
		
		if(ActualalreadyRegisteredUser != "Email already exists.") {
			driver.findElement(By.id("com.joyscore:id/img_forward")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.joyscore:id/img_forward")).click();
			Thread.sleep(3000);
			//Done Button
			driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
			
			String SuccessMessage = driver.findElement(By.id("com.joyscore:id/txt1")).getText();
			System.out.println(SuccessMessage);
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
			System.out.println(ActualalreadyRegisteredUser +"Email id already registered Failed");
			//click ok button
			driver.findElement(By.id("com.joyscore:id/btn_ok")).click();
			Thread.sleep(3000);
			driver.quit();
		}
		
		
		
		driver.quit();
		
	}
	
	
	//Separate method for swipe
	
	public void swipe(WebElement el, WebDriver driver) {
		WebElement Panel = el;
		Dimension dimension = Panel.getSize();
		
		int Anchor = Panel.getSize().getHeight();
		
		Double ScreemWidthStart = dimension.getWidth()*0.9;
		int scrollStart = ScreemWidthStart.intValue();
		
		Double ScreemWidthEnd = dimension.getWidth()*0.1;
		int scrollEnd = ScreemWidthEnd.intValue();
		
		//Scroll 1
		new TouchAction((PerformsTouchActions)driver)
		.press(PointOption.point(scrollStart,Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(scrollEnd,Anchor)).release().perform();
		//Scroll 2
		new TouchAction((PerformsTouchActions)driver)
		.press(PointOption.point(scrollStart,Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(scrollEnd,Anchor)).release().perform();
		//Scroll 3
		new TouchAction((PerformsTouchActions)driver)
		.press(PointOption.point(scrollStart,Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(scrollEnd,Anchor)).release().perform();
		
	}
	
}
