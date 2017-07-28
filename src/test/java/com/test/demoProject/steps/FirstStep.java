package com.test.demoProject.steps;

import com.test.demoProject.pages.FirstPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by strugariu on 7/18/2017.
 */
public class FirstStep extends ScenarioSteps{

		private static final long serialVersionUID = 1L;

	FirstPage firstPage;
	@Step
	public void openFirstPage() {
		firstPage.open();
	}

	@Step
	public Boolean checkElement(){
		return firstPage.isElVisible();
	}
	}
