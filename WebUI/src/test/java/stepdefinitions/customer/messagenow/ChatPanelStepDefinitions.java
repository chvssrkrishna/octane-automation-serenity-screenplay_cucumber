package stepdefinitions.customer.messagenow;

import io.cucumber.java.en.Then;
import model.Context;
import net.serenitybdd.screenplay.Actor;
import questions.customer.GetCustomerInfo;
import stepdefinitions.PageStepDefinitions;
import tasks.customer.messagenow.Message;

public class ChatPanelStepDefinitions extends PageStepDefinitions {

    @Then("{actor} send {string} message to {string}")
    public void sendMessage(Actor actor, String message, String agent) {

        actor.attemptsTo(Message.called(message));
        actor.remember(Context.CUSTOMER_INFO, new GetCustomerInfo());
        // System.out.println(((CustomerInfo) actor.recall("customerInfo")).getFirstName());
    }

}
