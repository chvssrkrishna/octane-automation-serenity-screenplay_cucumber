package screenplay.navigation;

import helpers.filereader.EnvironmentFileReader;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import screenplay.navigation.tasks.NavigateTo;

public class NavigateStepDefinitions extends EnvironmentFileReader {
    @Given("{actor} launch customer home page of dealer {string}")
    public void launchCustomerHomePage(Actor actor,String dealer) {
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(getCustomerUrl(dealer)));
    }

}