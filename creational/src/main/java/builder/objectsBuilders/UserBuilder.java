package builder.objectsBuilders;

import builder.objects.Profile;
import builder.objects.User;
import builder.validation.ValidationUtils;

import java.util.Optional;

/**
 * Created by 3len1 on 1/25/2019.
 */
public class UserBuilder {

    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]*$";
    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

    private String username;
    private String password;
    private String email;
    private Profile profile;

    private UserBuilder() {
    }

    public static UserBuilder getUserBuilder(String username, String password) {
        UserBuilder builder = new UserBuilder();
        ValidationUtils.validate(username, "username", true, 50, Optional.of(USERNAME_PATTERN));
        builder.username = username;
        ValidationUtils.validate(password, "password", true, 50, Optional.of(PASSWORD_PATTERN));
        builder.password = password;
        return builder;
    }

    public UserBuilder withEmail(String email) {
        ValidationUtils.validate(email, "email", false, 50, Optional.of(MAIL_PATTERN));
        this.email = email;
        return this;
    }

    public UserBuilder withProfile(String firstName, String lastName, Integer age) {
        profile = ProfileBuilder.getProfileBuilder()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAge(age)
                .withAddress()
                .build();
        return this;
    }

    public User build() {
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(this.password);
        user.setEmail(this.email);
        user.setProfile(this.profile);
        return user;
    }


}
