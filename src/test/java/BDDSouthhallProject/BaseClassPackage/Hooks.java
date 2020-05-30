package BDDSouthhallProject.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setup(){
        driverFactory.openBrowser();
    }
    @After
    public void teaddown(){
        driverFactory.closeBrowser();
    }
}
