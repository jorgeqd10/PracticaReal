package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasePage {

    @FindBy(css = "div.card")
    protected List<WebElement> card;
    @FindBy(xpath = "//a[contains(text(), 'Laptops')]")
    private WebElement laptopLink;

    protected WebDriverWait wait;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    }

    public void openDevicePage(){
        getDriver().manage().window().maximize();
        getDriver().get("https://www.demoblaze.com/index.html");
    }

    public void goToLaptopsPage(){
        wait.until(ExpectedConditions.visibilityOf(laptopLink)).click();
    }
}
