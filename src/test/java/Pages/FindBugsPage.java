package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindBugsPage extends BasePage{
    

    By elementLocator = By.xpath("//h3[normalize-space()='DNK Yellow Shoes' and @href]");

    //private String item1= "//h3[normalize-space()='DNK Yellow Shoes' and @href]";
    private String buttonCart= "//a[@id='ec_add_to_cart_5']";

    public FindBugsPage(){
        super(driver);
    }

    //Método para dar click al elemento
    public void clickItem(){
        //clickElement(item1);

         try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            element.click(); // once the element is clickable, you can click it

        } catch (Exception e) {
            // The element was not clickable, handle it appropriately
            e.printStackTrace();
        }

    }

    //Método para añadir al carrito
    public void addToCart(){
        clickElement(buttonCart);
    }
}
