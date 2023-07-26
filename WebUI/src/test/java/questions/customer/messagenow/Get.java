package questions.customer.messagenow;

import model.ContactInfo;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static user_interface.customer.messagenow.YourInfo.*;

@Subject("the displayed username")
public class Get {
    public static Question<ContactInfo> contactInfo_from_your_info() {

        return actor -> new ContactInfo(FIRST_NAME.resolveFor(actor).getValue(),LAST_NAME.resolveFor(actor).getValue(),PHONE.resolveFor(actor).getValue(),EMAIL.resolveFor(actor).getValue(), null);
    }
}
