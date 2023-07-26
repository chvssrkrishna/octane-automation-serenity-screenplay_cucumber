package tasks.generic;

import com.github.javafaker.Faker;
import model.ContactInfo;

import java.util.Locale;

public class Generate {

    public static ContactInfo fakeCustomerContactInfo(){
        Faker faker = new Faker(new Locale("en-US"));
        String phoneNumber = String.valueOf((int) Math.floor(Math.random() * 799) + 200) + "5550" + String.valueOf((int) Math.floor(Math.random() * 99) + 100);
        String firstName = faker.name().firstName().replaceAll("[^a-zA-Z]", "");
        String lastName = faker.name().lastName().replaceAll("[^a-zA-Z]", "");
        String emailAddress = firstName+"."+lastName+"@test.carnowqa.com";
        String zipCode = faker.address().zipCodeByState("NY");
        return new ContactInfo(firstName,lastName,phoneNumber,emailAddress,zipCode);
    }

}
