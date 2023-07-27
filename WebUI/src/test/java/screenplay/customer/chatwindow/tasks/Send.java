package screenplay.customer.chatwindow.tasks;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import model.CustomerContactInfo;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.customer.chatwindow.user_interface.ChatPanel;
import screenplay.customer.chatwindow.user_interface.YourInfo;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Send {

    public static Task message(String message) {
        return Task.where(
                "{0} customer sent message " + message,
                Enter.theValue(message).into(ChatPanel.CHATPANEL_ENTER_YOUR_MESSAGE),
                Click.on(ChatPanel.CHATPANEL_SEND_BUTTON),
                WaitUntil.the(ChatPanel.CHATPANEL_SEND_BUTTON, isVisible()).forNoMoreThan(10).seconds()


        );

    }
    public static Task contactInfo(CustomerContactInfo customerInfo) {
        return Task.where(
                "{0} submit contact info",
                Click.on(ChatPanel.YOUR_INFO_BUTTON),
                WaitForElement.visibility(YourInfo.SUBMIT, WaitConstants.getExplicitWait()),
                Enter.theValue(customerInfo.getFirstName()).into(YourInfo.FIRST_NAME),
                Enter.theValue(customerInfo.getLastName()).into(YourInfo.LAST_NAME),
                Enter.theValue(customerInfo.getPhone()).into(YourInfo.PHONE),
                Enter.theValue(customerInfo.getEmail()).into(YourInfo.EMAIL),
                Click.on(YourInfo.SUBMIT),
                WaitUntil.the(YourInfo.SUBMIT, isNotVisible()).forNoMoreThan(10).seconds()
        );

    }

}
