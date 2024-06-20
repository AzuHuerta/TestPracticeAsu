package Steps;

import Pages.W3SchoolsPage;
import io.cucumber.java.en.*;

public class W3SchoolsSteps {

    W3SchoolsPage oSchool = new W3SchoolsPage();
    
    @Given("^I navigate on a W3Schools Page$")
    public void navigateToPage(){
        oSchool.navigateTo();
    }

    @When("^I select the element for Drag and Drop$")
    public void dragNDrop(){
        oSchool.DragNDrop();    
    }

}
