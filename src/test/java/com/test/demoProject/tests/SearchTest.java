package com.test.demoProject.tests;

import com.test.demoProject.steps.FirstStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

/**
 * Created by strugariu on 7/18/2017.
 */
@RunWith(SerenityRunner.class)
public class SearchTest {

	@Managed()
	public WebDriver webdriver;

	@Steps
	public FirstStep firstStep;

	@Test(expected = org.openqa.selenium.NoSuchElementException.class)
	public void waitForElementExtendedWait() {
		firstStep.openFirstPage();
	}

}
