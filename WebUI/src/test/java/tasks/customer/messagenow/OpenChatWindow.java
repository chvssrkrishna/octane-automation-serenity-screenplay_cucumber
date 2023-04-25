package tasks.customer.messagenow;

import net.serenitybdd.screenplay.questions.Displayed;
import pageobjects.customer.messagenow.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenChatWindow {

    public static Task via(String button) {
       return Task.where(
                "{0} open Chat Window by Clicking on " + button,
                Click.on(HomePage.CHAT_ICON_BUTTON),
                OpenChatWindow.waitForElementToDisplayed(HomePage.CHATPANEL_IFRAME),
               Switch.toFrame(HomePage.CHATPANEL_IFRAME_NAME)

        );

    }

    public static Task sendMessage(String message) {
        return Task.where(
                "{0} customer sent message " + message,
                OpenChatWindow.waitForElementToDisplayed(HomePage.CHATPANEL_DEPARTMENT_SELECTOR),
                Click.on(HomePage.CHATPANEL_DEPARTMENT_SELECTOR),
                OpenChatWindow.waitForElementToDisplayed(HomePage.CHATPANEL_ENTER_YOUR_MESSAGE),
                Enter.theValue(message).into(HomePage.CHATPANEL_ENTER_YOUR_MESSAGE),
                Click.on(HomePage.CHATPANEL_SEND_BUTTON)
        );

    }

    public static Performable waitForElementToDisplayed(Target target ) {
        return Task.where("{0} wait till "+target.getName()+" visible",
                actor -> {
                    /*actor.attemptsTo(
                            WaitUntil.the(target, isVisible()).forNoMoreThan(10).seconds()
                    );*/
                    boolean isDisplayed = actor.asksFor(Displayed.of(target));

                }
        );
    }

}
