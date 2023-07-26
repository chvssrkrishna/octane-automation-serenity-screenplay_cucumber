package stepdefinitions.customer.messagenow;

import io.cucumber.java.en.Then;
import model.Context;
import model.CustomerInfo;
import net.serenitybdd.screenplay.Actor;
import questions.customer.GetCustomerInfo;
import stepdefinitions.PageStepDefinitions;
import tasks.customer.messagenow.Message;
import tasks.customer.messagenow.YourInfo;
import tasks.generic.ContactInfo;

public class YourInfoStepDefinitions extends PageStepDefinitions {

    @Then("{actor} submit contact information")
    public void submitContactInformation(Actor actor) {
        CustomerInfo customerInfo = ContactInfo.generateFakeCustomerContactInfo();
        actor.remember(Context.CUSTOMER_INFO, customerInfo);
        actor.attemptsTo(YourInfo.submitContactInfo(customerInfo));
        //System.out.println("Customer Name : "+((CustomerInfo) actor.recall(Context.CUSTOMER_INFO)).getFirstName());
    }
}
