package Steps;

import Pages.EmptyRegisterPage;
import io.cucumber.java.en.*;

public class EmptyRegisterSteps {

    EmptyRegisterPage empty = new EmptyRegisterPage();
    
    @Given("^I select the edit button of the one record$")
    public void selectRegister(){
        empty.selectRegister();
    }

    @When("^I delete the data of mail field$")
    public void deleteField(){
        empty.clearField();
    }

    @Then("^I try save the changes by clicking on a submit button$")
    public void saveChenges(){
        empty.saveChanges();
    }

    @And("^validate that changes aren't saved because the mail field is empty$")
    public void validateChange(){

    }

}
