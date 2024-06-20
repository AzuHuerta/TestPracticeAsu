package Pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuitPage extends BasePage {
    
    By elementLocator = By.xpath("//body/div[@id='sq-page']/div[@id='sq-content']/div[1]/div[1]/main[1]/article[1]/div[1]/section[1]/ul[1]/li[18]/div[1]/div[4]/span[1]/a[1] and @href");

    By colorSuit = By.xpath("//body/div[@id='sq-page']/div[@id='sq-content']/div[1]/div[1]/main[1]/article[1]/div[1]/section[1]/div[1]/div[3]/form[1]/div[6]/div[2]/ul[1]/li[1]/img[1]");
    
    By AddCartButton = By.xpath("//input[@value='ADD TO CART' and @href]");


    public SuitPage(){
        super(driver);
    }

    public void navigateToFindBugs(){
        navigateTo("https://academybugs.com/find-bugs/");
    }

    public void selectSuit(){
        try{
            WebElement item = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            item.click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void selectColorSuit(){
        try{
            WebElement color = wait.until(ExpectedConditions.elementToBeClickable(colorSuit));
            color.click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void AddtoCart(){
        try {
            WebElement add = wait.until(ExpectedConditions.elementToBeClickable(AddCartButton));
            add.click();
        } catch (Exception e) {
            //System.out.println("The WebElement Search Field couldn't be found.");
            e.printStackTrace();
        }
        
    }

}
