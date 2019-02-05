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
 

public class launch {
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
		driver.findElementById("in.qlc.fieldsense:id/edt_name_login").sendKeys("ashwini@varad.in");
		driver.findElementById("in.qlc.fieldsense:id/edt_pass_login").sendKeys("qlc.in123");
		driver.findElementById("in.qlc.fieldsense:id/btn_submit_login").click();
		Thread.sleep(10000);
		
		driver.findElementById("in.qlc.fieldsense:id/dismiss_btn").click();
	/**   
	 * @Punch in 
	 */
	
	driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
	driver.findElementById("in.qlc.fieldsense:id/swPunch").click();
	Thread.sleep(1000);
	driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
	
	/**
	 * @Add visit 
	 */
	 
		driver.findElementById("in.qlc.fieldsense:id/img_add_appoint").click();
	driver.findElementById("in.qlc.fieldsense:id/tvCustomerName").click();
	driver.findElementById("in.qlc.fieldsense:id/et_Search").sendKeys("qlc");
	Thread.sleep(4000);
	driver.findElementById("in.qlc.fieldsense:id/tvCustomerName").click();
	driver.findElementById("in.qlc.fieldsense:id/spn_purpose_dialog").click();

//driver.findElementByClassName("android.widget.CheckedTextView").click();
	driver.findElementByXPath("//android.widget.CheckedTextView[@text='Account Review']").click();
//driver.findElementById("in.qlc.fieldsense:id/edt_add_appointment_subject").sendKeys("Automation testing purpose");
driver.findElementById("in.qlc.fieldsense:id/iv_add_appointment_ok").click();
	Thread.sleep(8000);
	driver.findElementById("in.qlc.fieldsense:id/img_add_place").click();
	driver.findElementById("android:id/text1").click();
	Thread.sleep(1000);
	/**
	 * @ Add new customer
	 */
	
    driver.findElementByXPath("//android.widget.CheckedTextView[@text='New Customer']").click();
   driver.findElementById("in.qlc.fieldsense:id/edt_name_save_dialog").sendKeys("SundaraFiE");
   driver.findElementById("in.qlc.fieldsense:id/edt_save_dialog_location_id").sendKeys("pune");

    driver.findElementByXPath("//android.widget.TextView[@text='Select Territory']").click();
    driver.findElementByXPath("//android.widget.CheckedTextView[@text='Unknown']").click();
    driver.findElementByXPath("//android.widget.TextView[@text='Select Industry']").click();
   
    driver.findElementByXPath(" //android.widget.CheckedTextView[@text='Software']").click();
    driver.findElementById("in.qlc.fieldsense:id/btn_save_location").click();
    driver.findElementById("android:id/button2").click();
   Thread.sleep(3000);
    /**
	 * @ Check in/Out Customer    
	 */
  
   driver.findElementById("in.qlc.fieldsense:id/img_checked_in").click();
   driver.findElementById("in.qlc.fieldsense:id/tv_list_item_check_in_address").click();
   Thread.sleep(2000);
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
   /**
	
    /**
   	 * @ Forms
   	 */
		      
		        driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
		        driver.findElementById("in.qlc.fieldsense:id/layoutMenuForms").click();
		        driver.findElementByXPath("//android.widget.TextView[@text='AbFieldsense']").click();
		        driver.findElementByXPath("//android.widget.EditText[@text='hello']").sendKeys("my world");
		        driver.findElementByXPath("//android.widget.RadioButton[@text='2']").click();
		        driver.findElementByClassName("android.widget.Button").click();
		        Thread.sleep(1000);
		        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
		        driver.findElementById("in.qlc.fieldsense:id/menu1").click();
		        Thread.sleep(100);
    /**
   	 * @ My Team
   	 */
    
    driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
    driver.findElementById("in.qlc.fieldsense:id/menuOption_myTeam").click();
    driver.findElementById("in.qlc.fieldsense:id/my_team_view_users_data_edit_text_user_name").sendKeys("apple ios");
    driver.findElementById("in.qlc.fieldsense:id/my_team_view_users_image_view_toggle").click();
    driver.findElementById("in.qlc.fieldsense:id/menu1").click();
    Thread.sleep(100);
    
    /**
   	 * @ Punchout
   	 */
    
    driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
    driver.findElementById("in.qlc.fieldsense:id/swPunch").click();
    driver.findElementById("in.qlc.fieldsense:id/button1").click();
    driver.findElementById("in.qlc.fieldsense:id/btn_dialog_location_cancel").click();
    Thread.sleep(100);
    driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
    driver.findElementById("in.qlc.fieldsense:id/img_checked_in").click();
    
    Thread.sleep(100);
    
    
    
       driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
       driver.findElementById("in.qlc.fieldsense:id/menu2").click();
       driver.findElementById("in.qlc.fieldsense:id/btn_message_new_member").click();
       Thread.sleep(1000);
       driver.findElementByXPath("//android.widget.LinearLayout[@index='4']").click();
       driver.findElementById("in.qlc.fieldsense:id/tv_message_item_name").click();
       Thread.sleep(100);;
       driver.findElementById("in.qlc.fieldsense:id/edt_message_send_text").sendKeys("hello");
       driver.findElementByXPath("//android.widget.Button[@index='1']").click();
        Thread.sleep(10000);
         driver.navigate().back();
  
       //  driver.findElementById("in.qlc.fieldsense:id/iv_message_details_back").click();
        Thread.sleep(100);
        driver.findElementById("in.qlc.fieldsense:id/btn_message_drawer").click();
        Thread.sleep(100);
        //  WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Contact']"));

        //  Actions action = new Actions(driver);

        //  action.moveToElement(element).build().perform();
         
      //   MobileElement elementToClick = (MobileElement) driver
      //    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
     //     + ".resourceId(\"in.qlc.fieldsense:id/textView3\")).scrollIntoView("
    //      + "new UiSelector().text(\"in.qlc.fieldsense:id/textView3411\"));");

     
          //  driver.findElementById("in.qlc.fieldsense:id/img_toggle").click();
            driver.findElementById("in.qlc.fieldsense:id/ll_items").click();
            Thread.sleep(100);


          driver.findElementByXPath("//android.widget.TextView[@text='Contact']");
          driver.findElementById("in.qlc.fieldsense:id/btn_logout").click();
          driver.findElementById("in.qlc.fieldsense:id/btn_dialog_date_time_cancel").click();
          driver.findElementById("in.qlc.fieldsense:id/button1").click();
          Thread.sleep(100);
         
  	}
  
}


			



