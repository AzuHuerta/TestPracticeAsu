package Steps;

import Pages.AcademyBugsPage;
import Pages.CheckOutCart;
import Pages.FindBugsPage;
import io.cucumber.java.en.*;


public class TestPracticeSteps {
    
    AcademyBugsPage academy = new AcademyBugsPage();
    FindBugsPage fBugs = new FindBugsPage();
    CheckOutCart check = new CheckOutCart();

    @Given("^I Navigate to www.academybugs.com$")
    public void navigateToAcademyBugs(){
        academy.navigateToAcademyBugs();
    }

    @Given("^I added the item and I click the View Cart button$")
    public void goToCheckOut(){
        check.checkOutCart();
    }

    @When("^I go to Find Bugs using the navigation bar$")
    public void navigationBarSection(){
        academy.clickSectionNavBar();
    }

    @When("^I select the item$")
    public void clickItem(){
        fBugs.clickItem();
    }

    @When("^I can click it the checkout button in the shopping cart$")
    public void clickCheckButton(){
        check.checkOutShoppingCart();
    }

    @Then("^I add to cart the selected item$")
    public void addItemToCart(){
        fBugs.addToCart();
    }

}
