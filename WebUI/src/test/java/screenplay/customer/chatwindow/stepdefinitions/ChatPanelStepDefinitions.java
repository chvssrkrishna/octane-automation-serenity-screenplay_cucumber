package screenplay.customer.chatwindow.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import screenplay.common.stepdefinitions.PageStepDefinitions;
import screenplay.customer.chatwindow.tasks.Send;

public class ChatPanelStepDefinitions extends PageStepDefinitions {

    @Then("{actor} send {string} message to dealer {string}")
    public void sendMessage(Actor actor, String message, String dealer) {

        actor.attemptsTo(Send.message(message));
       // actor.remember(Context.CUSTOMER_INFO, actor.asksFor(GetCustomerInfo.value()));
       // System.out.println(((CustomerInfo) actor.recall(Context.CUSTOMER_INFO)).getFirstName());
    }

}
