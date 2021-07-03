package com.canvas

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class scroll {
	
	@Keyword
	// RightClickOffset
	// xpath : this is the xpath of the element
	// getTopLeftX : this is the X position of the element (coordinate X)
	// getTopLeftY : this is the Y position of the element (coordinate Y)

	def RightClick (xpath, int getTopLeftX,int getTopLeftY) {

		WebDriver driver = DriverFactory.getWebDriver()
		Actions actions = new Actions(driver)
		WebElement ele = driver.findElement(By.xpath(xpath))
		actions.moveByOffset(getTopLeftX, getTopLeftY).contextClick().build().perform()
	}

	@Keyword
	// LeftClickOffset

	def Click (xpath,int getTopLeftX,int getTopLeftY) {

		WebDriver driver = DriverFactory.getWebDriver()
		Actions actions = new Actions(driver)
		WebElement ele = driver.findElement(By.xpath(xpath))
		actions.moveToElement(ele).moveByOffset(getTopLeftX, getTopLeftY).click().build().perform()
	}
	
}
