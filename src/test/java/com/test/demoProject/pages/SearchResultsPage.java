package com.test.demoProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@At(urls = {"#HOST/"})
@DefaultUrl("https://support.garmin.com/search/shopResults.faces")
public class SearchResultsPage extends PageObject {


    @FindBy(css=".search-results .info")
    List<WebElementFacade> results;

    public int resultsCount(){
        return results.size();
    }

}
