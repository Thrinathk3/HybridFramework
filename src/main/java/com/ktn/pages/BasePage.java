package com.ktn.pages;

import com.ktn.driver.DriverManager;
import com.ktn.enums.WaitStrategy;
import com.ktn.factories.ExplicitWaitFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.ktn.enums.LogType.CONSOLE;
import static com.ktn.enums.LogType.PASS;
import static com.ktn.reports.FrameworkLogger.log;

public class BasePage {

	/**
	 * Locates element by given wait strategy, performs the clicking operation on
	 * webelement and writes the pass even to the extent report.
	 * 
	 * @author Thrinath K Jan 22, 2023
	 * @param by           By Locator of the webelement
	 * @param waitstrategy Strategy to find webelement. Known strategies
	 *                     {@link com.ktn.enums.WaitStrategy}
	 * @param elementname  Name of the element that needs to be logged in the
	 *                     report.
	 */
	protected void click(By by, WaitStrategy waitstrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
		log(PASS, elementname + " is clicked");
		log(CONSOLE, elementname + " is clicked");
	}

	/**
	 * Locates element by given wait strategy, sends the value to located webelement
	 * and writes the pass even to the extent report.
	 * 
	 * @author Thrinath K Jan 22, 2023
	 * @param by           By Locator of the webelement
	 * @param value        value to be send the text box
	 * @param waitstrategy Strategy to find webelement. Known strategies
	 *                     {@link com.ktn.enums.WaitStrategy}
	 * @param elementname  Name of the element that needs to be logged in the
	 *                     report.
	 */
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
		if (elementname.equalsIgnoreCase("password")) {
			log(PASS, elementname + " ->***********<- is entered successfully in " + elementname);
			log(CONSOLE, elementname + " ->***********<- is entered successfully in " + elementname);
		} else {
			log(PASS, value + " is entered successfully in " + elementname);
			log(CONSOLE, value + " is entered successfully in " + elementname);
		}
	}

	String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	protected String getElementText(By by, WaitStrategy waitstrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);

		String text = element.getText();
		log(PASS, "getting text : ***" + text + "*** at element of " + elementname);
		log(CONSOLE, "getting text : ***" + text + "*** at element of " + elementname);
		return text;
	}

	Actions act = new Actions(DriverManager.getDriver());

	public void moveToWebElementElement(By by, String elementname) {
		WebElement element = DriverManager.getDriver().findElement(by);
		act.moveToElement(element).build().perform();
		log(PASS, "moved to element " + elementname);
		log(CONSOLE, "moved to element " + elementname);
	}

	public void scrollToELement(By by, String elementname) {
		WebElement element = DriverManager.getDriver().findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", element);
		log(PASS, "scroll to " + elementname);
		log(CONSOLE, "scroll to " + elementname);
	}

	public void moveToElementClick(By by, String elementname) {
		WebElement element = DriverManager.getDriver().findElement(by);
		act.moveToElement(element).click().perform();
		log(PASS, "moved to element " + elementname);
		log(CONSOLE, "moved to element " + elementname);
	}

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
