package screenplay.customer.home.tasks;

import helpers.constants.WaitConstants;
import helpers.wait.WaitForElement;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Presence;
import screenplay.customer.chatwindow.user_interface.ChatPanel;
import screenplay.customer.home.user_interface.HomePage;

import java.time.Duration;

public class Launch {

    private static Task clickIconButton(String button) {
        return Task.where(
                "{0} open Chat Window by Clicking on icon button " + button,
                Click.on(HomePage.ICON_BUTTON.of(button)),
                WaitForElement.visibility(HomePage.CHATPANEL_IFRAME, WaitConstants.getExplicitWait()),
                Switch.toFrame(HomePage.CHATPANEL_IFRAME_NAME)
        );

    }

    private static Task selectDepartment(String department) {
        return Task.where(
                "{0} selected department : " + department,
                Check.whether(Presence.of(ChatPanel.DEPARTMENT_SELECTOR.of(department).waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(ChatPanel.DEPARTMENT_SELECTOR.of(department))),
                WaitForElement.visibility(ChatPanel.CHATPANEL_ENTER_YOUR_MESSAGE, WaitConstants.getExplicitWait())
        );

    }

    public static Task chat_window_via_IconButton(String button) {
        return Task.where(
                "{0} open Chat Window via Icon Button " + button,
                Launch.clickIconButton(button)
        );

    }

    public static Task chat_window_via_IconButton_Default_Department(String button) {

        return Task.where(
                "{0} open Chat Window via Icon Button " + button,
                Launch.clickIconButton(button),
                Check.whether(Presence.of(ChatPanel.DEPARTMENT_SELECTOR_FORM.waitingForNoMoreThan(Duration.ofSeconds(WaitConstants.getExplicitWait())))).andIfSo(Click.on(ChatPanel.DEFAULT_DEPARTMENT_SELECTOR)),
                WaitForElement.visibility(ChatPanel.CHATPANEL_ENTER_YOUR_MESSAGE, WaitConstants.getExplicitWait())
        );

    }

    public static Task chat_window_IconButton_DepartmentSelector(String button,String department) {
        return Task.where(
                "{0} open Chat Window via Icon Button " + button+" and department "+department,
                Launch.clickIconButton(button),
                Launch.selectDepartment(department)
        );

    }


}
