package questions.customer;

import model.CustomerInfo;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static user_interface.customer.messagenow.YourInfo.*;

@Subject("the displayed username")
public class GetCustomerInfo {
    public static Question<CustomerInfo> value() {

        return actor -> new CustomerInfo(FIRST_NAME.resolveFor(actor).getValue(),LAST_NAME.resolveFor(actor).getValue(),PHONE.resolveFor(actor).getValue(),EMAIL.resolveFor(actor).getValue(), null);
    }
}
