package BDDSouthhallProject.PageobjectClassPackage;

import BDDSouthhallProject.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homepage extends DriverFactory {

    @FindBy(id = "DestinationFrom1")
    WebElement departfromBox;
    @FindBy(id = "AdultCnt")
    WebElement audltpassenger;

    @FindBy(id = "DestinationTo")
    WebElement destination;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[6]/td[1]/a")
    WebElement departureDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")
    WebElement returnDate;

    @FindBy(id = "AdultCnt")
    WebElement adultTwo;

    @FindBy(id = "AirLineCode1")
    WebElement airlines;

    @FindBy(id = "button_flight_search")
    WebElement searchButton;

    public void selectPassenger(){
        Select select = new Select(audltpassenger);
        select.selectByValue("2");

    }

    public void departFrom() throws InterruptedException {
        departfromBox.sendKeys(" Heathrow Airport (LHR), UK");
//        departfromBox.sendKeys("London");
//        List<WebElement> departairports = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
//
//        Thread.sleep(2000);
//        for (WebElement departairpot : departairports
//        ) {
//            //System.out.println(departairpot.getText());
//            System.out.println(departairpot.getAttribute("id"));
//
////           if (departairpot.getText().contains("Heathrow"));{
////               Thread.sleep(2000);
////               departairpot.click();
//                 break;
//        }
    }
    public void destinationTo(){
        destination.sendKeys("Sardar Vallabhbhai Patel Intl  (AMD), India");
    }

    public void dateFrom() throws InterruptedException {
        WebElement depart = driver.findElement(By.id("deptdt"));
        depart.click();
        Thread.sleep(1000);
        departureDate.click();
    }
    public void returnDate() throws InterruptedException {
        WebElement returndt = driver.findElement(By.id("rtndt"));
        returndt.click();
        Thread.sleep(1000);
        returnDate.click();
    }
    public void adultselect() throws InterruptedException {
        Select select = new Select(adultTwo);
        Thread.sleep(1000);
        select.selectByIndex(1);
    }
    public void setAirlines() throws InterruptedException {
        Select sel = new Select(airlines);
        Thread.sleep(1000);
        sel.selectByVisibleText("Air India");
    }
    public void search() throws InterruptedException {
        Thread.sleep(1000);
        searchButton.click();
    }
    public void assertHomePageURL(){
        String actualHomePageURL = driver.getCurrentUrl();
        Assert.assertThat(actualHomePageURL, Matchers.containsString("https://www.southalltravel.co.uk/"));
    }
    public void assertResultpageURL(){
        String resultpageURL = driver.getCurrentUrl();
        Assert.assertThat(resultpageURL,Matchers.containsString("https://www.southalltravel.co.uk/norec.aspx"));
    }
}
