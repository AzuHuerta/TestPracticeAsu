package Pages;

public class EmptyRegisterPage extends BasePage{

    private String recordSelect = "//span[@id='edit-record-3']";
    private String userMail = "//input[@id='userEmail']";
    private String submitButton = "//button[@id='submit']";
    
    public EmptyRegisterPage(){
        super(driver);
    }

    public void selectRegister(){
        clickWebElement(recordSelect); 
    }

    public void clearField(){
        clearField(userMail);
    }

    public void saveChanges(){
        clickWebElement(submitButton);
    }

    public void validateRegister(){

    }
}
