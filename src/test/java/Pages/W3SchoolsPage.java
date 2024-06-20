package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class W3SchoolsPage extends BasePage {

    private String src = "//img[@id='drag1']";
    private String trg = "//div[@id='div2']";

    WebElement sourceElement = driver.findElement(By.xpath(src));
    WebElement targetElement = driver.findElement(By.xpath(trg));

    
    public W3SchoolsPage(){
        super(driver);
    }

    public void navigateTo(){
        navigateTo("https://www.w3schools.com/html/html5_draganddrop.asp");
    }

    public void DragNDrop(){
        dragElement(sourceElement, targetElement);
    }
}
