package bridge.objects;

import lombok.*;

/**
 * Created by 3len1 on 2/14/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
