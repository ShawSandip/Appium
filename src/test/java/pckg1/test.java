
		package pckg1;
		import java.io.File;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.remote.RemoteWebDriver;

		import io.appium.java_client.AppiumDriver;
		//import io.appium.java_client.MobileElement;
		import io.appium.java_client.android.AndroidDriver;


		public class test {

			public static void main(String[] args) {
				
				//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
		        File fs = new File("C:\\Users\\LENOVO\\Downloads","ApiDemos-debug.apk");

				caps.setCapability("deviceName", "CPH2487");
				//caps.setCapability("udid", "42376193"); //Give Device ID 
				//caps.setCapability("platformName", "Android");
				//caps.setCapability("platformVersion", "11.0");
				caps.setCapability("app", fs.getAbsolutePath());

//				caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

				//caps.setCapability("noReset", "true");

				//Instantiate Appium Driver

				try {

					AndroidDriver	  dr = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps); 		//driver.findElementByAccessibilityId()
				/*
				 * Li<WebElement> buttons =
				 * driver.findElements(By.className("android.widget.TextView"));
				 * 
				 * for(WebElement button : buttons){ System.out.println(button.getText());
				 * 
				 * if(button.getText().equals("Animation")){ button.click();
				 * 
				 * } }
				 */
					dr.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility']")).click();
				} catch (MalformedURLException e) {

					System.out.println(e.getMessage());

				}

				}

				
	

}
