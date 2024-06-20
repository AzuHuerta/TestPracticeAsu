package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutCart extends BasePage {
    
    //private String checkButton = "//a[normalize-space()='View Cart' and @href]";
    //private String checkCart = "//a[normalize-space()='Checkout' and @href]";

    By elementLocator = By.xpath("//a[normalize-space()='View Cart' and @href]");
    By elementLocator2 = By.xpath("//a[normalize-space()='Checkout' and @href");

    public CheckOutCart(){
        super(driver);
    }

    //Método para CheckOutCart
    public void checkOutCart(){
       // clickElement(checkButton);
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            element.click(); // once the element is clickable, you can click it

        } catch (Exception e) {
            // The element was not clickable, handle it appropriately
            e.printStackTrace();
        }
    }

    public void checkOutShoppingCart(){
        //clickElement(checkCart);
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator2));
            element.click(); // once the element is clickable, you can click it

        } catch (Exception e) {
            // The element was not clickable, handle it appropriately
            e.printStackTrace();
        }
    }
}
