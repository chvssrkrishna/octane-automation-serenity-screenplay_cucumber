package stepdefinitions.customer;

import model.CustomerInfo;
import questions.customer.GetCustomerInfo;
import tasks.customer.messagenow.NavigateTo;
import tasks.customer.messagenow.OpenChatWindow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LaunchStepDefinitions {

    @Given("{actor} launch home page of dealer {string}")
    public void researchingThings(Actor actor,String dealer) {
        String url = "https://devint.carnow.com/dealers/37550/demo?clear=1";
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(url));
    }

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {

        actor.attemptsTo(OpenChatWindow.via(button));
    }

    @Then("{actor} send {string} message to {string}")
    public void sendMessage(Actor actor,String message,String agent) {

        actor.attemptsTo(OpenChatWindow.sendMessage(message));
        actor.remember("customerInfo", new GetCustomerInfo());
        // System.out.println(((CustomerInfo) actor.recall("customerInfo")).getFirstName());
    }

}
