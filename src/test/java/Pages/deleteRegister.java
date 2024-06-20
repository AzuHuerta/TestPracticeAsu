package Pages;

public class deleteRegister extends BasePage {
    
    private String deleteRecord = "//span[@id='delete-record-2']";
    private String firstName = "//*[text()='Kierra']";

    public deleteRegister(){
        super(driver);
    }

    public void deleteRecord(){
        clickWebElement(deleteRecord);
    }

    public String eliminatedRecord(){
        dismissAlerts();
        return textFromElement(firstName);
    }
}
