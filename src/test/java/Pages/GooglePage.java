package Pages;


public class GooglePage extends BasePage {
    

    private String SearchButton = "//input[@value='Buscar con Google']";
    private String searchTextField = "//textarea[@id='APjFqb']";


    public GooglePage(){
        super(driver);
    }
    
    
    public void navigateToGoogle(){
        navigateTo("https://www.google.com/");
    }

    public void clickButtonSearch(){
        clickWebElement(SearchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return textFromElement(searchTextField);
    }

    public void clickFirstResult(String firstResultLink){

        clickWebElement(firstResultLink);
    
        /*if(Assert.notNull("https://es.wikipedia.org/wiki/Canis_familiaris", firstResultLink) != null){
            clickElement(firstResult);
        }*/
    }
    

}
