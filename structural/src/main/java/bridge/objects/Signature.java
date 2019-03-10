package bridge.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Created by 3len1 on 2/14/2019.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Signature {
    private String title;
    private Contact contact;

    @Override
    public String toString() {
        return contact == null ? title + "\n" :
                title + "\n" + contact.getLastName() + " " +
                        contact.getFirstName() + " \nEmail: " + contact.getEmail() +
                        "\n Phone: " + contact.getPhoneNumber() + "\n";

    }
}
