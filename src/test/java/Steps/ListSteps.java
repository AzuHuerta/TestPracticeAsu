package Steps;


import Pages.ListOrderItem;
import io.cucumber.java.en.*;

public class ListSteps {

    ListOrderItem list = new ListOrderItem();


     @Given("^I Navigate to www.academybugs.com/find-bugs/$")
    public void navigateTo(){
       list.navigateToFindBugs();
    }

    @When("^I click in the search list of items$")
    public void clickList(){
        list.selectListItem();
    }

    @Then("^The first result is the more cheaper item$")
    public void selectFirstOptionCheaper(){
       //ArrayList<Integer> listOptions = new ArrayList<>();
       list.selectFirstOptionCheaper();
    }

    /*@Then("^Select the second option and the search will be done$")
    public void selectSecondOption(){
       //ArrayList<Integer> listOptions = new ArrayList<>();
       list.selectSecondOption();
    }

    @And("^The first result is the more cheaper item$")
    public void clickItem(){
      
    }*/
    
}
