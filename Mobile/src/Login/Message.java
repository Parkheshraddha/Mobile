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
 
public class Message {
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

}
}