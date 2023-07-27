package screenplay.customer.chatwindow.stepdefinitions;

import io.cucumber.java.en.Then;
import model.Context;
import model.CustomerContactInfo;
import net.serenitybdd.screenplay.Actor;
import screenplay.common.stepdefinitions.PageStepDefinitions;
import screenplay.common.tasks.Fake_Customer;
import screenplay.customer.chatwindow.tasks.Send;

public class YourInfoStepDefinitions extends PageStepDefinitions {

    @Then("{actor} submit contact information")
    public void submitContactInformation(Actor actor) {
        CustomerContactInfo customerContactInfo = Fake_Customer.contactInfo();
        actor.remember(Context.CUSTOMER_CONTACT_INFO, customerContactInfo);
        actor.attemptsTo(Send.contactInfo(customerContactInfo));
        //sytem.out.println("Customer Name : "+((ContactInfo) actor.recall(Context.CONTACT_INFO)).getFirstName());
    }
}
