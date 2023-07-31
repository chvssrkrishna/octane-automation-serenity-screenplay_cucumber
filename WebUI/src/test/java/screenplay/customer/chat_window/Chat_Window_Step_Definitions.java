package screenplay.customer.chat_window;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import helpers.filereader.EnvironmentFileReader;
import screenplay.customer.chat_window.tasks.Send;

public class Chat_Window_Step_Definitions extends EnvironmentFileReader {

    @Then("{actor} send {string} message to dealer {string}")
    public void sendMessage(Actor actor, String message, String dealer) {

        actor.attemptsTo(Send.message(message));
       // actor.remember(Context.CUSTOMER_INFO, actor.asksFor(GetCustomerInfo.value()));
       // System.out.println(((CustomerInfo) actor.recall(Context.CUSTOMER_INFO)).getFirstName());
    }

}
