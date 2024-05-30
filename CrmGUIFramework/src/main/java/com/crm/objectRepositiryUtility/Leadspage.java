package com.crm.objectRepositiryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadspage {
	WebDriver driver;
public Leadspage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
private @FindBy(xpath = "//img[@alt=\"Create Lead...\"]") WebElement addLeadBtn;
public WebElement getAddLeadBtn() {
	return addLeadBtn;
}

}
