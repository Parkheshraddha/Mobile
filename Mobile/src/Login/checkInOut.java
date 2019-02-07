  package Login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
 

public class checkInOut {
	public static AndroidDriver driver;
	@Test
	public static void applaunch() throws MalformedURLException, InterruptedException {

		//File classpathRoot = new File(System.getProperty("user.dir"));
				File appDir = new File("D:\\Mobile automation\\fieldSense-test.apk");
				//System.out.println(classpathRoot);
				//File appDir = new File(classpathRoot, "/apkFiles/");
				System.out.println(appDir);
//				File app = new File(appDir, "fieldSense_test.apk");
//				System.out.println(app);
				
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Opp");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", appDir.getAbsolutePath());
		capabilities.setCapability("appPackage", "in.qlc.fieldsense");
		capabilities.setCapability("appActivity", "in.qlc.field.sense.SplashScreen");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElementById("in.qlc.fieldsense:id/edt_name_login").sendKeys("Shraddha.parkhe@qlc.in");
		driver.findElementById("in.qlc.fieldsense:id/edt_pass_login").sendKeys("qlc.in123");
		driver.findElementById("in.qlc.fieldsense:id/btn_submit_login").click();
		Thread.sleep(10000);
		
		driver.findElementById("in.qlc.fieldsense:id/dismiss_btn").click();
		
		 /* @Punch in 
		 */
		
		driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
		driver.findElementById("in.qlc.fieldsense:id/swPunch").click();
		Thread.sleep(1000);
		driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
		Thread.sleep(1000);
		
		 
	       driver.findElementById("in.qlc.fieldsense:id/img_checked_in").click();
	       driver.findElementById("in.qlc.fieldsense:id/tv_list_item_check_in_address").click();
	     driver.findElementById("in.qlc.fieldsense:id/button1").click();
	     Thread.sleep(1000);
	     driver.findElementById("in.qlc.fieldsense:id/img_checked_in").click();

	      driver.findElementById("in.qlc.fieldsense:id/button1").click();
	     //  driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
	      driver.findElementById("in.qlc.fieldsense:id/llOk").click();
	     // driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
	      Thread.sleep(1000);
	      /**
	     	 * @ Outcome report   
	     	 */
	      driver.findElementByClassName("android.widget.RadioButton").click();
	    //  driver.findElementByClassName("android.widget.RadioButton").click();
	      driver.findElementById("in.qlc.fieldsense:id/edt_outcome_desc").sendKeys("testing purpose");
	      driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();
	      Thread.sleep(1000);
	      
	  		        /**
	  		    	 * @ Expense claim   
	  		    	 */
	  		        
	  		      driver.findElementById("in.qlc.fieldsense:id/llOk").click();
	  		     driver.findElementById("in.qlc.fieldsense:id/currency_spinner_row").click();
	  		     
	  		        driver.findElementByXPath("//android.widget.TextView[@text='Unknown']").click();
	  		        Thread.sleep(100);
	  		       driver.findElementById("in.qlc.fieldsense:id/edt_report_expense_name").sendKeys("biryani");
	  		       driver.findElementById("in.qlc.fieldsense:id/edt_report_expense_amount").sendKeys("12");
	  		        driver.findElementById("in.qlc.fieldsense:id/iv_report_expense_submit").click();
	  		       Thread.sleep(100);
		

}
}