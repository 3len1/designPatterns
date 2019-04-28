package proxy.objects;

import lombok.*;
import proxy.enums.Role;

/**
 * Created by 3len1 on 4/24/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private Role role;

}
