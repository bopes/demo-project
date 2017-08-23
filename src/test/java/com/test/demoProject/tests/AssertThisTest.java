package com.test.demoProject.tests;

import com.test.demoProject.steps.FirstStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AssertThisTest {

	@Managed()
	public WebDriver webdriver;

	@Steps
	public FirstStep firstStep;

	@Test(expected = AssertionError.class)
	public void checkThis() {
		firstStep.openFirstPage();
		firstStep.doAAssert("Should Fail", false);
	}
}
