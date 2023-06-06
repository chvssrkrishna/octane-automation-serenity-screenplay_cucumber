package questions.customer;

import model.CustomerInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the displayed username")
public class GetCustomerInfo implements Question<CustomerInfo>{

    @Override
    public CustomerInfo answeredBy(Actor actor) {

        return new CustomerInfo("my name is ","kj",Double.valueOf("0000"),"khh","979879");
    }
}
