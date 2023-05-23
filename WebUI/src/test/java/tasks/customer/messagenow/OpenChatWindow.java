package tasks.customer.messagenow;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import pageobjects.customer.messagenow.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

public class OpenChatWindow {

    public static Task via(String button) {
        return Task.where(
                "{0} open Chat Window by Clicking on " + button,
                Click.on(HomePage.CHAT_ICON_BUTTON),
                WaitForElement.visibility(HomePage.CHATPANEL_IFRAME, WaitConstants.getExplicitWait()),
                Switch.toFrame(HomePage.CHATPANEL_IFRAME_NAME)

        );

    }
}
