package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {
    //Constructor de la clase
    public Hooks(){
        super(driver);
    }

    //Acción a realizar postError
    @After
    public void tearDown(Scenario scenario){
        //Al terminar un escenaro, si se encuentra un error se tomará un screenshot y se añadirá al reporte
        if(scenario.isFailed()){
            scenario.log("Scenario failing, please refer to the image attached to this report");
            final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of the Error");
        }
    }

}
