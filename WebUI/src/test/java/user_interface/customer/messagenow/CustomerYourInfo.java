package user_interface.customer.messagenow;

import net.serenitybdd.screenplay.targets.Target;

public class CustomerYourInfo {

    //Customer Your Info Page Objects
    public static Target FIRST_NAME = Target.the("Customer First Name").locatedBy("input[name=firstName]");
    public static Target LAST_NAME = Target.the("Customer Last Name").locatedBy("input[name=lastName]");
    public static Target PHONE = Target.the("Customer Phone Number").locatedBy("input[name=phone]");
    public static Target EMAIL = Target.the("Customer Email").locatedBy("input[name=email]");
    public static Target SUBMIT = Target.the("Customer Contact Submit Button").locatedBy("div[data-testid='mn-slideout_customer_info_form'] form button");
    public static Target DISCLAIMER = Target.the("Customer Contact Info Disclaimer").locatedBy("div[data-testid='mn-slideout_customer_info_form-disclaimer']");


}
