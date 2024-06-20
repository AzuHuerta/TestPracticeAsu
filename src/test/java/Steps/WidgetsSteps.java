package Steps;

import org.junit.Assert;

import Pages.WidgetsPage;
import io.cucumber.java.en.*;

public class WidgetsSteps {

    WidgetsPage widget = new WidgetsPage();
    
    //BackGround
    @Given("^I am on the DemoQA widgets page$")
    public void navigateTo(){
        widget.navigateToDemoQA();
    }

    //Accordian Option
    @When("^I select the accordian option$")
    public void selectAccordian(){
        widget.selectAccordian();
    }

    @Then("^I can see the text corresponding to the selected option$")
    public void validateShowText(){
        Assert.assertTrue(widget.validateShowText());
    }

    @And("^I select newly the accordian option and the text is hide$")
    public void hideText(){
        Assert.assertFalse(widget.validateHideText());
    }


    //AutoComplete Option
    @When("^I select the AutoComplete option$")
    public void selectAutocomplete(){
        widget.selectAutoComplete();
    }

    @Then("^I put the (.+) on the input$")
    public void putColors(String Color){
        widget.putColors(Color);
    }

    @Then("^I select the same option that's show$")
    public void selectSameColor(){

    }

    //DataPicker Option
    @When("^I select the DatePicker option$")
    public void selectdataPicker(){
        widget.selectDataPicker();
    }
    @Then("^I select an date of DatePicker$")
    public void selectDate(){

    }

    //Slider Option
    @When("^I select the Slider option$")
    public void selectSlider(){
        widget.selectSlider();
    }
    @Then("^I drag the slider option until 100$")
    public void dragSlider(){

    }

    //Progress Bar Option
    @When("^I select the progress bar option$")
    public void selectProgressBar(){
        widget.selectProgressBar();
    }
    @Then("^I select the start button$")
    public void startProgressBar(){

    }
    @Then("^I stop the load of the bar on 50% of percent$")
    public void stopProgressBar(){

    }

    //Tabs Option
    @When("^I select the Tabs option$")
    public void selectTab(){
        widget.selectTabs();
    }
    @Then("^I select the diferents (.+) to navigate$")
    public void navigateTabs(){

    }

}
