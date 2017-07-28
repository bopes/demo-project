package com.test.demoProject.tests;

import com.test.demoProject.steps.FirstStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.NoSuchElementException;
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

	@Test(expected = NoSuchElementException.class)
	@WithTagValuesOf({"Profile"})
	public void accountDetails() {
		firstStep.openFirstPage();
		Assert.assertTrue(firstStep.checkElement());
	}
}
