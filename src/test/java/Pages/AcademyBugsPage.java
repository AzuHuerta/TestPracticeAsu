package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AcademyBugsPage extends BasePage {


    By elementLocator = By.xpath("//a[@title='Find Bugs' and @href]");

    //Constructor de la clase 
    public AcademyBugsPage(){
        super(driver);
    }

    //Método para navegar a https://academybugs.com
    public void navigateToAcademyBugs(){
        navigateTo("https://academybugs.com/find-bugs/");
        //dismissAlerts();
    }

    //Método para seleccionar cualquier opción del NavBar
    public void clickSectionNavBar(){

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            element.click(); // once the element is clickable, you can click it

        } catch (Exception e) {
            // The element was not clickable, handle it appropriately
            e.printStackTrace();
        }
    }

}
