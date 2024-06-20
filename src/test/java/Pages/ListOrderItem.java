package Pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ListOrderItem extends BasePage{

    By ElementLocatorList = By.xpath("//select[@id='sortfield']");

    String ElementLocator = "//select[@id='sortfield' and @href]";

    By cheaper = By.xpath("//a[@id='ec_add_to_cart_27' and @href]");

    
    public ListOrderItem(){
        super(driver);
    }

    public void navigateToFindBugs(){
        //navigateTo("https://www.google.com/");
        navigateTo("https://academybugs.com/find-bugs/");
    }

    public void selectListItem(){
        //clickElement(null);

        List<WebElement> result = new ArrayList<>();


        try{
            WebElement ListCheck = wait.until(ExpectedConditions.elementToBeClickable(ElementLocatorList));
            ListCheck.click();

            if (ListCheck.isSelected()) {
                
                result = driver.findElements(By.xpath(ElementLocator));
                result.get(1).click();
            }
            //Assert.assertTrue(ListCheck.isSelected());

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void selectSecondOption(){
        try{
            //WebElement ListCheck = wait.until(ExpectedConditions.elementToBeClickable(ElementLocatorList));

            List<WebElement> results = driver.findElements(By.xpath(ElementLocator));

            results.get(9).click();

           // ListCheck.click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void selectFirstOptionCheaper(){
        //clickElement(cheaper);
        try {

            WebElement itemCheap = wait.until(ExpectedConditions.elementToBeClickable(cheaper));
            itemCheap.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
