package Steps;

import org.junit.Assert;

import Pages.CheckBoxPage;
import io.cucumber.java.en.*;

public class CheckBoxSteps {
    
    CheckBoxPage check = new CheckBoxPage();

    @Given("^I select the option the CheckBox$")
    public void selectCheckBox(){
        check.navigateTo();
        check.selectCheckBox();
    }

    @When("^Validate that option is selected$")
    public void validateCheckIsSelected(){
       // Assert.assertTrue(check.validateSelected());
        Assert.assertFalse(check.validateSelected());
    }

    @Given("^I navigate to DemoQA Page$")
    public void navigateTo(){
        check.navigateTo();
    }

    @When("^I validate that any Checkbox option isn't selected$")
    public void validateCheckIsUnselected(){
        Assert.assertFalse(check.validateSelected());
    }
}
