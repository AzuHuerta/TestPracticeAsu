package Pages;

public class editRegister extends BasePage{
    
    private String editRegister = "//span[@id='edit-record-4']";
    private String nameField2 = "//*[text()='Asuncion']";
    private String nameField = "//input[@id='firstName']";
    private String submitButton = "//button[@id='submit']";
    private String nameField3 = "//*[text()='Lupita']";

    public editRegister(){
        super(driver);
    }


    public void clickEditNewRegister(){
        clickWebElement(editRegister);
    }


    public void editFields(){
        clearField(nameField2);
        write(nameField, "Lupita");
    }

    public void saveChanges(){
        clickWebElement(submitButton);
    }

    public void validateChanges(){
        clickWebElement(editRegister);
    }

    public String firstName(){
        dismissAlerts();
        return textFromElement(nameField3);
    }
}
