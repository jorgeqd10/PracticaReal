package steps;

import PO.categories.Laptops;
import io.cucumber.java.en.And;

public class LaptopsSteps {

    Laptops laptops = new Laptops();

    @And("Get laptop price {int}")
    public void getPrice(int index) {
        laptops.getPrice(index);
    }
}
