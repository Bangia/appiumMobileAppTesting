package tests;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import io.appium.java_client.MobileElement;

public class TestCase6_Explore_Tab extends BaseClass {

	@Test (priority=1)
	public void verify_all_Listing_without_Filter() throws InterruptedException {
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
	
	@Test (priority=2)
	public void validate_categories_based_activity() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.joyscore:id/ll_filter")).click();
		Thread.sleep(3000);
		
		List<MobileElement> ActivityFilter = driver.findElements(By.id("com.joyscore:id/txt_name"));
		System.out.println(ActivityFilter.size());
		
		for (WebElement webElement : ActivityFilter) {
			String GetActivityName = webElement.getText();
			System.out.println(GetActivityName);
			
			}
		
		if (ActivityFilter.size() == 11) {
			Assert.assertEquals(ActivityFilter.size(), 11);
			System.out.println("Test Case Passed !!!");
			Thread.sleep(4000);
			driver.findElement(By.id("com.joyscore:id/ll_back")).click();
		}
		else {
			System.out.println("Test Case Failed !!!");
			Thread.sleep(4000);
			driver.findElement(By.id("com.joyscore:id/ll_back")).click();
		}
		
	}
	
	@Test (priority=3)
	public void validate_searching_working() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Search By results");
		//Took values from base class for dynamic searches
		WebElement SearchBox = driver.findElement(By.id("com.joyscore:id/edt_search"));
		SearchBox.sendKeys(FilterByKeyword);
		
		List<MobileElement> Filter1 = driver.findElements(By.id("com.joyscore:id/txt_name"));
		System.out.println(Filter1.size());
		

		Assert.assertEquals(Filter1.size(), 3);
		Thread.sleep(4000);
		SearchBox.clear();
		Thread.sleep(4000);
		SearchBox.sendKeys(FilterByDate_SpecialCharacters);
		
		
		
		
		
	}
	
	
	
}
