package tasks.customer.messagenow;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pageobjects.customer.messagenow.HomePage;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChatPanel {

    public static Task sendMessage(String message) {
        return Task.where(
                "{0} customer sent message " + message,
                Check.whether(Presence.of(HomePage.CHATPANEL_DEPARTMENT_SELECTOR.waitingForNoMoreThan(Duration.ofSeconds(10)))).andIfSo(Click.on(HomePage.CHATPANEL_DEPARTMENT_SELECTOR)),
                WaitForElement.visibility(HomePage.CHATPANEL_ENTER_YOUR_MESSAGE, WaitConstants.getExplicitWait()),
                Enter.theValue(message).into(HomePage.CHATPANEL_ENTER_YOUR_MESSAGE),
                Click.on(HomePage.CHATPANEL_SEND_BUTTON),
                WaitUntil.the(HomePage.CHATPANEL_SEND_BUTTON, isVisible()).forNoMoreThan(10).seconds()


        );

    }
}
