package screenplay.customer.home;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import helpers.filereader.EnvironmentFileReader;
import screenplay.customer.home.tasks.Open;

public class Home_Page_Step_Definitions extends EnvironmentFileReader {

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {

        actor.attemptsTo(Open.chat_window_via_IconButton_Default_Department(button));
    }



}
