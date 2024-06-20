package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewRegisterPage extends BasePage {

    private String elementLocator = "//button[@id='addNewRecordButton']";
    private String nameField = "//input[@id='firstName']"; //input[@id='firstName']
    private String lastNameField = "//input[@id='lastName']";
    private String mailField = "//input[@id='userEmail']";
    private String ageField = "//input[@id='age']";
    private String salaryField = "//input[@id='salary']";
    private String deptField = "//input[@id='department']";
    private String submit = "//button[@id='submit']";
    private String editRegister = "//span[@id='edit-record-4']";
    //private String nameField2 = "//*[contains(text(),'Asuncion')]";
    private String nameField2 = "//*[text()='Asuncion']";

    private String src = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']";
    private String trg = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Three']";

    WebElement sourceElement = driver.findElement(By.xpath(src));
    WebElement targetElement = driver.findElement(By.xpath(trg));
    
    public NewRegisterPage(){
        super(driver);
    }

    public void navigateToDemoQA(){
        navigateTo("https://demoqa.com/webtables");
        dismissAlerts();
    }

    public void selectAddButton(){
        clickWebElement(elementLocator);
    }

    public void enterDataRequired(String firstName, String lastName, String mail, String age, String salary, String dept){
        write(nameField, firstName);
        write(lastNameField, lastName);
        write(mailField, mail);
        write(ageField, age);
        write(salaryField, salary);
        write(deptField, dept);
    }

    public void submitButton(){
        clickWebElement(submit);
    }

    public void validateNewRegister(){
        clickWebElement(editRegister);
    }

    public String firstName(){
        dismissAlerts();
        /*Select selectText = new Select(driver.findElement(By.id(nameField)));
        selectText.selectByVisibleText("Asuncion");
        return textFromElement(selectText.toString());*/
        return textFromElement(nameField2);
    }


}
