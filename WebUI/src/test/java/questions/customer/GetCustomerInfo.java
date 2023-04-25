package questions.customer;

import model.CustomerInfo;
import pageobjects.customer.messagenow.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("the displayed username")
public class GetCustomerInfo implements Question<CustomerInfo>{

    @Override
    public CustomerInfo answeredBy(Actor actor) {

        return new CustomerInfo("my name is ","kj",Double.valueOf("0000"),"khh","979879");
    }
}
