package patterns.combinator;

import java.util.Date;

public record Person(
    String name,
    String email,
    Date birthDate,
    Gender gender,
    String phoneNumber
    ) {
}
