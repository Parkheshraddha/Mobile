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
 

public class punchout {
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

}
}
