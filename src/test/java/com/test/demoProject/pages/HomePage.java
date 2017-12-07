package com.test.demoProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * Created by strugariu on 7/18/2017.
 */
@At(urls = {"#HOST/.*"})
@DefaultUrl("https://www.garmin.com/en-US")
public class HomePage extends PageObject {

	@FindBy(css=".NoEl")
	WebElementFacade element;


	@FindBy(id="js__g__header__search__input")
	WebElementFacade search;

	public Boolean isElVisible(){
		element.waitUntilVisible();
		return element.isVisible();
	}

	public void typeSearch(String value){
		search.typeAndEnter(value);
	}
}
