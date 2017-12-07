package com.test.demoProject.steps;

import com.test.demoProject.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by strugariu on 7/18/2017.
 */
public class HomeStep extends ScenarioSteps{

		private static final long serialVersionUID = 1L;

	HomePage homePage;
	@Step
	public void openFirstPage() {
		homePage.open();
	}

	@Step
	public void typeSearch(String value){
		homePage.typeSearch(value);
	}

	@Step
	public Boolean checkElement(){
		return homePage.isElVisible();
	}



	@Step("asserts that {1} is true. Message:{0}")
	public void doAAssert(String message,Boolean value){
		assertThat(value).isTrue().
				as(message);
	}

}
