package builder.objects;

import lombok.*;

/**
 * Created by 3len1 on 1/25/2019.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private String firstName;
    private String lastName;
    private String address;
    private Integer yearOfBirth;

}
