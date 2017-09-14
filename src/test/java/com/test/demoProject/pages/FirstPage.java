package com.test.demoProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by strugariu on 7/18/2017.
 */
@At(urls = {"#HOST/"})
@DefaultUrl("https://www.google.com/")
public class FirstPage extends PageObject {

	@FindBy(css=".tryMe1")
	WebElementFacade iDontExist;

	public void waitForElementExtendedWait(){
		iDontExist.withTimeoutOf(20, TimeUnit.SECONDS).waitUntilPresent();
	}

	public void waitForElementNormalWait(){
		iDontExist.waitUntilPresent();
	}

}
