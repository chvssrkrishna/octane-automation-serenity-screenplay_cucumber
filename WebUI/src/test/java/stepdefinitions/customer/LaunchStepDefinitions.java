package stepdefinitions.customer;

import helpers.FileReaderManager;
import model.Context;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import questions.customer.GetCustomerInfo;
import tasks.customer.messagenow.NavigateTo;
import tasks.customer.messagenow.OpenChatWindow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LaunchStepDefinitions extends PageStepDefinitions {

    @Given("{actor} launch customer home page of dealer {string}")
    public void researchingThings(Actor actor,String dealer) {
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(getCustomerUrl(dealer)));
    }

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {

        actor.attemptsTo(OpenChatWindow.via(button));
    }

    @Then("{actor} send {string} message to {string}")
    public void sendMessage(Actor actor,String message,String agent) {

        actor.attemptsTo(OpenChatWindow.sendMessage(message));
        actor.remember(Context.CUSTOMER_INFO, new GetCustomerInfo());
        // System.out.println(((CustomerInfo) actor.recall("customerInfo")).getFirstName());
    }

}
