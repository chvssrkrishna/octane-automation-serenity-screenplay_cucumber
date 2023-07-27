package screenplay.customer.chatwindow.questions;

import model.CustomerContactInfo;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static screenplay.customer.chatwindow.user_interface.YourInfo.*;

@Subject("the displayed username")
public class AskFor {
    public static Question<CustomerContactInfo> contactInfo_from_your_info() {

        return actor -> new CustomerContactInfo(FIRST_NAME.resolveFor(actor).getValue(),LAST_NAME.resolveFor(actor).getValue(),PHONE.resolveFor(actor).getValue(),EMAIL.resolveFor(actor).getValue(), null);
    }
}
