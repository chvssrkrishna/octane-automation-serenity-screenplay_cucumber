package tasks.customer.messagenow;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import user_interface.customer.messagenow.ChatPanel;
import user_interface.customer.messagenow.HomePage;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Message {

    public static Task sent(String message) {
        return Task.where(
                "{0} customer sent message " + message,
                Enter.theValue(message).into(ChatPanel.CHATPANEL_ENTER_YOUR_MESSAGE),
                Click.on(ChatPanel.CHATPANEL_SEND_BUTTON),
                WaitUntil.the(ChatPanel.CHATPANEL_SEND_BUTTON, isVisible()).forNoMoreThan(10).seconds()


        );

    }
}
