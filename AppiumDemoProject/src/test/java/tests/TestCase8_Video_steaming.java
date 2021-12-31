package tests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestCase8_Video_steaming extends BaseClass {

	@Test(priority = 1)
	public void validate_video_displayed() throws InterruptedException {
		
		
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
			driver.findElement(By.id("com.joyscore:id/img_explore")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("com.joyscore:id/ll_back")).click();
			
			//code to get category & name
			
			List<MobileElement> NameCategory = driver.findElements(By.id("com.joyscore:id/txt_name"));
			System.out.println("Products Names : "+NameCategory.size());
			

			
			for (WebElement webElement : NameCategory) {
		         String FilterNames = webElement.getText();
		          System.out.println(FilterNames);
		          
				
		      }
		}
	
	
	@Test(priority=2, dependsOnMethods = {"validate_video_displayed"})
	public void validate_Audio() throws InterruptedException {
		Thread.sleep(4000);
		WebElement playicon = driver.findElement(By.id("com.joyscore:id/img_play"));
		System.out.println(playicon.getSize());
		Thread.sleep(4000);
		
		

			if(driver.findElement(By.id("com.joyscore:id/ll_play")).isDisplayed()) {
	  			driver.findElement(By.id("com.joyscore:id/ll_play")).click();
	  			Thread.sleep(3000);
	  			driver.findElement(By.id("com.joyscore:id/rl_submit")).click();
	  			Thread.sleep(3000);
	  			driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
	  		}
	  		else if(driver.findElement(By.id("com.joyscore:id/ll_play")).isDisplayed()) {
	  			driver.findElement(By.id("com.joyscore:id/ll_play")).click();
	  			Thread.sleep(3000);
	  		}
	  		else {
	  			System.out.println("Nothing to display !!!");
	  		}
	  		
			
	      }
		}
		
			
			
		
	          
		
		
		
		
	
		
	
	

