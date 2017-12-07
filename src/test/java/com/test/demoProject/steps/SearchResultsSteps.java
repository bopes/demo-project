package com.test.demoProject.steps;

import com.test.demoProject.pages.SearchResultsPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchResultsSteps extends ScenarioSteps {

    private static final long serialVersionUID = 1L;

    SearchResultsPage searchResultsPage;

    public void checkSearchResults(){
        Assert.assertTrue(searchResultsPage.resultsCount() > 0);
    }

}
