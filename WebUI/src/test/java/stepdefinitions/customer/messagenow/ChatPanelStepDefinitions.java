package stepdefinitions.customer.messagenow;

import io.cucumber.java.en.Then;
import model.Context;
import model.CustomerInfo;
import net.serenitybdd.screenplay.Actor;
import questions.customer.GetCustomerInfo;
import stepdefinitions.PageStepDefinitions;
import tasks.customer.messagenow.Message;

public class ChatPanelStepDefinitions extends PageStepDefinitions {

    @Then("{actor} send {string} message to dealer {string}")
    public void sendMessage(Actor actor, String message, String dealer) {

        actor.attemptsTo(Message.sent(message));
       // actor.remember(Context.CUSTOMER_INFO, actor.asksFor(GetCustomerInfo.value()));
       // System.out.println(((CustomerInfo) actor.recall(Context.CUSTOMER_INFO)).getFirstName());
    }

}
