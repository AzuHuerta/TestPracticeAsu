package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WidgetsPage extends BasePage {
    

    //private String wgt = "";
    private String accordian = "//span[normalize-space()='Accordian' and @href]";
    private String autoComplete = "//span[normalize-space()='Auto Complete' and @href]";
    private String dataPicker = "//span[normalize-space()='Date Picker' and @href]";
    private String slider = "//span[normalize-space()='Slider' and @href]";
    private String progressBar = "//span[normalize-space()='Progress Bar' and @href]";
    private String tabs = "//span[normalize-space()='Tabs' and @href]";

    private String headerAccordian = "//div[@id='section1Heading']";
    private String textAccordian = "//div[@id='section1Content']";
    private String colorInputBox = "//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']";
    private String datePickOption = "//input[@id='dateAndTimePickerInput']";
    private String datePickDay = "//div[@aria-label='Choose Friday, May 17th, 2024']";
    private String datePickHour = "//li[contains(@class,'react-datepicker__time-list-item--selected')]";

    private String src = "//input[@type='range', value='20']";
    private String trg = "//input[@type='range', value='100']";

    WebElement sourceElement = driver.findElement(By.xpath(src));
    WebElement targetElement = driver.findElement(By.xpath(trg));

    public WidgetsPage(){
        super(driver);
    }


    public void navigateToDemoQA(){
        navigateTo("https://demoqa.com/widgets");
        //Thread.sleep(1500);
        dismissAlerts();
    }

    //Accordian
    public void selectAccordian(){
        clickWebElement(accordian);
        clickWebElement(headerAccordian);
    }

    public boolean validateShowText(){
        return elementIsDisplayed(textAccordian);
    }

    public boolean validateHideText(){
        clickWebElement(headerAccordian);
        return elementIsDisplayed(textAccordian);
    }


    //AutoComplete
    public void selectAutoComplete(){
        clickWebElement(autoComplete);
    }

    public void putColors(String color){
        write(colorInputBox, color);
    }

    public void selectColorOption(){

    }


    //DataPicker
    public void selectDataPicker(){
        clickWebElement(dataPicker);
    }

    public void selectDate(){
        clickWebElement(datePickOption);
        clickWebElement(datePickDay);
        clickWebElement(datePickHour);
    }


    //Slider
    public void selectSlider(){
        clickWebElement(slider);
    }

    public void dragSlider(){
        dragElement(sourceElement, targetElement);
    }

    //ProgressBar
    public void selectProgressBar(){
        clickWebElement(progressBar);

    }

    public void clickButton(){

    }

    //Tabs
    public void selectTabs(){
        clickWebElement(tabs);

    }

    public void navigateTabs(String Tab){

    }
  

}
