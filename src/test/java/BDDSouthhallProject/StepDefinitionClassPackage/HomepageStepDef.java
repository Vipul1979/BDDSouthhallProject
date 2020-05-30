package BDDSouthhallProject.StepDefinitionClassPackage;

import BDDSouthhallProject.PageobjectClassPackage.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageStepDef {
    Homepage homepage = new Homepage();

    @Given("^user is on south hall travel web site home page$")
    public void user_is_on_south_hall_travel_web_site_home_page() throws Throwable {
        homepage.assertHomePageURL();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user click on departure tab and choose Heathrow$")
    public void user_click_on_departure_tab_and_choose_Heathrow() throws Throwable {
     //   homepage.departfrom();
       // homepage.departAutofill();
        homepage.departFrom();
    }

    @When("^user click on destination tab and choose Ahmedabad$")
    public void user_click_on_destination_tab_and_choose_Ahmedabad() throws Throwable {
    homepage.destinationTo();
    }

    @When("^user select departing date (\\d+)st May$")
    public void user_select_departing_date_th_May(int arg1) throws Throwable {
       homepage.dateFrom();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user select return date (\\d+)th May$")
    public void user_select_return_date_th_May(int arg1) throws Throwable {
       homepage.returnDate();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user select (\\d+) adult$")
    public void user_select_adult(int arg1) throws Throwable {
        homepage.selectPassenger();
    }

    @When("^user choose on Air India air line$")
    public void user_choose_on_Emirates_air_line() throws Throwable {
       homepage.setAirlines();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user click on search button$")
    public void user_click_on_search_button() throws Throwable {
       homepage.search();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user can see search result page$")
    public void user_can_see_search_result_page() throws Throwable {
        homepage.assertResultpageURL();
        // Write code here that turns the phrase above into concrete actions
    }

}
