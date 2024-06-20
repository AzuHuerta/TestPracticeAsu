package Steps;

import org.junit.Assert;

import Pages.SwagLabsPage;
import io.cucumber.java.en.*;

public class SwagLabsSteps {

    SwagLabsPage swag = new SwagLabsPage();
    
    //Loggin in the page
    @Given("^I am on the SwagLabs Page$")
    public void navigateToSwag(){
        swag.navigateToSwag();
    }

    @When("^I put the (.+) and (.+)$")
    public void InputData(String user, String pass){
        swag.enterCriteria(user, pass);

        Assert.assertEquals("standard_user", user);
        Assert.assertEquals("secret_sauce", pass);

        if (user.contains("standard_user")) {
            System.out.println("Usuario válido");

            if (pass.contains("secret_sauce")) {
                System.out.println("Contraseña válida");
            }
            else{
                System.out.println("Contraseña Inválida");
            }
        }
        else{
            System.out.println("Usuario Inválido");
        }
    }

    @Then("^I click on the Login Button$")
    public void Login(){
        swag.clickLoginBtn();
    }


    //Add Items to cart
    @Given("^I select each item and Add to Cart$")
    public void addItems(){
        swag.selectItems();
    }

    @When("^I select the Cart option$")
    public void clickCartOption(){
        swag.clickToCart();
    }

    @Then("^click in the checkout botton for the continue purchase$")
    public void ckickCheckOutbtn(){
        swag.clickCheckOut();
    }

    @Then("^I fill the fields solicited$")
    public void fillFields(){
        swag.fillFieldsInfo();
    }

    @And("^click in the Continue botton$")
    public void clickContinueBotton(){
        swag.clickContinue();
    }

    @Then("^I finish with the purchase$")
    public void finishPurchase(){
        swag.finish();
    }

    @And("^I validate that order was realized$")
    public void validateOrder(){
        if(swag.validateOrder()){
            System.out.println("Buy was Successfully");
        }
        else{
            System.out.println("Buy had an Error, try it again!");
        }
    }

    @Then("^I select the Back Home button$")
    public void goHome(){
        swag.backHome();
    }

    @And("^I put the mouse over on one item$")
    public void mouseOver(){
        swag.mouseOver();
    }

}
