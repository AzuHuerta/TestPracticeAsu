package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases
     */
    protected static WebDriver driver;

    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     

     By ElementLocator = By.xpath("");

     /*
     * Declaración de una variable estática 'action' de tipo Actions
     * Esta variable nos ayudará para realizar movimientos lógicos sobre los componentes del DOM
     */
     protected static Actions action;

     /* 
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
    */

    static {
        WebDriverManager.chromedriver().setup();
        //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
        action = new Actions(driver);
    }

    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como argumento.
     */
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    //Cerrar el Navegador
    public static void closeBrowser(){
        driver.quit();
    }

    //Método para Navegar a la URL de la página
    public static void navigateTo(String url){
        driver.get(url);
    }

    //Funcion para devolver texto de un webElement, sino tira excepcion 
    public String textFromElement(String locator){
        return find(locator).getText();
        //return find(locator).getText().toString();
    }
    
    //Método para revocar alertas del DOM y continuar trabajando (acciones tipo msjs, sweetalerts, etc)
    public void dismissAlerts(){
        try{
            driver.switchTo().alert().dismiss();
        }
        catch(NoAlertPresentException e){
            e.printStackTrace();
        }
    }

    //Método para encnontrar un WebElement por su Xpath utilizando un locator, esperando esté en el DOM
    private WebElement find(String locator){
        //Realizar accion de clean desde funcion sin necesidad de mandarla llamar cada vez que realiza movimiento
          return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    //Método para seleccionar un campo
    public void clickElement(String locator){
        find(locator).click();
    }

    //Método para hacer click cuando el elemento tarda demasiado
    public void clickWebElement(String locatorXPath){

        ElementLocator = By.xpath(locatorXPath);
        try {
            WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(ElementLocator));
            Element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     //Método para saber si un elemento está seleccionado
     public boolean selectedWebElement(String locatorXPath){

        //boolean status = driver.findElement(By.xpath(locatorXPath)).isSelected();
        
        //String Result = "";
        //try {
            //if(status){
                //Result = "The element is Selected";
            //}
            
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}

        return find(locatorXPath).isSelected();

        //WebElement locator = driver.findElement(By.xpath(locatorXPath));
        //return locator.isSelected();
    }

    //Funcion Booleana para devolver V o F
    public boolean elementIsDisplayed(String locator){
        // devuelve un V o F si el locator es mostrado
        return find(locator).isDisplayed();
    }
    
    //Método para escribir en campos de Texto
    public void write(String locator, String keysToSend){

        try {
            //Limpiar campo antes de 
        find(locator).clear();
        //Pasar argumento
        find(locator).sendKeys(keysToSend);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    //Método para escribir en campos de Texto
    public void clearField(String locator){

        try {
            //Limpiar campo antes de 
        find(locator).clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

     //funcion que realiza paso de mouse sobre x elemento
     public void hoverOverElement(String locator){
        action.moveToElement(find(locator));
    }

    //funcion que realiza doble click sobre elemento
    public void dobleClick(String locator){
        action.doubleClick(find(locator));
    }

    //funcion que realiza click derecho sobre elemento
    public void rightClick(String locator){
        action.doubleClick(find(locator));
    }

    //funcion para arrastar un elemento web
    public void dragElement(WebElement source, WebElement target){
        action.dragAndDrop(source, target).build().perform();
    }

    //TR - filas/row , TD - Columnas/column
    //Funcion para obtener un valor de Tabla
    public String getValueFromTable(String locator, int row, int column){
        //String = Xpath de la tabla entera y posterior concatenar
        String cellNeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        //regresa el texto de la celda seleccionada
        return find(cellNeed).getText();
    }

    //Funcion para cuando la tabla es editable y se establece un texto
    public void setValueOnTable(String locator, int row, int column, String stringToSend){
        String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        //mandar texto tecleado
        find(cellToFill).sendKeys(stringToSend);
    }

    //Funcion para hacer switch a otros frames
    public void switchToiFrame(int iFrameIndex){
        //Forma de llegar al iFrame y cambiar entre iFrames
        driver.switchTo().frame(iFrameIndex);
    }

    //Funcion para regresar al frame padre
    public void switchToParentFrame(){
        //Forma de regresar al Frame padre
        driver.switchTo().parentFrame();
    }


    //Método para un DropDown x Valor de Texto
    public void selectFromDropDownByValue(String locator, String value){
        Select dropDown = new Select(find(locator));
        dropDown.selectByValue(value);
    }

    //Método para un DropDown x Valor asociado al índice [posición]
    public void selectFromDropDownByIndex(String locator, Integer index){
        Select dropDown = new Select(find(locator));
        dropDown.selectByIndex(index);
    }

    //Método para determinar y retornar la cantidad de elementos en DropDown
    public int selectDropDownSize(String locator){
        //Instanciar el DropDown con objeto select para habilitar opciones de la lista
        Select dropDown = new Select(find(locator));
        // Generar lista dada x objetos del tipo WebElement
        List<WebElement> dropDownOptions = dropDown.getOptions();
        //Devolvemos el numero entero sobre las opciones que tiene el DropDown
        return dropDownOptions.size();
    }

    //Método para devolver todos los valores en texto del DropDown
    public List<String> getDropDonwValues(String locator){
        //Instanciar el DropDown con objeto select para habilitar opciones de la lista
        Select dropDown = new Select(find(locator));
        // Generar lista dada x objetos del tipo WebElement
        List<WebElement> dropDownOptions = dropDown.getOptions();
        //Lista dada x objetos de tipo String para capturar el valor del texto de los elementos de la lista
        List<String> valuesText = new ArrayList<>();

        //Capturamos cada valor de texto en la lista
        for(WebElement option: dropDownOptions){
            valuesText.add(option.getText());
        }

        return valuesText;
    }

}
