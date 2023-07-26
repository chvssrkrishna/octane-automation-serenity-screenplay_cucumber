package tasks.customer.messagenow;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import user_interface.customer.messagenow.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import java.time.Duration;

public class ChatPanel {

    public static Task clickIconButton(String button) {
        return Task.where(
                "{0} open Chat Window by Clicking on icon button " + button,
                Click.on(HomePage.ICON_BUTTON.of(button)),
                WaitForElement.visibility(HomePage.CHATPANEL_IFRAME, WaitConstants.getExplicitWait()),
                Switch.toFrame(HomePage.CHATPANEL_IFRAME_NAME)
        );

    }

    public static Task selectDepartment(String department) {
        return Task.where(
                "{0} selected department : " + department,
                Check.whether(Presence.of(HomePage.CHATPANEL_DEPARTMENT_SELECTOR.of(department).waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(HomePage.CHATPANEL_DEPARTMENT_SELECTOR.of(department))),
                WaitForElement.visibility(user_interface.customer.messagenow.ChatPanel.CHATPANEL_ENTER_YOUR_MESSAGE, WaitConstants.getExplicitWait())
        );

    }

    public static Task openVia(String button) {
        return Task.where(
                "{0} open Chat Window by Clicking on " + button,
                ChatPanel.clickIconButton(button),
                ChatPanel.selectDepartment("New Car Sales")
        );

    }


}
