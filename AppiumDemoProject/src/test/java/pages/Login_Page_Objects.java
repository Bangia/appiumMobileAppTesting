package pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login_Page_Objects {

	//Create constructor
	 public AndroidDriver<MobileElement> driver;

	    public  Login_Page_Objects(AndroidDriver<MobileElement> driver) {
	        this.driver = driver;
	    }
	
	   //elements
	private final By IHaveAccount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView");
	private final By SignInlink = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]");
    
	private final By userName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText");
    
	
	private final By password = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
    private final By loginButton = By.xpath("com.maxsoftlk.loginapplication:id/tvAttemptsInfo");
    private final By imageForward = By.id("com.joyscore:id/img_forward");
    private final By DoneButton = By.id("com.joyscore:id/txt_submit");
    
    
    //Action methods
    public void haveAccount() {
        driver.findElement(IHaveAccount).click();;
    }


    public void signLink() {
        driver.findElement(SignInlink).click();;
    }

    public void setUserName(String usernames) {
        driver.findElement(userName).sendKeys(usernames);
    }
    
    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    
    public void loginSubmit() {
    	driver.findElement(loginButton).click();
    }
    
    public void imgForward() {
    	driver.findElement(imageForward).click();
    }

    public void doneBtn() {
    	driver.findElement(DoneButton).click();
    }
    
	

}
