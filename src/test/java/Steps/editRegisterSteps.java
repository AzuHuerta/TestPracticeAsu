package Steps;


import org.junit.Assert;

import Pages.editRegister;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editRegisterSteps {
    
     editRegister register = new editRegister();
    
    @Given("^I select the edit button of the new register$")
    public void navigateToDemoQA(){
        register.clickEditNewRegister();
    }

    @When("^I edit the fields that I choose$")
    public void selectAddButton(){
        register.editFields();
    }

    @Then("^I save the changes by clicking on the submit button$")
    public void enterDataRequired(){
        register.saveChanges();
    }

    @And("^Validate that fields was updated$")
    public void newRegisterAdd(){
        register.validateChanges();
        Assert.assertEquals("Lupita", register.firstName());
        register.saveChanges();
    }
   

}
