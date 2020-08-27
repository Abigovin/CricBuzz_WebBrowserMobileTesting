package WebBrowser;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {

	public static AndroidDriver<AndroidElement> desiredCapability() throws Exception {
		//Get path of apk file which is inside in src
		//File fs = new File("src/ApiDemos-debug.apk");		
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Abinaya device");
	    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    	    
	   // cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Abinaya backup\\Abinaya\\Manipal Team course\\chromedriver.exe");
	    
	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>( new URL("http://0.0.0.0:4723/wd/hub"),cap);
	    
	return driver;
	
	}


}
