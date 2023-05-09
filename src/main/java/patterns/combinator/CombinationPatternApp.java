package patterns.combinator;

import java.util.Date;
import java.util.List;

public class CombinationPatternApp {
  public static void main(String[] args) {
    Person jhon = new Person("Jhon Doe", "john@email.com", new Date(), Gender.MALE, "031985024379");

    PersonValidators.ValidationResult result = PersonValidators.isEmailValid()
        .and(PersonValidators.isEmailValid())
        .and(PersonValidators.isPhoneValid())
        .and(PersonValidators.isNotUnderAge())
        .apply(jhon);

    System.out.println(result);
  }
}
