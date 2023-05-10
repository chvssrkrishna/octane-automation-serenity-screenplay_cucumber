package stepdefinitions.customer;

import helpers.FileReaderManager;
import model.Context;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import questions.customer.GetCustomerInfo;
import tasks.customer.messagenow.NavigateTo;
import tasks.customer.messagenow.OpenChatWindow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class LaunchStepDefinitions {

    @Given("{actor} launch home page of dealer {string}")
    public void researchingThings(Actor actor,String dealer) {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String environment = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("environment");
        String env= FileReaderManager.getInstance().getDealerConfigFileReader(environment).getDealerID(dealer);
        System.out.println("env : "+env);
        String url = "https://devint.carnow.com/dealers/37550/demo?clear=1";
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(url));
    }

    @When("{actor} open chat panel from {string} Icon Button")
    public void openChatPanel(Actor actor,String button) {

        actor.attemptsTo(OpenChatWindow.via(button));
    }

    @Then("{actor} send {string} message to {string}")
    public void sendMessage(Actor actor,String message,String agent) {

        actor.attemptsTo(OpenChatWindow.sendMessage(message));
        actor.remember(Context.CUSTOMER_INFO, new GetCustomerInfo());
        // System.out.println(((CustomerInfo) actor.recall("customerInfo")).getFirstName());
    }

}
