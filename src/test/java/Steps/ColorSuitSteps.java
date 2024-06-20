package Steps;


import Pages.SuitPage;
import io.cucumber.java.en.*;

public class ColorSuitSteps {

    SuitPage suit = new SuitPage();


     @Given("^I navigate to Find Bugs subpage$")
    public void navigateToFindBugs(){
        suit.navigateToFindBugs();
    }

    @When("^I select a Professional Suit in the button$")
    public void selectSuit(){
        suit.selectSuit();
    }

    @Then("^I select a Blue color of the Suit$")
    public void selectColorSuit(){
        suit.selectColorSuit();
       
    }

    @And("^Select the button ADD TO CART$")
    public void addItemToCart(){
        suit.AddtoCart();
    }
    
}
