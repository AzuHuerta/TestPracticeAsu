package Steps;

import Pages.InteractionsPage;
import io.cucumber.java.en.*;

public class InteractionsSteps {

    
    InteractionsPage actions = new InteractionsPage();
    
    @Given("^I navigate to Sortable Options on a DemoQA$")
    public void navigateTointeractions(){
        actions.navigateToSortable();
    }

    @When("^I drag the first option until third position and drop$")
    public void dragOption(){
        actions.dragOption();
    }



}
