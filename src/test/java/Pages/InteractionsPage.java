package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InteractionsPage extends BasePage{
    
    private String src = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']";
    private String trg = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Three']";

    WebElement sourceElement = driver.findElement(By.xpath(src));
    WebElement targetElement = driver.findElement(By.xpath(trg));


    public InteractionsPage(){
        super(driver);
    }


    public void navigateToSortable(){
        navigateTo("https://demoqa.com/sortable");
        dismissAlerts();
    }

    public void dragOption(){
        dragElement(sourceElement, targetElement);
    }



}
