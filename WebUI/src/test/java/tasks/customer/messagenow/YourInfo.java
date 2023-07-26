package tasks.customer.messagenow;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import model.CustomerInfo;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import user_interface.customer.messagenow.ChatPanel;
import user_interface.customer.messagenow.HomePage;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class YourInfo {

    public static Task submitContactInfo(CustomerInfo customerInfo) {
            return Task.where(
                    "{0} submit contact info",
                    Click.on(ChatPanel.YOUR_INFO_BUTTON),
                    WaitForElement.visibility(user_interface.customer.messagenow.YourInfo.SUBMIT, WaitConstants.getExplicitWait()),
                    Enter.theValue(customerInfo.getFirstName()).into(user_interface.customer.messagenow.YourInfo.FIRST_NAME),
                    Enter.theValue(customerInfo.getLastName()).into(user_interface.customer.messagenow.YourInfo.LAST_NAME),
                    Enter.theValue(customerInfo.getPhone()).into(user_interface.customer.messagenow.YourInfo.PHONE),
                    Enter.theValue(customerInfo.getEmail()).into(user_interface.customer.messagenow.YourInfo.EMAIL),
                    Click.on(user_interface.customer.messagenow.YourInfo.SUBMIT),
                    WaitUntil.the(user_interface.customer.messagenow.YourInfo.SUBMIT, isNotVisible()).forNoMoreThan(10).seconds()
            );

    }

}
