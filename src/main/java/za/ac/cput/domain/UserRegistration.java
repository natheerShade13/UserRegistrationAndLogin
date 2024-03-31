package za.ac.cput.domain;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserRegistration {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

}
