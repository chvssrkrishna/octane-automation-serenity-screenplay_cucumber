package screenplay.common.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import screenplay.common.tasks.NavigateTo;

public class NavigateStepDefinitions extends PageStepDefinitions {
    @Given("{actor} launch customer home page of dealer {string}")
    public void launchCustomerHomePage(Actor actor,String dealer) {
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(getCustomerUrl(dealer)));
    }

}
