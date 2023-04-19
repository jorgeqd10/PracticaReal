package steps;

import PO.BasePage;
import com.paulhammant.ngwebdriver.ByAngularModel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BaseSteps {
    BasePage basepage = new BasePage();


    @Given("I open device page")
    public void iOpenDevicePage() {
        basepage.openDevicePage();
    }


    @Then("Go to laptops page")
    public void goToLaptopsPage() throws InterruptedException {
        basepage.goToLaptopsPage();
        Thread.sleep(2000);

    }
}
