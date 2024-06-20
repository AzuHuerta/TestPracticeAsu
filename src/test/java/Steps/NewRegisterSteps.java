package Steps;

import org.junit.Assert;

import Pages.NewRegisterPage;
import io.cucumber.java.en.*;

public class NewRegisterSteps {

    NewRegisterPage register = new NewRegisterPage();
    
    @Given("^I am on the DemoQA page$")
    public void navigateToDemoQA(){
        register.navigateToDemoQA();
    }

    @When("^select the Add button$")
    public void selectAddButton(){
        register.selectAddButton();
    }

    @Then("^I put all required information (.+), (.+), (.+), (.+), (.+), (.+)$")
    public void enterDataRequired(String Name, String LastName, String mail, String age, String salary, String dept){
        register.enterDataRequired(Name, LastName, mail, age, salary, dept);
    }

    @And("^I click the submit button$")
    public void newRegisterAdd(){
        register.submitButton();
    }

    @And("^The new register is showed in the Web Table$")
    public void validateNewRegister(){
        register.validateNewRegister();
        Assert.assertEquals("Asuncion", register.firstName());
    }


}
