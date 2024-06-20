package Pages;


public class CheckBoxPage extends BasePage{
    
    private String checkBox = "//span[@class='rct-checkbox']";

    public CheckBoxPage(){
        super(driver);
    }

    public void navigateTo(){
        navigateTo("https://demoqa.com/checkbox");
    }

    public void selectCheckBox(){

        clickWebElement(checkBox);
        
        /*if(!driver.findElement(By.xpath(checkBox)).isSelected()){
            clickWebElement(checkBox);
        }*/
    }


    public boolean validateSelected(){
        
        return selectedWebElement(checkBox);
    }

}
