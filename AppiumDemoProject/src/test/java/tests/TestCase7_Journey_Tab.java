package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7_Journey_Tab extends BaseClass {
	// Code to login the App
		@Test(priority =1)
		public void Login_App() throws InterruptedException {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("/hierarchy/android.widget.framelayout/android.widget.linearlayout/android.widget.framelayout/android.widget.linearlayout/android.widget.framelayout/android.widget.relativelayout/android.widget.scrollview/android.widget.relativelayout/android.widget.linearlayout/android.widget.relativelayout[1]/android.widget.edittext")).sendKeys("yogeshjunejaer@gmail.com");
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("yogesh2021");
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]")).click();
			Thread.sleep(8000);
		
			//arrow click
			driver.findElement(By.id("com.joyscore:id/ll_back")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.joyscore:id/ll_back")).click();
			Thread.sleep(3000);
			//Click done
			driver.findElement(By.id("com.joyscore:id/txt_submit")).click();
			Thread.sleep(8000);
			driver.findElement(By.id("com.joyscore:id/txt_journey")).click();
			Thread.sleep(8000);
			//arrow click
					driver.findElement(By.id("com.joyscore:id/ll_back")).click();
					Thread.sleep(3000);
					driver.findElement(By.id("com.joyscore:id/ll_back")).click();
					Thread.sleep(3000);
		}
		
		//click on journey Tab
		    @Test(priority=2)
			public void Journey_Tab() throws InterruptedException {
										
			//Check the Image
			driver.findElement(By.id("com.joyscore:id/img1"));
			Thread.sleep(8000);
			WebElement TabIcon = driver.findElement(By.id("com.joyscore:id/img1"));
			
			if (TabIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("Image is displayed properly !!");
				//driver.findElement(By.id("com.joyscore:id/img_close")).click();
				
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Image is Not displayed !!");	
				
			}
			
			// "start" text display
			Thread.sleep(3000);
			String StartText= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).getText();
			System.out.println(StartText + " is displayed");
			
			// "now" text display
			Thread.sleep(3000);
			String NowText= driver.findElement(By.id("com.joyscore:id/txt_now")).getText();
			System.out.println(NowText + " is displayed");
			
			//"Oneweek" text display
			Thread.sleep(3000);
			String OneWeekText= driver.findElement(By.id("com.joyscore:id/txt_oneweek")).getText();
			System.out.println( OneWeekText   + " is displayed");
			
			//"TwoWeek text display
			Thread.sleep(3000);
			String TwoWeekText= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[4] ")).getText();
			System.out.println(TwoWeekText + " is displayed");
			
			//"month" text display
			Thread.sleep(3000);
			String Month= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[5]")).getText();
			System.out.println(Month + " is displayed");
			
			
			//To check whether Joyscore points are displayed
			Thread.sleep(8000);
			String Jspoints= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")).getText();
			
		    if (Jspoints != null)
		    		{		
		    	System.out.println( "Joyscore points are displayed");
		    		}
		    else 
		    {
		    	System.out.println( "Joyscore points are not displayed");
		    }
		    
		    
		    // mind option is available
		    Thread.sleep(8000);
			String Mind= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView  ")).getText();
			System.out.println(Mind + " is displayed");
			
			
			// mind icon is available
			Thread.sleep(8000);
			WebElement MindIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView "));
			
			if (MindIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("Mind Icon is displayed!!");
					
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Mind Icon is Not displayed !!");	
				
			}
			
			    
			//Body option is available
			Thread.sleep(8000);
			String Body= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView ")).getText();
			System.out.println(Body + " is displayed");
			
			
			//Body Icon is displayed
			Thread.sleep(8000);
			WebElement BodyIcon = driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView  "));
			
			if (BodyIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("Body Icon is displayed !!");
				//driver.findElement(By.id("com.joyscore:id/img_close")).click();
				
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Body Icon is Not displayed !!");	
				
			}
			
			
			// Life option is available
			Thread.sleep(8000);
			String Sleep= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView")).getText();
			System.out.println(Sleep + " is displayed");
			
		    
		    // Life Icon is displayed
			Thread.sleep(8000);
			WebElement LifeIcon = driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView  "));
			
			if (LifeIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("Life Icon is displayed !!");
				//driver.findElement(By.id("com.joyscore:id/img_close")).click();
				
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Life Icon is Not displayed !!");	
				
			}
		    
		  	  		
		  // To check edit button adjacent to mind, body and life is clickable
		  		Thread.sleep(8000);
				driver.findElement(By.id ("com.joyscore:id/img_edit")).click();
				Thread.sleep(8000);
				String Edit= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")).getText();
				
				if ( Edit != null ) {
					Assert.assertTrue(true);
					System.out.println("Edit button adjacent to mind, body and life is clicked");
							
				}
				else {
					Assert.assertTrue(false);
				System.out.println("Edit button adjacent to mind, body and life is not clicked");	
					
				}
				Thread.sleep(8000);
				driver.findElement(By.id ("com.joyscore:id/rl_apply")).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")).click();
				
				//"Your activity history" display
		  		Thread.sleep(8000);
		  		String ActivityHistory= driver.findElement(By.xpath ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1] ")).getText();
		  		System.out.println(ActivityHistory + " is displayed");
		   		Thread.sleep(8000);
		   		
			    // To check the Calendar icon
			WebElement Calendar = driver.findElement(By.id("com.joyscore:id/img2"));
			if (Calendar.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("Calendar Icon is displayed!!");
						
			     }
			else 
			     {
				Assert.assertTrue(false);
				System.out.println("Calendar Icon is Not displayed!!");	
				 }
					
		    // To check whether "Browse through your activity history" label is clickable
			Thread.sleep(8000);
			driver.findElement(By.xpath ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1] ")).click();
			Thread.sleep(8000);
			String Link= driver.findElement(By.id("com.joyscore:id/txt_date")).getText();
			
			if ( Link != null ) {
				Assert.assertTrue(true);
				System.out.println("Browse through your activity history/Calender - Link is clicked and activity history is shown");
						
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Browse through your activity history/Calendar -Link is not clicked");	
				
			}
			
			driver.findElement(By.xpath ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")).click();		
			Thread.sleep(8000);
			
			// "Your story so far" is displayed
			String Story= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).getText();
			System.out.println(Story + " is displayed");
			
			//"You have been on this journey for"  text & logo display
			Thread.sleep(8000);
			WebElement StoryIcon = driver.findElement(By.id("com.joyscore:id/img3"));
			if (StoryIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("You've been on this journey for- Icon is displayed!!");
								}
			else 
			{
				Assert.assertTrue(false);
				System.out.println("You've been on this journey for- Icon is Not displayed!!");	
					}
			Thread.sleep(3000);
			
			String Text1_Story= driver.findElement(By.xpath(" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1] ")).getText();
			System.out.println( Text1_Story   + " is displayed");
			
			
			// "The area you've improved the most" text and logo display
			Thread.sleep(8000);
			WebElement ImproveIcon = driver.findElement(By.id("com.joyscore:id/img4"));
			if (ImproveIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("The area you've improved the most - Icon is displayed!!");
								}
			else 
			{
				Assert.assertTrue(false);
				System.out.println("The area you've improved the most- Icon is Not displayed!!");	
					}
			Thread.sleep(3000);
			
			String Text2_Story= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
			System.out.println( Text2_Story   + " is displayed");

			// "The activity type you enjoy the most" text and logo display
			Thread.sleep(8000);
			WebElement ActivityEnjoyIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.ImageView "));
			if (ActivityEnjoyIcon.isDisplayed() ) {
				Assert.assertTrue(true);
				System.out.println("The activity type you enjoy the most - Icon is displayed!!");
								}
			else 
			{
				Assert.assertTrue(false);
				System.out.println("The activity type you enjoy the most- Icon is Not displayed!!");	
					}
			Thread.sleep(3000);
			
			String Text3_Story= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
			System.out.println( Text3_Story   + " is displayed");
					Thread.sleep(8000);
			
	}      
	}

