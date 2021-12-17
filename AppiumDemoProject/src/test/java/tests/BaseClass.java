package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	//Initialize appium driver with <MobileElement>
		AppiumDriver<MobileElement> driver;
		@BeforeClass
		public void setup() throws MalformedURLException {
			
			DesiredCapabilities dc= new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10 Pro Max");
			dc.setCapability(MobileCapabilityType.UDID, "4pcms8tw4hhui7gq");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Nitin\\Desktop\\app-debug.apk");
			dc.setCapability("autoAcceptAlerts", "true"); 
			dc.setCapability("no",true);
	        dc.setCapability("newCommandTimeout", 100000);
	        
	        //to enable all android alerts as true
	        dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
			
			//dc.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver <WebElement> diver = new AndroidDriver<WebElement>(url,dc);

			driver = new AppiumDriver <MobileElement> (url,dc);
			//FOR IOS files
			//driver = new IOSDriver <MobileElement> (url,dc);
			
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
				
}
		
		public static String dummyName() {
			String generateName = RandomStringUtils.randomAlphabetic(5);
			return generateName;
		}
		
		public static String dummyPassword() {
			String generatePassword = RandomStringUtils.randomAlphabetic(9);
			return generatePassword;
		}
		
		public static String dummyText = "Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut "
				+ "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit "
				+ "in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
				+ "Excepteur sint occaecat cupidatat non proident,"
				+ "sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		
		public String FilterByKeyword  ="tea";
		public String FilterByCategory  ="SELF";
		public String FilterByPremium = "PREMIUM";
		public String FilterByDate_SpecialCharacters = "(2018-05-23)";
		
		@AfterClass
	public void teardown() {
			driver.quit();
	     }
	
}
