package Steps;

import org.junit.Assert;

import Pages.deleteRegister;
import io.cucumber.java.en.*;

public class deleteRecordSteps {
    

    deleteRegister delete = new deleteRegister();

    @Given("^I select the delete button of any record$")
    public void deleteRecord(){
        delete.deleteRecord();
    }

    @When("^Validate that don't exists the record eliminated$")
    public void validateEliminatedRecord(){
        Assert.assertNotEquals("", delete.eliminatedRecord());
    }
    
}
