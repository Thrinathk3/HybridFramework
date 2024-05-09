/**
 * 
 */
package com.ktn.factories;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.chrome.ChromeOptions;*/
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ktn.enums.ConfigProperties;
import com.ktn.utils.PropertyUtils;


/**
 * Jan 26, 2023 
 * @author Thrinath K
 * @version 1.0
 * @since 1.0
 */
public final class DriverFactory {

	private DriverFactory() {}

	/**
	 * 
	 * @author Thrinath K
	 * Mar 20, 2023
	 * @param browser
	 * @param version
	 * @return
	 * @throws MalformedURLException
	 * TODO Remove hardcoded value of grid url
	 */
	public static WebDriver getDriver(String browser,String version) throws MalformedURLException {

		WebDriver driver=null;

		String runmode = PropertyUtils.get(ConfigProperties.RUNMODE);
		if(browser.equalsIgnoreCase("chrome")) {
			if(runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName(browser);
				cap.setVersion(version);
				driver =new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);
			}
			else {
				//WebDriverManager.chromedriver().setup();
				/*
				 * ChromeOptions options = new ChromeOptions();
				 * options.addArguments("--headless"); String userAgent = "YOUR USER AGENT";
				 * options.addArguments(String.format("user-agent=%s", userAgent));
				 */
				driver = new ChromeDriver();
			}
		}
		else if(browser.equalsIgnoreCase("firefox")) {

			if(runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName(browser);
				cap.setVersion(version);
				driver =new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);
			} else {
				//WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

}
