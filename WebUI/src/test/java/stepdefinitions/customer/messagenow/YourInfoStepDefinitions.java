package stepdefinitions.customer.messagenow;

import io.cucumber.java.en.Then;
import model.Context;
import model.ContactInfo;
import net.serenitybdd.screenplay.Actor;
import stepdefinitions.PageStepDefinitions;
import tasks.customer.messagenow.Send;
import tasks.generic.Generate;

public class YourInfoStepDefinitions extends PageStepDefinitions {

    @Then("{actor} submit contact information")
    public void submitContactInformation(Actor actor) {
        ContactInfo contactInfo = Generate.fakeCustomerContactInfo();
        actor.remember(Context.CONTACT_INFO, contactInfo);
        actor.attemptsTo(Send.contactInfo(contactInfo));
        //sytem.out.println("Customer Name : "+((ContactInfo) actor.recall(Context.CONTACT_INFO)).getFirstName());
    }
}
