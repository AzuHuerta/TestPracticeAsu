package Pages;

public class SwagLabsPage extends BasePage {
    
    private String us = "//input[@id='user-name']";
    private String pwd = "//input[@id='password']";
    private String btn = "//input[@id='login-button']";


    private String btnBackPack = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String btnBike = "//button[@id='add-to-cart-sauce-labs-bike-light']";
    private String btnTShirt = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    private String btnJacket = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']";
    private String btnOneSie = "//button[@id='add-to-cart-sauce-labs-onesie']";
    private String btnShirt = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";

    private String cartBtn = "//a[@class='shopping_cart_link' and @href]";

    private String chkBtn = "//button[@id='checkout' and @href]";

    private String name = "";
    private String lName = "";
    private String codeP = "";

    private String btnCont = "//input[@id='continue' and @href]";
    private String btnFin = "//button[@id='finish' and @href]";

    private String order = "//div[@class='complete-text']";

    private String btnHome = "//button[@id='back-to-products']";

    private String item = "//div[normalize-space()='Sauce Labs Bike Light']";

    public SwagLabsPage(){
        super(driver);
    }

    public void navigateToSwag(){
        dismissAlerts();
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterCriteria(String user, String pass){
        write(us, user);
        write(pwd, pass);
    }

    public void clickLoginBtn(){
        clickWebElement(btn);
    }

    //Add items to Cart
    public void selectItems(){
        clickWebElement(btnBackPack);
        clickWebElement(btnBike);
        clickWebElement(btnTShirt);
        clickWebElement(btnJacket);
        clickWebElement(btnOneSie);
        clickWebElement(btnShirt);
    }

    public void clickToCart(){
        clickWebElement(cartBtn);
    }

    public void clickCheckOut(){
        clickWebElement(chkBtn);
    }

    public void fillFieldsInfo(){
        write(name, "Asuncion");
        write(lName, "Huerta");
        write(codeP, "45599");
    }

    public void clickContinue(){
        clickWebElement(btnCont);
    }

    public void finish(){
        clickWebElement(btnFin);
    }

    public boolean validateOrder(){
        return elementIsDisplayed(order);
    }

    public void backHome(){
        clickWebElement(btnHome);
    }

    public void mouseOver(){
        hoverOverElement(item);
    }

}
