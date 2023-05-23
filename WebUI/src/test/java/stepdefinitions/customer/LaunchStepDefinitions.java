package stepdefinitions.customer;

import model.Context;
import questions.customer.GetCustomerInfo;
import stepdefinitions.PageStepDefinitions;
import tasks.customer.messagenow.ChatPanel;
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

        actor.attemptsTo(ChatPanel.sendMessage(message));
        actor.remember(Context.CUSTOMER_INFO, new GetCustomerInfo());
        // System.out.println(((CustomerInfo) actor.recall("customerInfo")).getFirstName());
    }

}
