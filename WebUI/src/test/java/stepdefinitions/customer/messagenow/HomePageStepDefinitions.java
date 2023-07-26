package stepdefinitions.customer.messagenow;

import stepdefinitions.PageStepDefinitions;
import tasks.generic.NavigateTo;
import tasks.customer.messagenow.ChatPanel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class HomePageStepDefinitions extends PageStepDefinitions {

    @Given("{actor} launch customer home page of dealer {string}")
    public void launchCustomerHomePage(Actor actor,String dealer) {
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(getCustomerUrl(dealer)));
    }

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {

        actor.attemptsTo(ChatPanel.openVia(button));
    }



}
