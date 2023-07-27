package screenplay.customer.home.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import screenplay.common.stepdefinitions.PageStepDefinitions;
import screenplay.customer.home.tasks.Launch;

public class LaunchStepDefinitions extends PageStepDefinitions {

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {

        actor.attemptsTo(Launch.chat_window_via_IconButton_Default_Department(button));
    }



}
