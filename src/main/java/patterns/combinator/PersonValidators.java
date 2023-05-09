package patterns.combinator;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.Function;

public interface PersonValidators extends Function<Person, PersonValidators.ValidationResult> {

  static PersonValidators isPhoneValid() {
    return person -> person.phoneNumber().contains("031") ? ValidationResult.SUCCESS : ValidationResult.PHONE_INVALID;
  }

  static PersonValidators isEmailValid() {
    return person -> person.email().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_INVALID;
  }

  static PersonValidators isNotUnderAge() {
    Calendar cal = GregorianCalendar.getInstance();
    cal.set(2002, 1, 1);
    return person -> person.birthDate().before(cal.getTime()) ? ValidationResult.SUCCESS : ValidationResult.NOT_ADULT;
  }

  default PersonValidators and(PersonValidators other) {
    return person -> {
      ValidationResult result = this.apply(person);
      return ValidationResult.SUCCESS.equals(result) ? other.apply(person) : result;
    };
  }

  enum ValidationResult {
    SUCCESS,
    PHONE_INVALID,
    EMAIL_INVALID,
    NOT_ADULT
  }

}

