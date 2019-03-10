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
public class User {

    private String username;
    private String password;
    private String email;
    private Profile profile;

}
