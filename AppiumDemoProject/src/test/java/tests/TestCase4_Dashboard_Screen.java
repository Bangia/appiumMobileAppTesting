package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4_Dashboard_Screen extends BaseClass {

	//Code to Login & Move dashBoard screen
		@Test  (priority=1)
		public void Login_By_Email() throws InterruptedException {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("akki12@gmail.com");
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("akki1234");
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
			
			//click cross icon
			driver.findElement(By.id("com.joyscore:id/img_forward")).click();
			
			String ActualDashBoardScreenTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]")).getText();
			System.out.println(ActualDashBoardScreenTitle);
			
			String ExpectedDashBoardScreenTitle = "Are you ready?";
			
			Assert.assertEquals(ActualDashBoardScreenTitle, ExpectedDashBoardScreenTitle);
			
		
		}
		
		
//		@Test (priority=2)
//		public void validate_BottomMenus_label_name() throws InterruptedException {
//			Thread.sleep(8000);
//			Boolean Actual_label_A = driver.findElement(By.id("com.joyscore:id/img_home")).isEnabled();
//			System.out.println(Actual_label_A);
//			Boolean Actual_label_B = driver.findElement(By.id("com.joyscore:id/img_journey")).isDisplayed();
//			System.out.println(Actual_label_B);
//			Boolean Actual_label_C = driver.findElement(By.id("com.joyscore:id/img_explore")).isDisplayed();
//			System.out.println(Actual_label_C);
//			Boolean Actual_label_D = driver.findElement(By.id("com.joyscore:id/img_profile")).isDisplayed();
//			System.out.println(Actual_label_D);
//			
//			if(Actual_label_A == true && Actual_label_B == true && 
//					Actual_label_C == true && Actual_label_D == true) {
//				
//				Assert.assertTrue(true);
//				
//			}
//			else {
//				Assert.assertTrue(false);
//			}
//			
//		
//			
//			
//		}
		
		
		
//		@Test(priority=3)
//		public void Validate_Today_essentials(){
//			System.out.println("Validate_Today_essentials Listing");
//			
//		}
		
		@Test(priority=4)
		public void Validate_Points_Streess_HowFeeling_Links_clickable(){
			System.out.println("Validate_Points_Streess_HowFeeling_Links_clickable");
			
		}
		
		@Test(priority=5)
		public void Hamburger_Menu() throws InterruptedException{
			Thread.sleep(5000);
			System.out.println("Hamburger_Menu");
			driver.findElement(By.id("com.joyscore:id/img_menu")).click();
			
			//validate icon clickable or not
			
			WebElement addUserIcon = driver.findElement(By.id("com.joyscore:id/img_adduser"));
			WebElement addNotesIcon = driver.findElement(By.id("com.joyscore:id/img_notes"));
			WebElement addGamesIcon = driver.findElement(By.id("com.joyscore:id/img_games"));
			
			if (addUserIcon.isDisplayed() && addNotesIcon.isDisplayed() && addGamesIcon.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Icon is displayed properly !!");
				driver.findElement(By.id("com.joyscore:id/img_close")).click();
				
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Icon is Not displayed!!");	
				driver.findElement(By.id("com.joyscore:id/img_close")).click();
			}
			
		}
		
//		@Test(priority=6)
//		public void Bottom_Menu_Clicked_Operations() throws InterruptedException{
//			Thread.sleep(8000);
//			System.out.println("Hamburger_Menu");
//			
//			WebElement Journey_Menu = driver.findElement(By.id("com.joyscore:id/img_journey"));
//			Journey_Menu.click();
//			Thread.sleep(3000);
//			//Unwanted pop up
//			
//			WebElement arrows = driver.findElement(By.id("com.joyscore:id/img_forward"));
//			Thread.sleep(3000);
//			if (arrows.isDisplayed()) {
//				arrows.click();
//				Thread.sleep(3000);
//				arrows.click();
//			}
//			else {
//				Thread.sleep(3000);
//				
//				if (Journey_Menu.isEnabled()) {
//					//System.out.println("Journey link is Clickable !!! & Bottom menu activated for Journey link !!!");
//					Assert.assertTrue(true, "Test case passed");
//					
//					Thread.sleep(3000);
//					driver.navigate().back();
//				}
//				else {
//					//System.out.println("Joureny link is not displayed !!!");
//					Assert.assertTrue(false,"Test case failed");
//					
//				}
//				
//			}
//			
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			
//			//Explore  bottom menu
//			//Unwanted cross icon by.id(com.joyscore:id/ll_back)
//			
//			
//			//Profile bottom menu
//			
//			
//			
//			
//		}
//		
//		
		
		
		
		
		
		
		
		
		
	
}
