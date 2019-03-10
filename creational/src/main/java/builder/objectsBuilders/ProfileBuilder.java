package builder.objectsBuilders;

import builder.objects.Profile;

import java.time.Year;

/**
 * Created by 3len1 on 1/25/2019.
 */
public class ProfileBuilder {
    private String firstName;
    private String lastName;
    private String address;
    private Integer yearOfBirth;

    private ProfileBuilder() {
    }

    public static ProfileBuilder getProfileBuilder() {
        return new ProfileBuilder();
    }

    public ProfileBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ProfileBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ProfileBuilder withAddress() {
        this.address = AddressStringBuilder.getAddressStringBuilder();
        return this;
    }

    public ProfileBuilder withAge(int age) {
        this.yearOfBirth = Year.now().getValue() - age;
        return this;
    }


    public Profile build() {
        Profile profile = new Profile();
        profile.setFirstName(this.firstName);
        profile.setLastName(this.lastName);
        profile.setAddress(this.address);
        profile.setYearOfBirth(this.yearOfBirth);
        return profile;
    }

}
