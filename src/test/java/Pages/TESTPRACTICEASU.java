package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTPRACTICEASU {
    
    private WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        //Inicializar WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        //Cierra el Navegador después de la Prueba
        if (driver != null){
            driver.quit();
        }
    }
}
