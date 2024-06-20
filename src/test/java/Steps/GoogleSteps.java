package Steps;

import Pages.GooglePage;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    private String locator = "//h3[contains(text(),'Canis familiaris - Wikipedia, la enciclopedia libr' and @href)]";
    
    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Perro");
    }

    @When("^I enter a different search (.+)$")
    public void enterDifferentsCriterias(String criterias){
        google.enterSearchCriteria(criterias);
    }

    @And("^click on the search button$")
    public void clickSearchButton(){
        google.clickButtonSearch();
    }

    @Then("^the results match the criteria$")
    public void validateSearch(){
        //Hacer fallar al Assert
        //Assert.assertEquals("Perrossss", google.firstResult());
        //Hacer funcionar correctamente al Assert
        Assert.assertEquals("Perro", google.firstResult());
    }

    @And("^I select the first result option$")
    public void selectFirstResult(){
        google.clickFirstResult(locator);
        
        Assert.assertEquals("//h3[contains(text(),'Canis familiaris - Wikipedia, la enciclopedia libr' and @href)]", locator);
    }

    @And("^I click on the search button for the search$")
    public void clickSearchButton2(){
        google.clickButtonSearch();
    }

}
